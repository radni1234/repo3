package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.VoziloKilometrazaDao;
import com.isem.mvc.model.VoziloKilometraza;

@Service
public class VoziloKilometrazaService {
	@Autowired
	private VoziloKilometrazaDao dao;
		
	public VoziloKilometraza findById (Long id) {
		return dao.findById(id);
	}

	public List<VoziloKilometraza> findAll () {
		return dao.findAll();
	}

	public Page<VoziloKilometraza> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<VoziloKilometraza> findVoziloKilometrazaByVozilo(Long vozilo_id) {		
		return dao.findVoziloKilometrazaByVozilo(vozilo_id);
	}

	public VoziloKilometraza save(VoziloKilometraza obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
