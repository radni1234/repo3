package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.RnTip;

@Repository
public interface RnTipDao extends PagingAndSortingRepository<RnTip, Long> {
	RnTip findById(Long id);
	
	List<RnTip> findAll();

	Page<RnTip> findAll(Pageable pageRequest);
}
