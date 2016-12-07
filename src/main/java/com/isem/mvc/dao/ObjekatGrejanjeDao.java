package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatGrejanje;

@Repository
public interface ObjekatGrejanjeDao extends PagingAndSortingRepository<ObjekatGrejanje, Long> {
	ObjekatGrejanje findById(Long id);
	
	List<ObjekatGrejanje> findAll();

	Page<ObjekatGrejanje> findAll(Pageable pageRequest);
}
