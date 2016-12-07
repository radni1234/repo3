package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatStruja;

@Repository
public interface ObjekatStrujaDao extends PagingAndSortingRepository<ObjekatStruja, Long> {
	ObjekatStruja findById(Long id);
	
	List<ObjekatStruja> findAll();

	Page<ObjekatStruja> findAll(Pageable pageRequest);
	
}
