package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.model.ObjekatMere;

public interface ObjekatMereDao extends PagingAndSortingRepository<ObjekatMere, Long> {
	ObjekatMere findById(Long id);
	
	List<ObjekatMere> findAll();

	Page<ObjekatMere> findAll(Pageable pageRequest);
	
	@Query("SELECT m FROM ObjekatMere m where m.objekat.id = :id")
    public List<ObjekatMere> findObjekatMereByObjekat(@Param("id") Long id);
}
