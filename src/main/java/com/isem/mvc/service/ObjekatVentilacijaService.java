package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatVentilacijaDao;
import com.isem.mvc.model.ObjekatVentilacija;

@Service
public class ObjekatVentilacijaService {
	@Autowired
	private ObjekatVentilacijaDao dao;
		
	public ObjekatVentilacija findById (Long id) {
		return dao.findById(id);
	}

	public List<ObjekatVentilacija> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatVentilacija> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatVentilacija save(ObjekatVentilacija obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
