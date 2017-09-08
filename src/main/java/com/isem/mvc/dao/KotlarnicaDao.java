package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Kotlarnica;

@Repository
public interface KotlarnicaDao extends PagingAndSortingRepository<Kotlarnica, Long> {

	Kotlarnica findById(Long id);
		
	List<Kotlarnica> findAll();
	
	Page<Kotlarnica> findAll(Pageable pageRequest);
}
