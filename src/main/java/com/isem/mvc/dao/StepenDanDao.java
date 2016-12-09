package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.StepenDan;

@Repository
public interface StepenDanDao extends PagingAndSortingRepository<StepenDan, Long> {
	StepenDan findById(Long id);
	
	List<StepenDan> findAll();

	Page<StepenDan> findAll(Pageable pageRequest);
	
}
