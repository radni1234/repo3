package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Opstina;

@Repository
public interface OpstinaDao extends PagingAndSortingRepository<Opstina, Long> {
	Opstina findByNaziv(String naziv);
	
	Opstina findById(Long id);
	
	List<Opstina> findAll();
}

