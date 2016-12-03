package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.OpstinaDao;
import com.isem.mvc.model.Opstina;

@Service
public class OpstinaService {
	
	@Autowired
	private OpstinaDao dao;
	
	public Opstina findById (Long id) {
		return dao.findById(id);
	}
	
	public Opstina findByNaziv (String naziv) {
		return dao.findByNaziv(naziv);
	}	
	
	public List<Opstina> findAll () {
		return dao.findAll();
	}
	
	public Page<Opstina> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public Opstina save(Opstina obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}


