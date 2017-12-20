package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.VoziloEmisionaKlasa;

@Repository
public interface VoziloEmisionaKlasaDao extends PagingAndSortingRepository<VoziloEmisionaKlasa, Long> {
	VoziloEmisionaKlasa findById(Long id);
	
	List<VoziloEmisionaKlasa> findAll();

	Page<VoziloEmisionaKlasa> findAll(Pageable pageRequest);
}
