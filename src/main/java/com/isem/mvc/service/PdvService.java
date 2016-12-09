package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.PdvDao;
import com.isem.mvc.model.Pdv;

@Service
public class PdvService {
	@Autowired
	private PdvDao dao;
		
	public Pdv findById (Long id) {
		return dao.findById(id);
	}

	public List<Pdv> findAll () {
		return dao.findAll();
	}

	public Page<Pdv> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Pdv save(Pdv obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
