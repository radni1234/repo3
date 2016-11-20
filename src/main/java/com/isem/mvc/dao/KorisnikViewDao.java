package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.isem.mvc.view.KorisnikView;

public interface KorisnikViewDao extends Repository<KorisnikView, Long> {
	List<KorisnikView> findAll();
}
