package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.isem.mvc.view.ObjekatView;


public interface ObjekatViewDao extends Repository<ObjekatView, Long> {
	List<ObjekatView> findAll();
	
	Page<ObjekatView> findAll(Pageable pageRequest);	
}
