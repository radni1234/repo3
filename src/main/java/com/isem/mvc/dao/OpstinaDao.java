package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Opstina;

@Repository
public interface OpstinaDao extends PagingAndSortingRepository<Opstina, Long> {
	Opstina findByNaziv(String naziv);
	
	Opstina findById(Long id);
	
	@Query("select o from Opstina o "
			+ "where o in (select m.opstina from Mesto m where m in "
	 			+ "(select u.mesto from User u where username like :user))"
		   )
	List<Opstina> findAll(@Param("user") String user);
	
	@Query("select o from Opstina o "
			+ "where o in (select m.opstina from Mesto m where m in "
	 			+ "(select u.mesto from User u where username like :user))"
		   )
	Page<Opstina> findAll(Pageable pageRequest, @Param("user") String user);
}

