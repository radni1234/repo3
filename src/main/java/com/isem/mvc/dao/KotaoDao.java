package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Kotao;

@Repository
public interface KotaoDao extends PagingAndSortingRepository<Kotao, Long> {
	Kotao findById(Long id);
	
	List<Kotao> findAll();

	Page<Kotao> findAll(Pageable pageRequest);
}
