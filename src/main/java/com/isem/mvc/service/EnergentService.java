package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.EnergentDao;
import com.isem.mvc.dao.EnergentViewDao;
import com.isem.mvc.model.Energent;
import com.isem.mvc.tab.EnergentView;

@Service
public class EnergentService {
	@Autowired
	private EnergentDao dao;
	
	@Autowired
	private EnergentViewDao daoView;
		
	public Energent findById (Long id) {
		return dao.findById(id);
	}

	public List<Energent> findAll () {
		return dao.findAll();
	}
	
	public List<Energent> findEnergentByEnergentTip (Long id) {
		return dao.findEnergentByEnergentTip(id);
	}
	
	public List<Energent> findEnergentByObjekat (Long id) {
		return dao.findEnergentByObjekat(id);
	}

	public Page<Energent> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public EnergentView findByIdView (Long id) {
		return daoView.findById(id);
	}
	
	public List<EnergentView> findAllView () {
		return daoView.findAll();
	}

	public Page<EnergentView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}

	public Energent save(Energent obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
