package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Korisnik;

@Repository
public interface KorisnikDao extends PagingAndSortingRepository<Korisnik, Long>{
	//Korisnik save(Korisnik korisnik);
	
	Korisnik findByUsername (String userName);
	List<Korisnik> findAll();

}