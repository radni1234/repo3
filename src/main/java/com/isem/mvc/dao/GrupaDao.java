package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Grupa;

@Repository
public interface GrupaDao extends PagingAndSortingRepository<Grupa, Long> {
	Grupa findById(Long id);
	
	List<Grupa> findAll();

	Page<Grupa> findAll(Pageable pageRequest);
}
