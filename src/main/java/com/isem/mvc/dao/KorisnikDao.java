package com.isem.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Korisnik;

@Repository
public interface KorisnikDao extends JpaRepository<Korisnik, Long>{
	//Korisnik save(Korisnik korisnik);
	
	Korisnik findByUsername (String userName);

}