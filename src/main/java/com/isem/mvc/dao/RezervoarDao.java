package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Rezervoar;

@Repository
public interface RezervoarDao extends PagingAndSortingRepository<Rezervoar, Long> {
	Rezervoar findById(Long id);
	
	List<Rezervoar> findAll();

	Page<Rezervoar> findAll(Pageable pageRequest);
}
