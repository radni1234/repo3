package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatToplaVoda;

@Repository
public interface ObjekatToplaVodaDao extends PagingAndSortingRepository<ObjekatToplaVoda, Long> {
	ObjekatToplaVoda findById(Long id);
	
	List<ObjekatToplaVoda> findAll();

	Page<ObjekatToplaVoda> findAll(Pageable pageRequest);
}
