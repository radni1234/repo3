package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.SvetiljkaView;

@Repository
public interface SvetiljkaViewDao extends PagingAndSortingRepository<SvetiljkaView, Long> {
	SvetiljkaView findById(Long id);
	
	List<SvetiljkaView> findAll();

	Page<SvetiljkaView> findAll(Pageable pageRequest);
	
	@Query("SELECT s FROM SvetiljkaView s where s.stubId = :stub_id order by s.stubAdresa")
	List<SvetiljkaView> findSvetiljkaViewByStub(@Param("stub_id") Long id);
}
