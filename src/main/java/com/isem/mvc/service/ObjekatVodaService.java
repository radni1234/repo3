package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatVodaDao;
import com.isem.mvc.model.ObjekatVoda;

@Service
public class ObjekatVodaService {
	@Autowired
	private ObjekatVodaDao dao;
		
	public ObjekatVoda findById (Long id) {
		return dao.findById(id);
	}

	public List<ObjekatVoda> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatVoda> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatVoda save(ObjekatVoda obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
}
