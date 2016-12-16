package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.isem.mvc.view.DobavljacView;

public interface DobavljacViewDao extends Repository<DobavljacView, Long> {
	DobavljacView findById(Long id);
	
	List<DobavljacView> findAll();

	Page<DobavljacView> findAll(Pageable pageRequest);
}
