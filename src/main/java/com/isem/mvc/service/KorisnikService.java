package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KorisnikDao;
import com.isem.mvc.model.Korisnik;

@Service
public class KorisnikService {
	@Autowired
	private KorisnikDao korisnikDao;
	
	public List<Korisnik> findAll () {
		return korisnikDao.findAll();
	}
	
	public Page<Korisnik> findAll (Pageable pageRequest) {
		return korisnikDao.findAll(pageRequest);
	}
		
	public Korisnik save(Korisnik korisnik) {
		return korisnikDao.save(korisnik);
	}
	
	public Korisnik findByUsername (String userName) {
		Korisnik k = new Korisnik();
		k = korisnikDao.findByUsername(userName);
		System.out.println(k);
		return k;
	}
	
	public void obrisiKorisnika (Long id) {
		korisnikDao.delete(id);
	}
}
