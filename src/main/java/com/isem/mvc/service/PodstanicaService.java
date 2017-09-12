package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.PodstanicaDao;
import com.isem.mvc.model.Podstanica;

@Service
public class PodstanicaService {

	@Autowired
	private PodstanicaDao dao;
		
	public Podstanica findById (Long id) {
		return dao.findById(id);
	}
	
	public List<Podstanica> findAll () {
		return dao.findAll();
	}
	
	public Page<Podstanica> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<Podstanica> findPodstanicaByKotlarnica(Long id){
		return dao.findPodstanicaByKotlarnica(id);
	}
	
	public Podstanica save(Podstanica obj) {
		return dao.save(obj);
	}
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
