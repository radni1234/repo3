package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.EnergentDao;
import com.isem.mvc.model.Energent;

@Service
public class EnergentService {
	@Autowired
	private EnergentDao dao;
		
	public Energent findById (Long id) {
		return dao.findById(id);
	}

	public List<Energent> findAll () {
		return dao.findAll();
	}

	public Page<Energent> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Energent save(Energent obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
