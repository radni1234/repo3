package com.isem.mvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.RnTrafoDao;
import com.isem.mvc.model.RnTrafo;

@Service
public class RnTrafoService {
	@Autowired
	private RnTrafoDao dao;
		
	public RnTrafo findById (Long id) {
		return dao.findById(id);
	}

	public List<RnTrafo> findAll () {
		return dao.findAll();
	}

	public Page<RnTrafo> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<RnTrafo> findRnTrafoByTrafo(Long trafo_id) {		
		return dao.findRnTrafoByTrafo(trafo_id);
	}
	
	public List<RnTrafo> findRnTrafoByMesto(Long mesto_id, Date datumr) {		
		return dao.findRnTrafoByMesto(mesto_id, datumr);
	}

	public RnTrafo save(RnTrafo obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
