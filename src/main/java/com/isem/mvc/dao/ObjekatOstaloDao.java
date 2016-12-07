package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatOstalo;

@Repository
public interface ObjekatOstaloDao extends PagingAndSortingRepository<ObjekatOstalo, Long> {
	ObjekatOstalo findById(Long id);
	
	List<ObjekatOstalo> findAll();

	Page<ObjekatOstalo> findAll(Pageable pageRequest);
}
