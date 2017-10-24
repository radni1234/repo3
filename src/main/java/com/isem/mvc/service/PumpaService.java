package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.PumpaDao;
import com.isem.mvc.model.Pumpa;

@Service
public class PumpaService {

	@Autowired
	private PumpaDao dao;
		
	public Pumpa findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Pumpa> findAll () {
		return dao.findAll();
	}
	
	public Page<Pumpa> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}	
	
	public Pumpa save(Pumpa obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
