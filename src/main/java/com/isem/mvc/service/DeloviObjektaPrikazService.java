package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.DeloviObjektaPrikazDao;
import com.isem.mvc.model.DeloviObjektaPrikaz;

@Service
public class DeloviObjektaPrikazService {
	@Autowired
	private DeloviObjektaPrikazDao dao;
		
	public DeloviObjektaPrikaz findById (Long id) {
		return dao.findById(id);
	}

	public List<DeloviObjektaPrikaz> findAll () {
		return dao.findAll();
	}

	public Page<DeloviObjektaPrikaz> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public DeloviObjektaPrikaz save(DeloviObjektaPrikaz obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
