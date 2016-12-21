package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KorisnikDao;
import com.isem.mvc.dao.KorisnikViewDao;
import com.isem.mvc.model.Korisnik;
import com.isem.mvc.tab.KorisnikView;

@Service
public class KorisnikService {
	@Autowired
	private KorisnikDao korisnikDao;
	
	@Autowired
	private KorisnikViewDao korisnikViewDao;
	
	public Korisnik findById (Long id) {
		return korisnikDao.findById(id);
	}
	
	public Korisnik findByUsername (String userName) {	
		return korisnikDao.findByUsername(userName);
	}
	
	public List<Korisnik> findAll () {
		return korisnikDao.findAll();
	}
	
	public Page<Korisnik> findAll (Pageable pageRequest) {
		return korisnikDao.findAll(pageRequest);
	}
	
	public List<KorisnikView> findAllView(){
		return korisnikViewDao.findAll();
	};
	
	public Page<KorisnikView> findAllView (Pageable pageRequest) {
		return korisnikViewDao.findAll(pageRequest);
	}
				
	public Korisnik save(Korisnik korisnik) {
		return korisnikDao.save(korisnik);
	}	
	
	public void delete (Long id) {
		korisnikDao.delete(id);
	}
}
