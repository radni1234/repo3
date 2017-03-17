package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatMereDao;
import com.isem.mvc.model.ObjekatMere;

@Service
public class ObjekatMereService {
	@Autowired
	private ObjekatMereDao dao;
		
	public ObjekatMere findById (Long id) {
		return dao.findById(id);
	}
	
	public List<ObjekatMere> findObjekatMereByObjekat(Long id){
		return dao.findObjekatMereByObjekat(id);
	}

	public List<ObjekatMere> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatMere> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatMere save(ObjekatMere obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
