package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.GrupaDao;
import com.isem.mvc.model.Grupa;

@Service
public class GrupaService {
	@Autowired
	private GrupaDao dao;
		
	public Grupa findById (Long id) {
		return dao.findById(id);
	}

	public List<Grupa> findAll () {
		return dao.findAll();
	}

	public Page<Grupa> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Grupa save(Grupa obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
