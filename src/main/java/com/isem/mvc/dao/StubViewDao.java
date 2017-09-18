package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.StubView;

@Repository
public interface StubViewDao extends PagingAndSortingRepository<StubView, Long> {
	StubView findById(Long id);
	
	List<StubView> findAll();

	Page<StubView> findAll(Pageable pageRequest);
	
	@Query("SELECT s FROM StubView s where s.trafoId = :trafo_id order by s.rbr")
	List<StubView> findStubViewByTrafo(@Param("trafo_id") Long trafo_id);
}
