package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.VodozahvatGrupa;

@Repository
public interface VodozahvatGrupaDao extends PagingAndSortingRepository<VodozahvatGrupa, Long> {
	VodozahvatGrupa findById(Long id);
	
	List<VodozahvatGrupa> findAll();

	Page<VodozahvatGrupa> findAll(Pageable pageRequest);
}
