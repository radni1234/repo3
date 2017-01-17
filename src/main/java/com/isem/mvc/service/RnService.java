package com.isem.mvc.service;

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
		
		List<RnStavke> rnStavkeList = obj.getRnStavke();		
		
		for (RnStavke r : rnStavkeList) {
			r.setRn(obj);
		    obj.addRnIznos(r);
		}
		
//		List<RnIznos> rnIznosList = obj.getRnIznos();		
//		
//		for (RnIznos r : rnIznosList) {
//			r.setRn(obj);
//		    obj.addRnIznos(r);
//		}
//		
//		
//		List<RnPotrosnja> rnPotrosnjaList = obj.getRnPotrosnja();		
//		
//		for (RnPotrosnja r : rnPotrosnjaList) {
//			r.setRn(obj);
//		    obj.addRnPotrosnja(r);
//		}
//		
//		
//		List<RnOstalo> rnOstaloList = obj.getRnOstalo();				
//			
//		for (RnOstalo r : rnOstaloList) {
//			r.setRn(obj);
//		    obj.addRnOstalo(r);
//		}
			
		
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
