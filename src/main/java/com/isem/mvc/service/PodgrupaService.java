package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.PodgrupaDao;
import com.isem.mvc.model.Podgrupa;

@Service
public class PodgrupaService {
	@Autowired
	private PodgrupaDao dao;
		
	public Podgrupa findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Podgrupa> findPodgrupaByGrupa(Long id){
		return dao.findPodgrupaByGrupa(id);
	}

	public List<Podgrupa> findAll () {
		return dao.findAll();
	}

	public Page<Podgrupa> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public Podgrupa save(Podgrupa obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
