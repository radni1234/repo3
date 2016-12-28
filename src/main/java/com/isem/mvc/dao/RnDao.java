package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Rn;
import com.isem.mvc.model.Brojilo;

@SuppressWarnings("unused")
@Repository
public interface RnDao extends PagingAndSortingRepository<Rn, Long> {
	Rn findById(Long id);
	
	List<Rn> findAll();

	Page<Rn> findAll(Pageable pageRequest);
	
	@Query("SELECT r FROM Rn r where r.brojilo in (select b from com.isem.mvc.model.Brojilo b where b.objekat.id = :id)")
	List<Rn> findRnByObjekat(@Param("id") Long id);
}
