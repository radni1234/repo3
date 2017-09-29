package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.VoziloPotrosnjaDao;
import com.isem.mvc.dao.VoziloPotrosnjaViewDao;
import com.isem.mvc.model.VoziloPotrosnja;
import com.isem.mvc.tab.VoziloPotrosnjaView;

@Service
public class VoziloPotrosnjaService {
	@Autowired
	private VoziloPotrosnjaDao dao;
	
	@Autowired
	private VoziloPotrosnjaViewDao daoView;
		
	public VoziloPotrosnja findById (Long id) {
		return dao.findById(id);
	}

	public List<VoziloPotrosnja> findAll () {
		return dao.findAll();
	}

	public Page<VoziloPotrosnja> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public VoziloPotrosnjaView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<VoziloPotrosnjaView> findAllView () {
		return daoView.findAll();
	}

	public Page<VoziloPotrosnjaView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}
	
	public List<VoziloPotrosnjaView> findPotrosnjaViewByVozilo(Long vozilo_id) {		
		return daoView.findPotrosnjaViewByVozilo(vozilo_id);
	}

	public VoziloPotrosnja save(VoziloPotrosnja obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
