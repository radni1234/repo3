package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Podgrupa;

@Repository
public interface PodgrupaDao extends PagingAndSortingRepository<Podgrupa, Long> {
	Podgrupa findById(Long id);
	
	List<Podgrupa> findAll();

	Page<Podgrupa> findAll(Pageable pageRequest);
	
	@Query("SELECT p FROM Podgrupa p where p.grupa.id = :id")
    public List<Podgrupa> findPodgrupaByGrupa(@Param("id") Long id);
}
