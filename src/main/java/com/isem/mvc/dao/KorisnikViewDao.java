package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.isem.mvc.tab.KorisnikView;

public interface KorisnikViewDao extends Repository<KorisnikView, Long> {
	List<KorisnikView> findAll();
	
	Page<KorisnikView> findAll(Pageable pageRequest);	
}
