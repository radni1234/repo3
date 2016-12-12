package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloVrstaDao;
import com.isem.mvc.model.BrojiloVrsta;

@Service
public class BrojiloVrstaService {
	@Autowired
	private BrojiloVrstaDao dao;
		
	public BrojiloVrsta findById (Long id) {
		return dao.findById(id);
	}

	public List<BrojiloVrsta> findAll () {
		return dao.findAll();
	}

	public Page<BrojiloVrsta> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public BrojiloVrsta save(BrojiloVrsta obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
