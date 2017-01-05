package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloVrstaKoloneDao;
import com.isem.mvc.model.BrojiloVrstaKolone;

@Service
public class BrojiloVrstaKoloneService {
	@Autowired
	private BrojiloVrstaKoloneDao dao;
		
	public BrojiloVrstaKolone findById (Long id) {
		return dao.findById(id);
	}

	public List<BrojiloVrstaKolone> findAll () {
		return dao.findAll();
	}

	public Page<BrojiloVrstaKolone> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<BrojiloVrstaKolone> findBrojiloVrstaKoloneByBrojiloVrsta (Long id) {
		return dao.findBrojiloVrstaKoloneByBrojiloVrsta(id);
	}

	public BrojiloVrstaKolone save(BrojiloVrstaKolone obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
