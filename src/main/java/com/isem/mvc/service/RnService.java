package com.isem.mvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.RnDao;
import com.isem.mvc.dao.RnProcDaoCustomImpl;
import com.isem.mvc.model.Rn;
import com.isem.mvc.model.RnStavke;
import com.isem.mvc.tab.RnProc;

@Service
public class RnService {
	@Autowired
	private RnDao dao;
	
	@Autowired
	private RnProcDaoCustomImpl daoProc;
		
	public Rn findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Rn> findRnByObjekat(Long id){
		return dao.findRnByObjekat(id);
	}

	public List<Rn> findAll () {
		return dao.findAll();
	}

	public Page<Rn> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<RnProc> findAllProc () {
		return daoProc.vratiRn();
	}
	
	public List<RnProc> findAllObjProc (Long obj_id) {
		return daoProc.vratiRnObj(obj_id);
	}

	public Rn save(Rn rn) {
		Double sumIznos = 0.0;
		Double sumKolicina = 0.0;
		Double sumkolicinaKwh = 0.0;
		Double sumkolicinaKwhPov = 0.0;
		Double sumkolicinaKwhZap = 0.0;
		Double sumkolicinaKwhKor = 0.0;
		Double sumEmisija = 0.0;
		
		
		List<RnStavke> rnStavkeList = rn.getRnStavke();		
		
		for (RnStavke r : rnStavkeList) {
			r.setRn(rn);
			rn.addRnStavke(r);
		    
		    if (r.getBrojiloVrstaKolone().getKolonaTip().getId() == 1){
		    	sumIznos = sumIznos + r.getVrednost();
		    } else if (r.getBrojiloVrstaKolone().getKolonaTip().getId() == 2){
		    	sumKolicina = sumKolicina + r.getVrednost();
		    	sumkolicinaKwh = sumkolicinaKwh + (r.getVrednost() * rn.getEnergent().getKwhJm());		    	
		    	sumEmisija = sumEmisija + (r.getVrednost() * rn.getEnergent().getEmisija());
		    } 
		}
				
		rn.setIznos(sumIznos);
		rn.setKolicina(sumKolicina);
		rn.setKolicinaKwh(sumkolicinaKwh);
		rn.setKolicinaKwhPov(sumkolicinaKwhPov / rn.getBrojilo().getObjekat().getGrejPoKorisna());
		rn.setKolicinaKwhZap(sumkolicinaKwhZap / rn.getBrojilo().getObjekat().getGrejZa());
		rn.setKolicinaKwhKor(sumkolicinaKwhKor / rn.getBrojilo().getObjekat().getOpBrKor());
		rn.setEmisijaCo2(sumEmisija);
		
		return dao.save(rn);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
	public Long proveriRacun(Date datumr, Long brojilo_id){
		return dao.proveriRacun(datumr, brojilo_id);
	}
}
