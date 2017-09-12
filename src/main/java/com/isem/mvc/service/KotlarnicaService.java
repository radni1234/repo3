package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KotlarnicaDao;
import com.isem.mvc.dao.KotlarnicaViewDao;
import com.isem.mvc.model.Kotlarnica;
import com.isem.mvc.tab.KotlarnicaView;

@Service
public class KotlarnicaService {

	@Autowired
	private KotlarnicaDao dao;
	
	@Autowired
	private KotlarnicaViewDao daoView;
	
		
	public Kotlarnica findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Kotlarnica> findAll (String user) {
		return dao.findAll(user);
	}
	
	public Page<Kotlarnica> findAll (Pageable pageRequest, String user) {
		return dao.findAll(pageRequest, user);
	}
	
	public KotlarnicaView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<KotlarnicaView> findAllView (String user) {
		return daoView.findAll(user);
	}

	public Page<KotlarnicaView> findAllView (Pageable pageRequest, String user) {
		return daoView.findAll(pageRequest, user);
	}	
	
	public Kotlarnica save(Kotlarnica obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
