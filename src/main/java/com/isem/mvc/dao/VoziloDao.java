package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Vozilo;

@Repository
public interface VoziloDao extends PagingAndSortingRepository<Vozilo, Long> {
	Vozilo findById(Long id);
	
	List<Vozilo> findAll();

	Page<Vozilo> findAll(Pageable pageRequest);
}
