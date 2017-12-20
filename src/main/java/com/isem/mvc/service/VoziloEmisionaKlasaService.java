package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.VoziloEmisionaKlasaDao;
import com.isem.mvc.model.VoziloEmisionaKlasa;

@Service
public class VoziloEmisionaKlasaService {
	@Autowired
	private VoziloEmisionaKlasaDao dao;
		
	public VoziloEmisionaKlasa findById (Long id) {
		return dao.findById(id);
	}

	public List<VoziloEmisionaKlasa> findAll () {
		return dao.findAll();
	}

	public Page<VoziloEmisionaKlasa> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}

	public VoziloEmisionaKlasa save(VoziloEmisionaKlasa obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
