package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.DobavljacDao;
import com.isem.mvc.dao.DobavljacViewDao;
import com.isem.mvc.model.Dobavljac;
import com.isem.mvc.tab.DobavljacView;

@Service
public class DobavljacService {
	@Autowired
	private DobavljacDao dao;
	
	@Autowired
	private DobavljacViewDao daoView;
		
	public Dobavljac findById (Long id) {
		return dao.findById(id);
	}

	public List<Dobavljac> findAll () {
		return dao.findAll();
	}

	public Page<Dobavljac> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public DobavljacView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<DobavljacView> findAllView () {
		return daoView.findAll();
	}

	public Page<DobavljacView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}

	public Dobavljac save(Dobavljac obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
}
