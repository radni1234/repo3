package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.DeloviObjekta;

@Repository
public interface DeloviObjektaDao extends PagingAndSortingRepository<DeloviObjekta, Long> {
	DeloviObjekta findById(Long id);
	
	List<DeloviObjekta> findAll();

	Page<DeloviObjekta> findAll(Pageable pageRequest);

}
