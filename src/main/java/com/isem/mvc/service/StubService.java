package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.StubDao;
import com.isem.mvc.model.Stub;

@Service
public class StubService {
	@Autowired
	private StubDao dao;
		
	public Stub findById (Long id) {
		return dao.findById(id);
	}

	public List<Stub> findAll () {
		return dao.findAll();
	}

	public Page<Stub> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Stub save(Stub obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
