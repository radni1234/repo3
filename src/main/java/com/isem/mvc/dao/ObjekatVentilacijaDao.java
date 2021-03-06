package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatVentilacija;

@Repository
public interface ObjekatVentilacijaDao extends PagingAndSortingRepository<ObjekatVentilacija, Long> {
	ObjekatVentilacija findById(Long id);
	
	List<ObjekatVentilacija> findAll();

	Page<ObjekatVentilacija> findAll(Pageable pageRequest);

}
