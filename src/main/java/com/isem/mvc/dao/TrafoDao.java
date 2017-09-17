package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Trafo;

@Repository
public interface TrafoDao extends PagingAndSortingRepository<Trafo, Long> {
	Trafo findById(Long id);
	
	List<Trafo> findAll();

	Page<Trafo> findAll(Pageable pageRequest);
}
