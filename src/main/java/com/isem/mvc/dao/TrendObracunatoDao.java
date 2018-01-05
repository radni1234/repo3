package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.TrendObracunato;

@Repository
public interface TrendObracunatoDao extends PagingAndSortingRepository<TrendObracunato, Long> {
	TrendObracunato findById(Long id);
	
	List<TrendObracunato> findAll();

	Page<TrendObracunato> findAll(Pageable pageRequest);
}
