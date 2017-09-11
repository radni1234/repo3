package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.PotrosnjaPodstanice;

@Repository
public interface PotrosnjaPodstaniceDao extends PagingAndSortingRepository<PotrosnjaPodstanice, Long> {
	PotrosnjaPodstanice findById(Long id);
	
	List<PotrosnjaPodstanice> findAll();

	Page<PotrosnjaPodstanice> findAll(Pageable pageRequest);
}
