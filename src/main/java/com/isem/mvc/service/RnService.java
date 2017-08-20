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

		
		List<RnStavke> rnStavkeList = rn.getRnStavke();		
		
		for (RnStavke r : rnStavkeList) {
			r.setRn(rn);
			rn.addRnStavke(r);
		    
		    if (r.getBrojiloVrstaKolone().getKolonaTip().getId() == 1){
		    	if(r.getVrednost() != null){
		    		sumIznos = sumIznos + r.getVrednost();
		    	}
		    } else if (r.getBrojiloVrstaKolone().getKolonaTip().getId() == 2){
		    	if(r.getVrednost() != null){
		    		sumKolicina = sumKolicina + r.getVrednost();
		    	}
		    } 
		}
				
		rn.setIznos(sumIznos);
		rn.setKolicina(sumKolicina);
		
//		if (rn.getEnergent().getKwhJm() != null) {
//			rn.setKolicinaKwh(sumKolicina * rn.getEnergent().getKwhJm());
//		}
//		
//		if (rn.getEnergent().getPrimarnaEnergija() != null) {
//			rn.setKolicinaPrimEne(sumKolicina * rn.getEnergent().getPrimarnaEnergija());
//		}
//		
//		if (rn.getEnergent().getFinalnaEnergija() != null) {
//			rn.setKolicinaFinEne(sumKolicina * rn.getEnergent().getFinalnaEnergija());
//		}
//		
//		if (rn.getEnergent().getEmisija() != null) {
//			rn.setEmisijaCo2(sumKolicina * rn.getEnergent().getEmisija());
//		}
//		
//		if (rn.getBrojilo().getObjekat().getGrejPoKorisna() != null) {
//			rn.setKolicinaKwhPov(rn.getKolicinaKwh() / rn.getBrojilo().getObjekat().getGrejPoKorisna());
//		}
//		
//		if (rn.getBrojilo().getObjekat().getGrejZa() != null) {
//		rn.setKolicinaKwhZap(rn.getKolicinaKwh() / rn.getBrojilo().getObjekat().getGrejZa());
//		}
//		
//		if (rn.getBrojilo().getObjekat().getOpBrKor() != null) {
//			rn.setKolicinaKwhKor(rn.getKolicinaKwh() / rn.getBrojilo().getObjekat().getOpBrKor());
//		}
		
		return dao.save(rn);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
	public Long proveriRacun(Date datumr, Long brojilo_id){
		return dao.proveriRacun(datumr, brojilo_id);
	}
}
