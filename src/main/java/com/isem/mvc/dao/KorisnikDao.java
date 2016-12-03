package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Korisnik;

@Repository
public interface KorisnikDao extends PagingAndSortingRepository<Korisnik, Long>{
	
	Korisnik findByUsername (String userName);
	
	Korisnik findById(Long id);
	
	List<Korisnik> findAll();
	
	Page<Korisnik> findAll(Pageable pageRequest);	

}

