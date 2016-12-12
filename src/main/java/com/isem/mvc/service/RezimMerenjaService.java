package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.RezimMerenjaDao;
import com.isem.mvc.model.RezimMerenja;

@Service
public class RezimMerenjaService {
	@Autowired
	private RezimMerenjaDao dao;
		
	public RezimMerenja findById (Long id) {
		return dao.findById(id);
	}

	public List<RezimMerenja> findAll () {
		return dao.findAll();
	}

	public Page<RezimMerenja> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public RezimMerenja save(RezimMerenja obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
