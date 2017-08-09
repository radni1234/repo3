package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloVrstaKoloneDao;
import com.isem.mvc.dao.BrojiloVrstaKoloneViewDao;
import com.isem.mvc.model.BrojiloVrstaKolone;
import com.isem.mvc.tab.BrojiloVrstaKoloneView;

@Service
public class BrojiloVrstaKoloneService {
	@Autowired
	private BrojiloVrstaKoloneDao dao;
	
	@Autowired
	private BrojiloVrstaKoloneViewDao daoView;
		
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
	
	public List<BrojiloVrstaKolone> findBrojiloVrstaKoloneByBrojilo(Long id) {
		return dao.findBrojiloVrstaKoloneByBrojilo(id);
	}
	
	public BrojiloVrstaKoloneView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<BrojiloVrstaKoloneView> findAllView () {
		return daoView.findAll();
	}

	public Page<BrojiloVrstaKoloneView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}
	
	public List<BrojiloVrstaKoloneView> findBrojiloVrstaKoloneViewByBrojiloVrsta (Long id) {
		return daoView.findBrojiloVrstaKoloneViewByBrojiloVrsta(id);
	}

	public BrojiloVrstaKolone save(BrojiloVrstaKolone obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
