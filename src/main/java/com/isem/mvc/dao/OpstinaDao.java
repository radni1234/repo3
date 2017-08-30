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
			+ "where (o in (select m.opstina from Mesto m where m in "
	 			+ "(select u.mesto from User u where username like :user)) "
	 			+ " and (select a.id from User u inner join u.authorities a where u.id = "
	 	 		+ "(select u.id from User u where username like :user)) in (2,3,4)) "
 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
 	 			+ "(select u.id from User u where username like :user)) in (1))"
		   )
	List<Opstina> findAll(@Param("user") String user);
	
	@Query("select o from Opstina o "
			+ "where (o in (select m.opstina from Mesto m where m in "
	 			+ "(select u.mesto from User u where username like :user)) "
	 			+ " and (select a.id from User u inner join u.authorities a where u.id = "
	 	 		+ "(select u.id from User u where username like :user)) in (2,3,4)) "
	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
	 			+ "(select u.id from User u where username like :user)) in (1))"
		   )
	Page<Opstina> findAll(Pageable pageRequest, @Param("user") String user);
}

