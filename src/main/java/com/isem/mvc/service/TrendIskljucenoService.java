package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.TrendIskljucenoDao;
import com.isem.mvc.model.TrendIskljuceno;

@Service
public class TrendIskljucenoService {
	
	@Autowired
	private TrendIskljucenoDao dao;
		
	public TrendIskljuceno findById (Long id) {
		return dao.findById(id);
	}
	
	public List<TrendIskljuceno> findAll () {
		return dao.findAll();
	}
	
	public Page<TrendIskljuceno> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public TrendIskljuceno save(TrendIskljuceno obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
