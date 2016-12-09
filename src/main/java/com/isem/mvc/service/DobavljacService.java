package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.DobavljacDao;
import com.isem.mvc.model.Dobavljac;

@Service
public class DobavljacService {
	@Autowired
	private DobavljacDao dao;
		
	public Dobavljac findById (Long id) {
		return dao.findById(id);
	}

	public List<Dobavljac> findAll () {
		return dao.findAll();
	}

	public Page<Dobavljac> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Dobavljac save(Dobavljac obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
}
