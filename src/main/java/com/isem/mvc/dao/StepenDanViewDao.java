package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.isem.mvc.tab.StepenDanView;

public interface StepenDanViewDao extends Repository<StepenDanView, Long> {
	StepenDanView findById(Long id);
	
	List<StepenDanView> findAll();

	Page<StepenDanView> findAll(Pageable pageRequest);
}
