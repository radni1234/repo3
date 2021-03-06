package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatKkDao;
import com.isem.mvc.model.ObjekatKk;

@Service
public class ObjekatKkService {
	@Autowired
	private ObjekatKkDao dao;
		
	public ObjekatKk findById (Long id) {
		return dao.findById(id);
	}

	public List<ObjekatKk> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatKk> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatKk save(ObjekatKk obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
