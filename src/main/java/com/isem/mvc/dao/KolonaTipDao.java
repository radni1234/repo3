package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.KolonaTip;

@Repository
public interface KolonaTipDao extends PagingAndSortingRepository<KolonaTip, Long> {
	KolonaTip findById(Long id);
	
	List<KolonaTip> findAll();

	Page<KolonaTip> findAll(Pageable pageRequest);
	
}
