package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.UlogaDao;
import com.isem.mvc.model.security.Authority;

@Service
public class UlogaService {
	@Autowired
	private UlogaDao dao;
		
	public Authority findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Authority> findByUser(String user) {
		return dao.findByUser(user);
	}
	
	public List<Authority> findAll () {
		return dao.findAll();
	}
	
	public Page<Authority> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public Authority save(Authority obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
