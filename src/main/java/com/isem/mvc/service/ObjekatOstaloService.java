package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatOstaloDao;
import com.isem.mvc.model.ObjekatOstalo;

@Service
public class ObjekatOstaloService {
	@Autowired
	private ObjekatOstaloDao dao;
		
	public ObjekatOstalo findById (Long id) {
		return dao.findById(id);
	}

	public List<ObjekatOstalo> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatOstalo> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatOstalo save(ObjekatOstalo obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
