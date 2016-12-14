package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.RnTipDao;
import com.isem.mvc.model.RnTip;

@Service
public class RnTipService {
	@Autowired
	private RnTipDao dao;
		
	public RnTip findById (Long id) {
		return dao.findById(id);
	}

	public List<RnTip> findAll () {
		return dao.findAll();
	}

	public Page<RnTip> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public RnTip save(RnTip obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
}
