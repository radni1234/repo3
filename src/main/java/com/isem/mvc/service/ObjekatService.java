package com.isem.mvc.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatDao;
import com.isem.mvc.dao.ObjekatViewDao;
import com.isem.mvc.lov.Lov;
import com.isem.mvc.lov.LovDao;
import com.isem.mvc.model.Objekat;
import com.isem.mvc.tab.ObjekatView;

@Service
public class ObjekatService {
	private final Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
	private ObjekatDao dao;
	
	@Autowired
	private ObjekatViewDao viewDao;
	
	@Autowired
	private LovDao lovDao;
		
	public Objekat findById (Long id) {
		return dao.findById(id);
	}

	public List<Objekat> findAll (String user) {
		logger.info("korisnik " + user);
		return dao.findAll(user);
	}

	public Page<Objekat> findAll (Pageable pageRequest, String user) {
		return dao.findAll(pageRequest, user);
	}
	
	public List<ObjekatView> findAllView (String user) {
		logger.info("korisnik " + user);
		return viewDao.findAll(user);
	}

	public Page<ObjekatView> findAllView (Pageable pageRequest, String user) {
		return viewDao.findAll(pageRequest, user);
	}

	public Objekat save(Objekat obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
	public List<Lov> objekatLov (String user){
		return lovDao.objekatLov(user);
	}
	
	public List<Lov> objekatLov (String user, Long opsId, Long mesId, Long gruId, Long podgruId){
		return lovDao.objekatLov(user, opsId, mesId, gruId, podgruId);
	}
	
	public List<Lov> objekatLov (String user, Long opsId, Long mesId, Long gruId, Long podgruId, Long nacFinId){
		return lovDao.objekatLov(user, opsId, mesId, gruId, podgruId, nacFinId);
	}
	
}
