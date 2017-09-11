package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.PotrosnjaPodstaniceDao;
import com.isem.mvc.model.PotrosnjaPodstanice;

@Service
public class PotrosnjaPodstaniceService {

	@Autowired
	private PotrosnjaPodstaniceDao dao;
		
	public PotrosnjaPodstanice findById (Long id) {
		return dao.findById(id);
	}
	
	public List<PotrosnjaPodstanice> findAll () {
		return dao.findAll();
	}
	
	public Page<PotrosnjaPodstanice> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public PotrosnjaPodstanice save(PotrosnjaPodstanice obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
