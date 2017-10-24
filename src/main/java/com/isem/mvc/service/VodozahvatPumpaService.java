package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.VodozahvatPumpaDao;
import com.isem.mvc.model.VodozahvatPumpa;

@Service	
public class VodozahvatPumpaService {
	@Autowired
	private VodozahvatPumpaDao dao;
		
	public VodozahvatPumpa findById (Long id) {
		return dao.findById(id);
	}

	public List<VodozahvatPumpa> findAll () {
		return dao.findAll();
	}

	public Page<VodozahvatPumpa> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<VodozahvatPumpa> findPumpaByVodozahvat(Long id){
		return dao.findPumpaByVodozahvat(id);
	}

	public VodozahvatPumpa save(VodozahvatPumpa obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
