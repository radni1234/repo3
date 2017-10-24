package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Rezervoar;

@Repository
public interface RezervoarDao extends PagingAndSortingRepository<Rezervoar, Long> {
	Rezervoar findById(Long id);
	
	List<Rezervoar> findAll();

	Page<Rezervoar> findAll(Pageable pageRequest);
	
	@Query("SELECT r FROM Rezervoar r where r.vodozahvat.id = :id")
    public List<Rezervoar> findRezervoarByVodozahvat(@Param("id") Long id);
}
