package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Dobavljac;

@Repository
public interface DobavljacDao extends PagingAndSortingRepository<Dobavljac, Long> {
	Dobavljac findById(Long id);
	
	List<Dobavljac> findAll();

	Page<Dobavljac> findAll(Pageable pageRequest);

}
