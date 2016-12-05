package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Podgrupa;

@Repository
public interface PodgrupaDao extends PagingAndSortingRepository<Podgrupa, Long> {
	Podgrupa findById(Long id);
	
	List<Podgrupa> findAll();

	Page<Podgrupa> findAll(Pageable pageRequest);
}
