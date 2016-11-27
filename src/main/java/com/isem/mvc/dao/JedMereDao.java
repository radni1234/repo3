package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.isem.mvc.model.JedMere;

public interface JedMereDao extends PagingAndSortingRepository<JedMere, Long> {
	JedMere findById(Long id);
	
	List<JedMere> findAll();
	
	Page<JedMere> findAll(Pageable pageRequest);
}
