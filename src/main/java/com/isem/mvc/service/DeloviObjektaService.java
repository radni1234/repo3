package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.DeloviObjektaDao;
import com.isem.mvc.model.DeloviObjekta;

@Service
public class DeloviObjektaService {
	@Autowired
	private DeloviObjektaDao dao;
		
	public DeloviObjekta findById (Long id) {
		return dao.findById(id);
	}

	public List<DeloviObjekta> findAll () {
		return dao.findAll();
	}

	public Page<DeloviObjekta> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public DeloviObjekta save(DeloviObjekta obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
