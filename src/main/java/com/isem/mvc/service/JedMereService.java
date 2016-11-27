package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.JedMereDao;
import com.isem.mvc.model.JedMere;

@Service
public class JedMereService {
	@Autowired
	private JedMereDao jedMereDao;
	
	public JedMere save(JedMere j) {
		return jedMereDao.save(j);
	}
	
	public JedMere findById (Long id) {
		return jedMereDao.findById(id);
	}
	
	public List<JedMere> findAll () {
		return jedMereDao.findAll();
	}
	
	public Page<JedMere> findAll (Pageable pageRequest) {
		return jedMereDao.findAll(pageRequest);
	}
	
	public void deleteJedMere (Long id) {
		jedMereDao.delete(id);
	}
}
