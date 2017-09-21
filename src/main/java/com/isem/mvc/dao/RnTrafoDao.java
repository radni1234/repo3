package com.isem.mvc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.RnTrafo;

@Repository
public interface RnTrafoDao extends PagingAndSortingRepository<RnTrafo, Long> {
	RnTrafo findById(Long id);
	
	List<RnTrafo> findAll();

	Page<RnTrafo> findAll(Pageable pageRequest);
	
	@Query("SELECT r FROM RnTrafo r where r.trafo.id = :trafo_id")
    public List<RnTrafo> findRnTrafoByTrafo(@Param("trafo_id") Long trafo_id);
	
	@Query("SELECT r FROM RnTrafo r where r.trafo.mesto.id = :mesto_id and DATE(datumr) = :datumr")
    public List<RnTrafo> findRnTrafoByMesto(@Param("mesto_id") Long mesto_id, @Param("datumr") Date datumr);
}
