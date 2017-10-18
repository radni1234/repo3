package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Vodozahvat;

@Repository
public interface VodozahvatDao extends PagingAndSortingRepository<Vodozahvat, Long> {
	Vodozahvat findById(Long id);
	
	List<Vodozahvat> findAll();

	Page<Vodozahvat> findAll(Pageable pageRequest);
}
