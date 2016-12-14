package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.KolonaTipDao;
import com.isem.mvc.model.KolonaTip;

@Service
public class KolonaTipService {
	@Autowired
	private KolonaTipDao dao;
		
	public KolonaTip findById (Long id) {
		return dao.findById(id);
	}

	public List<KolonaTip> findAll () {
		return dao.findAll();
	}

	public Page<KolonaTip> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public KolonaTip save(KolonaTip obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}

}
