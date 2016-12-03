package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.isem.mvc.model.Godina;

public interface GodinaDao extends PagingAndSortingRepository<Godina, Long> {
	Godina findById(Long id);
	
	List<Godina> findAll();
	
	Page<Godina> findAll(Pageable pageRequest);
}
