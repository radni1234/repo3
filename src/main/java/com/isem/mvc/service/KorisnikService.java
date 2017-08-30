package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KorisnikDao;
import com.isem.mvc.dao.KorisnikViewDao;
import com.isem.mvc.model.security.User;
import com.isem.mvc.tab.KorisnikView;

@Service
public class KorisnikService {
	@Autowired
	private KorisnikDao korisnikDao;
	
	@Autowired
	private KorisnikViewDao korisnikViewDao;
	
	public User findById (Long id) {
		return korisnikDao.findById(id);
	}
	
	public User findByUsername (String userName) {	
		return korisnikDao.findByUsername(userName);
	}
	
	public List<User> findAll (String user) {
		return korisnikDao.findAll(user);
	}
	
	public Page<User> findAll (Pageable pageRequest, String user) {
		return korisnikDao.findAll(pageRequest, user);
	}
	
	public List<KorisnikView> findAllView(String user){
		return korisnikViewDao.findAll(user);
	};
	
	public Page<KorisnikView> findAllView (Pageable pageRequest, String user) {
		return korisnikViewDao.findAll(pageRequest, user);
	}
				
	public User save(User korisnik) {
		return korisnikDao.save(korisnik);
	}	
	
	public void delete (Long id) {
		korisnikDao.delete(id);
	}
}
