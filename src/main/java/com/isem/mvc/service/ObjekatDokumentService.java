package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.ObjekatDokumentDao;
import com.isem.mvc.model.ObjekatDokument;

@Service
public class ObjekatDokumentService {
	@Autowired
	private ObjekatDokumentDao dao;
		
	public ObjekatDokument findById (Long id) {
		return dao.findById(id);
	}
	
	public ObjekatDokument findByDokument (String dokument) {
		return dao.findByDokument(dokument);
	}

	public List<ObjekatDokument> findAll () {
		return dao.findAll();
	}

	public Page<ObjekatDokument> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<ObjekatDokument> findDokumentByObjekat(Long obj_id) {		
		return dao.findDokumentByObjekat(obj_id);
	}

	public ObjekatDokument save(ObjekatDokument obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
	
	public void deleteByDokument (String dokument) {
		dao.deleteByDokument(dokument);
	}

}
