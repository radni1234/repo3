package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Podstanica;

@Repository
public interface PodstanicaDao extends PagingAndSortingRepository<Podstanica, Long> {
	Podstanica findById(Long id);
	
	List<Podstanica> findAll();

	Page<Podstanica> findAll(Pageable pageRequest);

}
