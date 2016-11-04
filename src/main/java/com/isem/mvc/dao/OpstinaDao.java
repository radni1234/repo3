package com.isem.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Opstina;

@Repository
public interface OpstinaDao extends JpaRepository<Opstina, Long> {
	Opstina findByNaziv(String naziv);
	
	Opstina findById(Long id);
}

