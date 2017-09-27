package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.VoziloDao;
import com.isem.mvc.dao.VoziloViewDao;
import com.isem.mvc.model.Vozilo;
import com.isem.mvc.tab.VoziloView;

@Service
public class VoziloService {
	@Autowired
	private VoziloDao dao;
	
	@Autowired
	private VoziloViewDao daoView;
		
	public Vozilo findById (Long id) {
		return dao.findById(id);
	}

	public List<Vozilo> findAll () {
		return dao.findAll();
	}

	public Page<Vozilo> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public VoziloView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<VoziloView> findAllView () {
		return daoView.findAll();
	}

	public Page<VoziloView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}

	public Vozilo save(Vozilo obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
