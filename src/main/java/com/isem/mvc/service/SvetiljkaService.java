package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.SvetiljkaDao;
import com.isem.mvc.dao.SvetiljkaViewDao;
import com.isem.mvc.model.Svetiljka;
import com.isem.mvc.tab.SvetiljkaView;

@Service
public class SvetiljkaService {
	@Autowired
	private SvetiljkaDao dao;
	
	@Autowired
	private SvetiljkaViewDao daoView;
		
	public Svetiljka findById (Long id) {
		return dao.findById(id);
	}

	public List<Svetiljka> findAll () {
		return dao.findAll();
	}

	public Page<Svetiljka> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public SvetiljkaView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<SvetiljkaView> findAllView () {
		return daoView.findAll();
	}

	public Page<SvetiljkaView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}
	
	public List<SvetiljkaView> findSvetiljkaViewByStub(Long stub_id) {		
		return daoView.findSvetiljkaViewByStub(stub_id);
	}

	public Svetiljka save(Svetiljka obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
