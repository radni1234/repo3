package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.JavnoPreduzece;

@Repository
public interface JavnoPreduzeceDao extends PagingAndSortingRepository<JavnoPreduzece, Long> {

	JavnoPreduzece findById(Long id);
		
	List<JavnoPreduzece> findAll();
	
	Page<JavnoPreduzece> findAll(Pageable pageRequest);
}
