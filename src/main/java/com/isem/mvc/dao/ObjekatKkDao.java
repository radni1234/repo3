package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatKk;

@Repository
public interface ObjekatKkDao extends PagingAndSortingRepository<ObjekatKk, Long> {
	ObjekatKk findById(Long id);
	
	List<ObjekatKk> findAll();

	Page<ObjekatKk> findAll(Pageable pageRequest);
}
