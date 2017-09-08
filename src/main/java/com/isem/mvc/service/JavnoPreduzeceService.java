package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.JavnoPreduzeceDao;
import com.isem.mvc.model.JavnoPreduzece;

@Service
public class JavnoPreduzeceService {
	@Autowired
	private JavnoPreduzeceDao dao;
		
	public JavnoPreduzece findById (Long id) {
		return dao.findById(id);
	}

	public List<JavnoPreduzece> findAll () {
		return dao.findAll();
	}

	public Page<JavnoPreduzece> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public JavnoPreduzece save(JavnoPreduzece obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
