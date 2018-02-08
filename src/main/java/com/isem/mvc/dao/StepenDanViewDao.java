package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.StepenDanView;

public interface StepenDanViewDao extends Repository<StepenDanView, Long> {
	StepenDanView findById(Long id);
	
	List<StepenDanView> findAll();

	Page<StepenDanView> findAll(Pageable pageRequest);
	
	@Query("SELECT s FROM StepenDanView s where s.opstinaId = :ops_id and s.godina = :god")
    public List<StepenDanView> findStepenDanViewByOpsGod(@Param("ops_id") Long ops_id, @Param("god") Integer god);
}