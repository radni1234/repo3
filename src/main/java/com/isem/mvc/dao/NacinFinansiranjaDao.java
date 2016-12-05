package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.NacinFinansiranja;

@Repository
public interface NacinFinansiranjaDao extends PagingAndSortingRepository<NacinFinansiranja, Long> {
	NacinFinansiranja findById(Long id);
	
	List<NacinFinansiranja> findAll();

	Page<NacinFinansiranja> findAll(Pageable pageRequest);
}
