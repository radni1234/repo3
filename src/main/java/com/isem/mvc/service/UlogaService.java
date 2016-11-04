package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.UlogaDao;
import com.isem.mvc.model.Uloga;

@Service
public class UlogaService {
	@Autowired
	private UlogaDao ulogaDao;
	
	public Uloga save(Uloga o) {
		return ulogaDao.save(o);
	}
	
	public Uloga findById (Long id) {
		return ulogaDao.findById(id);
	}
	
	public List<Uloga> findAll () {
		return ulogaDao.findAll();
	}
	
	public void obrisiUlogu (Long id) {
		ulogaDao.delete(id);
	}
}
