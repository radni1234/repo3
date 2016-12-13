package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloDao;
import com.isem.mvc.model.Brojilo;

@Service
public class BrojiloService {
	@Autowired
	private BrojiloDao dao;
		
	public Brojilo findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Brojilo> findBrojiloByObjekat(Long id){
		return dao.findBrojiloByObjekat(id);
	}

	public List<Brojilo> findAll () {
		return dao.findAll();
	}

	public Page<Brojilo> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Brojilo save(Brojilo obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
