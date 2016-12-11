package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.StubTip;

@Repository
public interface StubTipDao extends PagingAndSortingRepository<StubTip, Long> {
	StubTip findById(Long id);
	
	List<StubTip> findAll();

	Page<StubTip> findAll(Pageable pageRequest);
}
