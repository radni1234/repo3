package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.VodozahvatPumpa;

@Repository
public interface VodozahvatPumpaDao extends PagingAndSortingRepository<VodozahvatPumpa, Long> {
	VodozahvatPumpa findById(Long id);
	
	List<VodozahvatPumpa> findAll();

	Page<VodozahvatPumpa> findAll(Pageable pageRequest);
	
	@Query("SELECT p FROM VodozahvatPumpa p where p.vodozahvat.id = :id")
    public List<VodozahvatPumpa> findPumpaByVodozahvat(@Param("id") Long id);
}
