package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.StepenDanDao;
import com.isem.mvc.model.StepenDan;

@Service
public class StepenDanService {
	@Autowired
	private StepenDanDao dao;
		
	public StepenDan findById (Long id) {
		return dao.findById(id);
	}

	public List<StepenDan> findAll () {
		return dao.findAll();
	}

	public Page<StepenDan> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public StepenDan save(StepenDan obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

	
}
