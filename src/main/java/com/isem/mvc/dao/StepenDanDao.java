package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.StepenDan;

@Repository
public interface StepenDanDao extends PagingAndSortingRepository<StepenDan, Long> {
	StepenDan findById(Long id);
	
	List<StepenDan> findAll();

	Page<StepenDan> findAll(Pageable pageRequest);
	
	@Query("SELECT s FROM StepenDan s where s.opstina.id = :ops_id and s.godina = :god")
    public List<StepenDan> findStepenDanByOpsGod(@Param("ops_id") Long ops_id, @Param("god") Integer god);
	
}
