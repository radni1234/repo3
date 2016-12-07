package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatGrejanjeDao;
import com.isem.mvc.model.ObjekatGrejanje;

@Service
public class ObjekatGrejanjeService {
	@Autowired
	private ObjekatGrejanjeDao dao;
		
	public ObjekatGrejanje findById (Long id) {
		return dao.findById(id);
	}

	public List<ObjekatGrejanje> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatGrejanje> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatGrejanje save(ObjekatGrejanje obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
