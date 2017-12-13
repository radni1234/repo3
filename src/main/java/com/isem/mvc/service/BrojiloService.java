package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloDao;
import com.isem.mvc.dao.BrojiloViewDao;
import com.isem.mvc.model.Brojilo;
import com.isem.mvc.tab.BrojiloView;

@Service
public class BrojiloService {
	@Autowired
	private BrojiloDao dao;
	
	@Autowired
	private BrojiloViewDao daoView;
		
	public Brojilo findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Brojilo> findBrojiloByObjekat(Long id){
		return dao.findBrojiloByObjekat(id);
	}
	
	public List<Brojilo> findBrojiloByObjekatEnergentTip(Long obj_id, Long ene_tip_id){
		return dao.findBrojiloByObjekatEnergentTip(obj_id, ene_tip_id);
	}

	public List<Brojilo> findAll () {
		return dao.findAll();
	}

	public Page<Brojilo> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public BrojiloView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<BrojiloView> findAllView () {
		return daoView.findAll();
	}

	public Page<BrojiloView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}
		
	public List<BrojiloView> findBrojiloViewByObjekat(Long obj_id) {		
		return daoView.findBrojiloViewByObjekat(obj_id);
	}

	public Brojilo save(Brojilo obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
