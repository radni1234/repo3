package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.RnTrafoView;

@Repository
public interface RnTrafoViewDao extends PagingAndSortingRepository<RnTrafoView, Long> {
	RnTrafoView findById(Long id);
	
	List<RnTrafoView> findAll();

	Page<RnTrafoView> findAll(Pageable pageRequest);
	
	@Query("SELECT r FROM RnTrafoView r where r.trafoId = :trafo_id")
    public List<RnTrafoView> findRnTrafoViewByTrafo(@Param("trafo_id") Long trafo_id);
}
