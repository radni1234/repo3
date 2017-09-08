package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KotlarnicaDao;
import com.isem.mvc.model.Kotlarnica;

@Service
public class KotlarnicaService {

	@Autowired
	private KotlarnicaDao dao;
		
	public Kotlarnica findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Kotlarnica> findAll () {
		return dao.findAll();
	}
	
	public Page<Kotlarnica> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public Kotlarnica save(Kotlarnica obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
