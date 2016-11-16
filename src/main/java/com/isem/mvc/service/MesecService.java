package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.MesecDao;
import com.isem.mvc.model.Mesec;

@Service
public class MesecService {
	@Autowired
	private MesecDao mesecDao;	
	
	public Mesec findById (Long id) {
		return mesecDao.findById(id);
	}
	
	public List<Mesec> findAll () {
		return mesecDao.findAll();
	}
	
	public Page<Mesec> findAll (Pageable pageRequest) {
		return mesecDao.findAll(pageRequest);
	}
	
	public Mesec save(Mesec o) {
		return mesecDao.save(o);
	}
	
	public void delete(Long id) {
		mesecDao.delete(id);
	}
}
