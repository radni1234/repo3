package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Brojilo;

@Repository
public interface BrojiloDao extends PagingAndSortingRepository<Brojilo, Long> {
	Brojilo findById(Long id);
	
	List<Brojilo> findAll();

	Page<Brojilo> findAll(Pageable pageRequest);
	
	@Query("SELECT b FROM Brojilo b where b.objekat.id = :id")
    public List<Brojilo> findBrojiloByObjekat(@Param("id") Long id);
}
