package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.RezimMerenja;

@Repository
public interface RezimMerenjaDao extends PagingAndSortingRepository<RezimMerenja, Long> {
	RezimMerenja findById(Long id);
	
	List<RezimMerenja> findAll();

	Page<RezimMerenja> findAll(Pageable pageRequest);
}
