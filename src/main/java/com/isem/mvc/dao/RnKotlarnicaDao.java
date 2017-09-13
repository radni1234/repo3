package com.isem.mvc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Rn;
import com.isem.mvc.model.RnKotlarnica;


@Repository
public interface RnKotlarnicaDao extends PagingAndSortingRepository<RnKotlarnica, Long> {
	RnKotlarnica findById(Long id);
	
	List<RnKotlarnica> findAll();

	Page<RnKotlarnica> findAll(Pageable pageRequest);
	
	@Query("SELECT r FROM RnKotlarnica r where r.brojilo in (select b from com.isem.mvc.model.BrojiloKotlarnica b where b.kotlarnica.id = :id)")
	List<Rn> findRnByKotlarnica(@Param("id") Long id);
	
	@Query("SELECT count(*) FROM RnKotlarnica r where r.brojilo.id = :brojilo_id and DATE(r.datumr) = :datumr")
	Long proveriRacun(@Param("datumr") Date datumr, @Param("brojilo_id") Long brojilo_id);
}
