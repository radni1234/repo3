package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.isem.mvc.model.Uloga;

public interface UlogaDao extends PagingAndSortingRepository<Uloga, Long> {
	Uloga findById(Long id);
	
	List<Uloga> findAll();
}
