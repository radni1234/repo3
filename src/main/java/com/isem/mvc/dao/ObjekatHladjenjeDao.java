package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatHladjenje;

@Repository
public interface ObjekatHladjenjeDao extends PagingAndSortingRepository<ObjekatHladjenje, Long> {
	ObjekatHladjenje findById(Long id);
	
	List<ObjekatHladjenje> findAll();

	Page<ObjekatHladjenje> findAll(Pageable pageRequest);
}
