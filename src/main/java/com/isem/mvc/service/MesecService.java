package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.MesecDao;
import com.isem.mvc.model.Mesec;

@Service
public class MesecService {
	@Autowired
	private MesecDao dao;	
	
	public Mesec findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Mesec> findAll () {
		return dao.findAll();
	}
	
	public Page<Mesec> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public Mesec save(Mesec obj) {
		return dao.save(obj);
	}
	
	public void delete(Long id) {
		dao.delete(id);
	}
}
