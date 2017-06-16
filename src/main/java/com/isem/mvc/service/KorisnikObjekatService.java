package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KorisnikObjekatDao;
import com.isem.mvc.dao.KorisnikObjekatViewDao;
import com.isem.mvc.model.KorisnikObjekat;
import com.isem.mvc.tab.KorisnikObjekatView;

@Service
public class KorisnikObjekatService {
	@Autowired
	private KorisnikObjekatDao dao;
	
	@Autowired
	private KorisnikObjekatViewDao daoView;
		
	public KorisnikObjekat findById (Long id) {
		return dao.findById(id);
	}

	public List<KorisnikObjekat> findAll () {
		return dao.findAll();
	}

	public Page<KorisnikObjekat> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public KorisnikObjekat save(KorisnikObjekat obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
	public List<KorisnikObjekatView> findKorisnikObjekatViewByKorisnik(Long id){
		return daoView.findKorisnikObjekatViewByKorisnik(id);
	}
}
