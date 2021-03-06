package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.SavetiDao;
import com.isem.mvc.model.Saveti;

@Service
public class SavetiService {
	@Autowired
	private SavetiDao dao;	
		
	public Saveti findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Saveti> findAll () {
		return dao.findAll();
	}
	
	public Page<Saveti> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public Saveti save(Saveti obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
