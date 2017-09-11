package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KotaoDao;
import com.isem.mvc.model.Kotao;

@Service
public class KotaoService {
	@Autowired
	private KotaoDao dao;
		
	public Kotao findById (Long id) {
		return dao.findById(id);
	}

	public List<Kotao> findAll () {
		return dao.findAll();
	}

	public Page<Kotao> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Kotao save(Kotao obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
