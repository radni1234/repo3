package com.isem.mvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.RnKotlarnicaDao;
import com.isem.mvc.model.RnKotlarnica;
import com.isem.mvc.model.RnKotlarnicaStavke;

@Service
public class RnKotlarnicaService {

	@Autowired
	private RnKotlarnicaDao dao;
		
	public RnKotlarnica findById (Long id) {
		return dao.findById(id);
	}
	
	public List<RnKotlarnica> findAll () {
		return dao.findAll();
	}
	
	public Page<RnKotlarnica> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public RnKotlarnica save(RnKotlarnica rn) {
		Double sumIznos = 0.0;
		Double sumKolicina = 0.0;

		
		List<RnKotlarnicaStavke> rnStavkeList = rn.getRnStavke();		
		
		for (RnKotlarnicaStavke r : rnStavkeList) {
			r.setRn(rn);
			rn.addRnStavke(r);
		    
		    if (r.getBrojiloVrstaKolone().getKolonaTip().getId() == 1){
		    	if(r.getVrednost() != null){
		    		sumIznos = sumIznos + r.getVrednost();
		    	}
		    } else if (r.getBrojiloVrstaKolone().getKolonaTip().getId() == 2){
		    	if(r.getVrednost() != null && rn.getRnTip().getId() == 1){
		    		sumKolicina = sumKolicina + r.getVrednost();
		    	}
		    } 
		}
				
		rn.setIznos(sumIznos);
		rn.setKolicina(sumKolicina);		

		
		return dao.save(rn);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
	
	public Long proveriRacun(Date datumr, Long kotlarnica_id){
		return dao.proveriRacun(datumr, kotlarnica_id);
	}
}
