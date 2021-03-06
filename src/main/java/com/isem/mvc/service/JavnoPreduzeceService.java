package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.JavnoPreduzeceDao;
import com.isem.mvc.dao.JavnoPreduzeceViewDao;
import com.isem.mvc.lov.Lov;
import com.isem.mvc.lov.LovDao;
import com.isem.mvc.model.JavnoPreduzece;
import com.isem.mvc.tab.JavnoPreduzeceView;

@Service
public class JavnoPreduzeceService {
	@Autowired
	private JavnoPreduzeceDao dao;
	
	@Autowired
	private JavnoPreduzeceViewDao daoView;
	
	@Autowired
	private LovDao daoLov;
		
	public JavnoPreduzece findById (Long id) {
		return dao.findById(id);
	}

	public List<JavnoPreduzece> findAll (String user) {
		return dao.findAll(user);
	}

	public Page<JavnoPreduzece> findAll (Pageable pageRequest, String user) {
		return dao.findAll(pageRequest, user);
	}
	
	public List<JavnoPreduzece> findAllByOpstina (Long ops_id) {
		return dao.findAllByOpstina(ops_id);
	}
	
	public JavnoPreduzeceView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<JavnoPreduzeceView> findAllView (String user) {
		return daoView.findAll(user);
	}

	public Page<JavnoPreduzeceView> findAllView (Pageable pageRequest, String user) {
		return daoView.findAll(pageRequest, user);
	}
	
	public List<Lov> javnoPreduzeceLov (String user) {
		return daoLov.javnoPreduzeceLov(user);
	}
	
	public List<Lov> javnoPreduzeceLov (String user, Long opsId, Long mesId) {
		return daoLov.javnoPreduzeceLov(user, opsId, mesId);
	}

	public JavnoPreduzece save(JavnoPreduzece obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
