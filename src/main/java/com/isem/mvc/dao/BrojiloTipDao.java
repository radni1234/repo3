package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.BrojiloTip;

@Repository
public interface BrojiloTipDao extends PagingAndSortingRepository<BrojiloTip, Long> {
	BrojiloTip findById(Long id);
	
	List<BrojiloTip> findAll();

	Page<BrojiloTip> findAll(Pageable pageRequest);
}
