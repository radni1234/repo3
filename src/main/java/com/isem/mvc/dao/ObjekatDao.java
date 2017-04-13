package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Objekat;

@Repository
public interface ObjekatDao extends PagingAndSortingRepository<Objekat, Long>{
	
	
	
	Objekat findById(Long id);	
	
	
	@Query("select o from Objekat o where o.mesto.id in "
			 + "(select m from Mesto m where m.opstina in "				 
			 + "(select m2.opstina from Mesto m2 where m2 in "
			 + "(select k.mesto from Korisnik k where username like :user)))"
		  )
	List<Objekat> findAll(@Param("user") String user);


	Page<Objekat> findAll(Pageable pageRequest);

}
