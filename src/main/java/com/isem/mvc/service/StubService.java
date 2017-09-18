package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.StubDao;
import com.isem.mvc.dao.StubViewDao;
import com.isem.mvc.model.Stub;
import com.isem.mvc.tab.StubView;

@Service
public class StubService {
	@Autowired
	private StubDao dao;
	
	@Autowired
	private StubViewDao daoView;
		
	public Stub findById (Long id) {
		return dao.findById(id);
	}

	public List<Stub> findAll () {
		return dao.findAll();
	}

	public Page<Stub> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public StubView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<StubView> findAllView () {
		return daoView.findAll();
	}

	public Page<StubView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}
		
	public List<StubView> findStubViewByTrafo(Long trafo_id) {		
		return daoView.findStubViewByTrafo(trafo_id);
	}

	public Stub save(Stub obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
