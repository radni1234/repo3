package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ProizvodnjaVodeDao;
import com.isem.mvc.model.ProizvodnjaVode;

@Service
public class ProizvodnjaVodeService {
	@Autowired
	private ProizvodnjaVodeDao dao;
		
	public ProizvodnjaVode findById (Long id) {
		return dao.findById(id);
	}

	public List<ProizvodnjaVode> findAll () {
		return dao.findAll();
	}

	public Page<ProizvodnjaVode> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<ProizvodnjaVode> findProizvodnjaVodeByVodozahvat(Long id){
		return dao.findProizvodnjaVodeByVodozahvat(id);
	}

	public ProizvodnjaVode save(ProizvodnjaVode obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
