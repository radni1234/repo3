package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloKotlarnicaDao;
import com.isem.mvc.dao.BrojiloKotlarnicaViewDao;
import com.isem.mvc.model.BrojiloKotlarnica;
import com.isem.mvc.tab.BrojiloKotlarnicaView;

@Service
public class BrojiloKotlarnicaService {
	@Autowired
	private BrojiloKotlarnicaDao dao;
	
	@Autowired
	private BrojiloKotlarnicaViewDao daoView;
		
	public BrojiloKotlarnica findById (Long id) {
		return dao.findById(id);
	}
	
	public List<BrojiloKotlarnica> findBrojiloByKotlarnica(Long id){
		return dao.findBrojiloByKotlarnica(id);
	}

	public List<BrojiloKotlarnica> findAll () {
		return dao.findAll();
	}

	public Page<BrojiloKotlarnica> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public BrojiloKotlarnicaView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<BrojiloKotlarnicaView> findAllView () {
		return daoView.findAll();
	}

	public Page<BrojiloKotlarnicaView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}
		
	public List<BrojiloKotlarnicaView> findBrojiloViewByKotlarnica(Long obj_id) {		
		return daoView.findBrojiloViewByKotlarnica(obj_id);
	}

	public BrojiloKotlarnica save(BrojiloKotlarnica obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
