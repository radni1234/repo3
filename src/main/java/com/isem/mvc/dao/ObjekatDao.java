package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Objekat;

@Repository
public interface ObjekatDao extends PagingAndSortingRepository<Objekat, Long> {
	Objekat findById(Long id);
	
	List<Objekat> findAll();

	Page<Objekat> findAll(Pageable pageRequest);
}
