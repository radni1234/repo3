package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.BrojiloKotlarnica;

@Repository
public interface BrojiloKotlarnicaDao extends PagingAndSortingRepository<BrojiloKotlarnica, Long> {
	BrojiloKotlarnica findById(Long id);
	
	List<BrojiloKotlarnica> findAll();

	Page<BrojiloKotlarnica> findAll(Pageable pageRequest);
	
	@Query("SELECT b FROM BrojiloKotlarnica b where b.kotlarnica.id = :id")
    public List<BrojiloKotlarnica> findBrojiloByKotlarnica(@Param("id") Long id);
}
