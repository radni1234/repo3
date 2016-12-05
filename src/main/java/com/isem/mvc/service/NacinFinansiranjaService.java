package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.NacinFinansiranjaDao;
import com.isem.mvc.model.NacinFinansiranja;

@Service
public class NacinFinansiranjaService {
	@Autowired
	private NacinFinansiranjaDao dao;
		
	public NacinFinansiranja findById (Long id) {
		return dao.findById(id);
	}

	public List<NacinFinansiranja> findAll () {
		return dao.findAll();
	}

	public Page<NacinFinansiranja> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public NacinFinansiranja save(NacinFinansiranja obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
