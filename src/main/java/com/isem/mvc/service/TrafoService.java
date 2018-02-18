package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.TrafoDao;
import com.isem.mvc.dao.TrafoViewDao;
import com.isem.mvc.lov.Lov;
import com.isem.mvc.lov.LovDao;
import com.isem.mvc.model.Trafo;
import com.isem.mvc.tab.TrafoView;

@Service
public class TrafoService {
	@Autowired
	private TrafoDao dao;
	
	@Autowired
	private TrafoViewDao daoView;
	
	@Autowired
	private LovDao lovDao;
		
	public Trafo findById (Long id) {
		return dao.findById(id);
	}

	public List<Trafo> findAll (String user) {
		return dao.findAll(user);
	}

	public Page<Trafo> findAll (Pageable pageRequest, String user) {
		return dao.findAll(pageRequest, user);
	}
	
	public List<Trafo> findTrafoByMesto(Long mesto_id) {		
		return dao.findTrafoByMesto(mesto_id);
	}
	
	public TrafoView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<TrafoView> findAllView (String user) {
		return daoView.findAll(user);
	}

	public Page<TrafoView> findAllView (Pageable pageRequest, String user) {
		return daoView.findAll(pageRequest, user);
	}

	public Trafo save(Trafo obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
	public List<Lov> trafoLov (Long opsId, Long mesId){
		return lovDao.trafoLov(opsId, mesId);
	}

}
