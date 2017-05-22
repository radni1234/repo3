package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.isem.mvc.tab.BrojiloView;


public interface BrojiloViewDao extends Repository<BrojiloView, Long> {
	BrojiloView findById(Long id);
	
	List<BrojiloView> findAll();

	Page<BrojiloView> findAll(Pageable pageRequest);
}
