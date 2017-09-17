package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Stub;

@Repository
public interface StubDao extends PagingAndSortingRepository<Stub, Long> {
	Stub findById(Long id);
	
	List<Stub> findAll();

	Page<Stub> findAll(Pageable pageRequest);
}
