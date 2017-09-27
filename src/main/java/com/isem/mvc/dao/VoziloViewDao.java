package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.VoziloView;

@Repository
public interface VoziloViewDao extends PagingAndSortingRepository<VoziloView, Long> {
	VoziloView findById(Long id);
	
	List<VoziloView> findAll();

	Page<VoziloView> findAll(Pageable pageRequest);
}
