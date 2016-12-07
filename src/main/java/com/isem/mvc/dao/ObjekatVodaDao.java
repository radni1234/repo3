package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatVoda;

@Repository
public interface ObjekatVodaDao extends PagingAndSortingRepository<ObjekatVoda, Long> {
	ObjekatVoda findById(Long id);
	
	List<ObjekatVoda> findAll();

	Page<ObjekatVoda> findAll(Pageable pageRequest);
}
