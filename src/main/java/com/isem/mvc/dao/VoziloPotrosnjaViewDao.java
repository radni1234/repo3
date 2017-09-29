package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.VoziloPotrosnjaView;

@Repository
public interface VoziloPotrosnjaViewDao extends PagingAndSortingRepository<VoziloPotrosnjaView, Long> {
	VoziloPotrosnjaView findById(Long id);
	
	List<VoziloPotrosnjaView> findAll();

	Page<VoziloPotrosnjaView> findAll(Pageable pageRequest);
	
	@Query("SELECT v FROM VoziloPotrosnjaView v where v.voziloId = :id")
    public List<VoziloPotrosnjaView> findPotrosnjaViewByVozilo(@Param("id") Long id);
}
