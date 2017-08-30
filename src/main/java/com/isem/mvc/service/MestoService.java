package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.MestoDao;
import com.isem.mvc.model.Mesto;

@Service
public class MestoService {
	
	@Autowired
	private MestoDao dao;
	
	public Mesto findById (Long id) {		
		return dao.findById(id);
	}	
	
	public List<Mesto> findMestoByOpstina(Long id){
		return dao.findMestoByOpstina(id);
	}
			
	public List<Mesto> findAll (String user) {
		return dao.findAll(user);
	}
	
	public Page<Mesto> findAll (Pageable pageRequest, String user) {
		return dao.findAll(pageRequest, user);
	}
			
	public Mesto save(Mesto obj) {
		return dao.save(obj);
	}		
	
	public void delete (Long id) {
		dao.delete(id);
	}
}
