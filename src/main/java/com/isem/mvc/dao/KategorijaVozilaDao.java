package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.KategorijaVozila;

@Repository
public interface KategorijaVozilaDao extends PagingAndSortingRepository<KategorijaVozila, Long> {
	KategorijaVozila findById(Long id);
	
	List<KategorijaVozila> findAll();

	Page<KategorijaVozila> findAll(Pageable pageRequest);

}
