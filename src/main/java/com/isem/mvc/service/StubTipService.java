package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.StubTipDao;
import com.isem.mvc.model.StubTip;

@Service
public class StubTipService {
	@Autowired
	private StubTipDao dao;
		
	public StubTip findById (Long id) {
		return dao.findById(id);
	}

	public List<StubTip> findAll () {
		return dao.findAll();
	}

	public Page<StubTip> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public StubTip save(StubTip obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
