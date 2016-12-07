package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatHladjenjeDao;
import com.isem.mvc.model.ObjekatHladjenje;

@Service
public class ObjekatHladjenjeService {
	@Autowired
	private ObjekatHladjenjeDao dao;
		
	public ObjekatHladjenje findById (Long id) {
		return dao.findById(id);
	}

	public List<ObjekatHladjenje> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatHladjenje> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public ObjekatHladjenje save(ObjekatHladjenje obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
