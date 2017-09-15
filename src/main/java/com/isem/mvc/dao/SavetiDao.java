package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.isem.mvc.model.Saveti;

public interface SavetiDao extends PagingAndSortingRepository<Saveti, Long> {
	Saveti findById(Long id);
		
	List<Saveti> findAll();
	
	Page<Saveti> findAll(Pageable pageRequest);
}
