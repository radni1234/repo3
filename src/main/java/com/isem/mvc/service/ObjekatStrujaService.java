package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatStrujaDao;
import com.isem.mvc.model.ObjekatStruja;

@Service
public class ObjekatStrujaService {
	@Autowired
	private ObjekatStrujaDao dao;
		
	public ObjekatStruja findById (Long id) {
		return dao.findById(id);
	}

	public List<ObjekatStruja> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatStruja> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatStruja save(ObjekatStruja obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
}
