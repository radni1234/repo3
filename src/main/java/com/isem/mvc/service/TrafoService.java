package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.TrafoDao;
import com.isem.mvc.dao.TrafoViewDao;
import com.isem.mvc.model.Trafo;
import com.isem.mvc.tab.TrafoView;

@Service
public class TrafoService {
	@Autowired
	private TrafoDao dao;
	
	@Autowired
	private TrafoViewDao daoView;
		
	public Trafo findById (Long id) {
		return dao.findById(id);
	}

	public List<Trafo> findAll () {
		return dao.findAll();
	}

	public Page<Trafo> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public TrafoView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<TrafoView> findAllView () {
		return daoView.findAll();
	}

	public Page<TrafoView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}

	public Trafo save(Trafo obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
