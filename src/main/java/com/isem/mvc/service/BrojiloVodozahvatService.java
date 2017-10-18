package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloVodozahvatDao;
import com.isem.mvc.model.BrojiloVodozahvat;

@Service
public class BrojiloVodozahvatService {
	@Autowired
	private BrojiloVodozahvatDao dao;
		
	public BrojiloVodozahvat findById (Long id) {
		return dao.findById(id);
	}

	public List<BrojiloVodozahvat> findAll () {
		return dao.findAll();
	}

	public Page<BrojiloVodozahvat> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public BrojiloVodozahvat save(BrojiloVodozahvat obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
