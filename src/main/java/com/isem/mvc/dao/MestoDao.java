package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.isem.mvc.model.Mesto;

public interface MestoDao extends PagingAndSortingRepository<Mesto, Long> {
	
	Mesto findById(Long id);
	
	List<Mesto> findAll();
	
	Page<Mesto> findAll(Pageable pageRequest);
}
