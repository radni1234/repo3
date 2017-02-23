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

	public Rn save(Rn obj) {
		Double sumIznos = 0.0;
		Double sumKolicina = 0.0;
		Double sumkolicinaKwh = 0.0;
		Double sumEmisija = 0.0;
		
		
		List<RnStavke> rnStavkeList = obj.getRnStavke();		
		
		for (RnStavke r : rnStavkeList) {
			r.setRn(obj);
		    obj.addRnStavke(r);
		    
		    if (r.getBrojiloVrstaKolone().getKolonaTip().getId() == 1){
		    	sumIznos = sumIznos + r.getVrednost();
		    } else if (r.getBrojiloVrstaKolone().getKolonaTip().getId() == 2){
		    	sumKolicina = sumKolicina + r.getVrednost();
		    	sumkolicinaKwh = sumkolicinaKwh + (r.getVrednost() * obj.getEnergent().getKwhJm());
		    	sumEmisija = sumEmisija + (r.getVrednost() * obj.getEnergent().getEmisija());
		    } 
		}
				
		obj.setIznos(sumIznos);
		obj.setKolicina(sumKolicina);
		obj.setKolicinaKwh(sumkolicinaKwh);
		obj.setEmisijaCo2(sumEmisija);
		
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
	public Long proveriRacun(Date datumr, Long brojilo_id){
		return dao.proveriRacun(datumr, brojilo_id);
	}
}
