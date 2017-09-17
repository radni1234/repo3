package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Svetiljka;

@Repository
public interface SvetiljkaDao extends PagingAndSortingRepository<Svetiljka, Long> {
	Svetiljka findById(Long id);
	
	List<Svetiljka> findAll();

	Page<Svetiljka> findAll(Pageable pageRequest);
}
