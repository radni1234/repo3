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
	private MestoDao mestoDao;
	
	public List<Mesto> findAll () {
		return mestoDao.findAll();
	}
	
	public Page<Mesto> findAll (Pageable pageRequest) {
		return mestoDao.findAll(pageRequest);
	}
	
	public Mesto findById (Long id) {		
		return mestoDao.findById(id);
	}	
	
	public List<Mesto> findMestoByOpstina(Long id){
		return mestoDao.findMestoByOpstina(id);
	}
		
	public Mesto save(Mesto mesto) {
		return mestoDao.save(mesto);
	}		
	
	public void delete (Long id) {
		mestoDao.delete(id);
	}
}
