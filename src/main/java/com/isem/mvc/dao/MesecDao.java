package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Mesec;

@Repository
public interface MesecDao extends PagingAndSortingRepository<Mesec, Long> {
	Mesec findById(Long id);
	
	List<Mesec> findAll();
	
	Page<Mesec> findAll(Pageable pageRequest);
}
