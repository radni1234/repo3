package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.OpstinaDao;
import com.isem.mvc.model.Opstina;

@Service
public class OpstinaService {
	
	@Autowired
	private OpstinaDao opstinaDao;
	
	public Opstina save(Opstina o) {
		return opstinaDao.save(o);
	}
	
	public Opstina findByNaziv (String naziv) {
		return opstinaDao.findByNaziv(naziv);
	}
	
	public Opstina findById (Long id) {
		return opstinaDao.findById(id);
	}
	
	public List<Opstina> findAll () {
		return opstinaDao.findAll();
	}
	
	public void obrisiOpstinu (Long id) {
		opstinaDao.delete(id);
	}
}


