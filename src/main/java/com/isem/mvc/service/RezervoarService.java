package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.RezervoarDao;
import com.isem.mvc.model.Rezervoar;

@Service
public class RezervoarService {
	@Autowired
	private RezervoarDao dao;
		
	public Rezervoar findById (Long id) {
		return dao.findById(id);
	}

	public List<Rezervoar> findAll () {
		return dao.findAll();
	}

	public Page<Rezervoar> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<Rezervoar> findRezervoarByVodozahvat(Long id){
		return dao.findRezervoarByVodozahvat(id);
	}

	public Rezervoar save(Rezervoar obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
