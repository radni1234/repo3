package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Trafo;

@Repository
public interface TrafoDao extends PagingAndSortingRepository<Trafo, Long> {
	Trafo findById(Long id);
	
	List<Trafo> findAll();

	Page<Trafo> findAll(Pageable pageRequest);
	
	@Query("SELECT t FROM Trafo t  where t.mesto.id = :mesto_id")
    public List<Trafo> findTrafoByMesto(@Param("mesto_id") Long mesto_id);
}
