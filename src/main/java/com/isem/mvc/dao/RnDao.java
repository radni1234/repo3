package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Rn;

@Repository
public interface RnDao extends PagingAndSortingRepository<Rn, Long> {
	Rn findById(Long id);
	
	List<Rn> findAll();

	Page<Rn> findAll(Pageable pageRequest);
}
