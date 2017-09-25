package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.VoziloPotrosnja;

@Repository
public interface VoziloPotrosnjaDao extends PagingAndSortingRepository<VoziloPotrosnja, Long> {
	VoziloPotrosnja findById(Long id);
	
	List<VoziloPotrosnja> findAll();

	Page<VoziloPotrosnja> findAll(Pageable pageRequest);
}
