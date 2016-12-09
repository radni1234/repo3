package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Pdv;

@Repository
public interface PdvDao extends PagingAndSortingRepository<Pdv, Long> {
	Pdv findById(Long id);
	
	List<Pdv> findAll();

	Page<Pdv> findAll(Pageable pageRequest);
}
