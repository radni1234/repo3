package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.SvetiljkaTipDao;
import com.isem.mvc.model.SvetiljkaTip;

@Service
public class SvetiljkaTipService {
	@Autowired
	private SvetiljkaTipDao dao;
		
	public SvetiljkaTip findById (Long id) {
		return dao.findById(id);
	}

	public List<SvetiljkaTip> findAll () {
		return dao.findAll();
	}

	public Page<SvetiljkaTip> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public SvetiljkaTip save(SvetiljkaTip obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
}
