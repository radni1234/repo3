package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.isem.mvc.tab.EnergentView;

public interface EnergentViewDao extends Repository<EnergentView, Long> {
	EnergentView findById(Long id);
	
	List<EnergentView> findAll();

	Page<EnergentView> findAll(Pageable pageRequest);
}
