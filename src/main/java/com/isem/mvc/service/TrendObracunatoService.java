package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.TrendObracunatoDao;
import com.isem.mvc.model.TrendObracunato;

@Service
public class TrendObracunatoService {
	@Autowired
	private TrendObracunatoDao dao;
		
	public TrendObracunato findById (Long id) {
		return dao.findById(id);
	}

	public List<TrendObracunato> findAll () {
		return dao.findAll();
	}

	public Page<TrendObracunato> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public TrendObracunato save(TrendObracunato obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
