package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KategorijaVozilaDao;
import com.isem.mvc.model.KategorijaVozila;

@Service
public class KategorijaVozilaService {
	@Autowired
	private KategorijaVozilaDao dao;
		
	public KategorijaVozila findById (Long id) {
		return dao.findById(id);
	}

	public List<KategorijaVozila> findAll () {
		return dao.findAll();
	}

	public Page<KategorijaVozila> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public KategorijaVozila save(KategorijaVozila obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
