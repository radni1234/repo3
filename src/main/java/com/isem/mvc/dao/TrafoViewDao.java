package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.TrafoView;

@Repository
public interface TrafoViewDao extends PagingAndSortingRepository<TrafoView, Long> {
	TrafoView findById(Long id);
	
	List<TrafoView> findAll();

	Page<TrafoView> findAll(Pageable pageRequest);
}
