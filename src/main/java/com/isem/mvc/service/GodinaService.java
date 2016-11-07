package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.GodinaDao;
import com.isem.mvc.model.Godina;

@Service
public class GodinaService {
	
	@Autowired
	private GodinaDao godinaDao;
	
	public Godina save(Godina u) {
		return godinaDao.save(u);
	}
	
	public Godina findById (Long id) {
		return godinaDao.findById(id);
	}
	
	public List<Godina> findAll () {
		return godinaDao.findAll();
	}
	
	public void delete(Long id) {
		godinaDao.delete(id);
	}
}
