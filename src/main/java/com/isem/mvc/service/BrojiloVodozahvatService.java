package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.BrojiloVodozahvatDao;
import com.isem.mvc.dao.BrojiloVodozahvatViewDao;
import com.isem.mvc.model.BrojiloVodozahvat;
import com.isem.mvc.tab.BrojiloVodozahvatView;

@Service
public class BrojiloVodozahvatService {
	@Autowired
	private BrojiloVodozahvatDao dao;
	
	@Autowired
	private BrojiloVodozahvatViewDao daoView;
		
	public BrojiloVodozahvat findById (Long id) {
		return dao.findById(id);
	}

	public List<BrojiloVodozahvat> findAll () {
		return dao.findAll();
	}

	public Page<BrojiloVodozahvat> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<BrojiloVodozahvat> findBrojiloByVodozahvat(Long id){
		return dao.findBrojiloByVodozahvat(id);
	}
	
	public BrojiloVodozahvatView findByIdView (Long id) {
		return daoView.findById(id);
	}

	public List<BrojiloVodozahvatView> findAllView () {
		return daoView.findAll();
	}

	public Page<BrojiloVodozahvatView> findAllView (Pageable pageRequest) {
		return daoView.findAll(pageRequest);
	}
		
	public List<BrojiloVodozahvatView> findBrojiloViewByVodozahvat(Long vodozahvat_id) {		
		return daoView.findBrojiloViewByVodozahvat(vodozahvat_id);
	}

	public BrojiloVodozahvat save(BrojiloVodozahvat obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
