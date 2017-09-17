package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.TrafoDao;
import com.isem.mvc.model.Trafo;

@Service
public class TrafoService {
	@Autowired
	private TrafoDao dao;
		
	public Trafo findById (Long id) {
		return dao.findById(id);
	}

	public List<Trafo> findAll () {
		return dao.findAll();
	}

	public Page<Trafo> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Trafo save(Trafo obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
