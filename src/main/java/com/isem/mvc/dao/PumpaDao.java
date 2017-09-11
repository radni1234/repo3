package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Pumpa;

@Repository
public interface PumpaDao extends PagingAndSortingRepository<Pumpa, Long> {
	Pumpa findById(Long id);
	
	List<Pumpa> findAll();

	Page<Pumpa> findAll(Pageable pageRequest);

}
