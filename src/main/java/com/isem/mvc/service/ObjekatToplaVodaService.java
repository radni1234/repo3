package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatToplaVodaDao;
import com.isem.mvc.model.ObjekatToplaVoda;

@Service
public class ObjekatToplaVodaService {
	@Autowired
	private ObjekatToplaVodaDao dao;
		
	public ObjekatToplaVoda findById (Long id) {
		return dao.findById(id);
	}

	public List<ObjekatToplaVoda> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatToplaVoda> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatToplaVoda save(ObjekatToplaVoda obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
