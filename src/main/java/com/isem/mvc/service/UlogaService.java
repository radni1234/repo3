package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.UlogaDao;
import com.isem.mvc.model.Uloga;

@Service
public class UlogaService {
	@Autowired
	private UlogaDao dao;
		
	public Uloga findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Uloga> findAll () {
		return dao.findAll();
	}
	
	public Page<Uloga> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public Uloga save(Uloga obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
