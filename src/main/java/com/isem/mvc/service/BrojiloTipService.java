package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloTipDao;
import com.isem.mvc.model.BrojiloTip;

@Service
public class BrojiloTipService {
	@Autowired
	private BrojiloTipDao dao;
		
	public BrojiloTip findById (Long id) {
		return dao.findById(id);
	}

	public List<BrojiloTip> findAll () {
		return dao.findAll();
	}

	public Page<BrojiloTip> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public BrojiloTip save(BrojiloTip obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

	
}
