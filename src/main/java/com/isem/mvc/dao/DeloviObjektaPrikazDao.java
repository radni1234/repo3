package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.isem.mvc.model.DeloviObjektaPrikaz;

public interface DeloviObjektaPrikazDao extends PagingAndSortingRepository<DeloviObjektaPrikaz, Long> {
	DeloviObjektaPrikaz findById(Long id);
	
	List<DeloviObjektaPrikaz> findAll();

	Page<DeloviObjektaPrikaz> findAll(Pageable pageRequest);
}
