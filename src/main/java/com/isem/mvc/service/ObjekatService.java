package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.LovDao;
import com.isem.mvc.dao.ObjekatDao;
import com.isem.mvc.dao.ObjekatViewDao;
import com.isem.mvc.lov.Lov;
import com.isem.mvc.model.Objekat;
import com.isem.mvc.tab.ObjekatView;

@Service
public class ObjekatService {
	@Autowired
	private ObjekatDao dao;
	
	@Autowired
	private ObjekatViewDao viewDao;
	
	@Autowired
	private LovDao lovDao;
		
	public Objekat findById (Long id) {
		return dao.findById(id);
	}

	public List<Objekat> findAll () {
		return dao.findAll();
	}

	public Page<Objekat> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<ObjekatView> findAllView () {
		return viewDao.findAll();
	}

	public Page<ObjekatView> findAllView (Pageable pageRequest) {
		return viewDao.findAll(pageRequest);
	}

	public Objekat save(Objekat obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
	public List<Lov> objekatLov (){
		return lovDao.objekatLov();
	}
	
}
