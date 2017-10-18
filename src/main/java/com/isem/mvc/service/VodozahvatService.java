package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.VodozahvatDao;
import com.isem.mvc.model.Vodozahvat;

@Service
public class VodozahvatService {
	@Autowired
	private VodozahvatDao dao;
		
	public Vodozahvat findById (Long id) {
		return dao.findById(id);
	}

	public List<Vodozahvat> findAll () {
		return dao.findAll();
	}

	public Page<Vodozahvat> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Vodozahvat save(Vodozahvat obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
