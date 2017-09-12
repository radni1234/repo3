package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Kotao;

@Repository
public interface KotaoDao extends PagingAndSortingRepository<Kotao, Long> {
	Kotao findById(Long id);
	
	List<Kotao> findAll();

	Page<Kotao> findAll(Pageable pageRequest);
	
	@Query("SELECT k FROM Kotao k where k.kotlarnica.id = :id")
    public List<Kotao> findKotaoByKotlarnica(@Param("id") Long id);
}
