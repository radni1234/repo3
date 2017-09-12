package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Kotlarnica;

@Repository
public interface KotlarnicaDao extends PagingAndSortingRepository<Kotlarnica, Long> {

	Kotlarnica findById(Long id);
	
	@Query("SELECT k FROM Kotlarnica k "
			+ "where (k.javnoPreduzece in "
				+ "(select j from JavnoPreduzece j where j.mesto in "
				+ "(select m2 from Mesto m2 where m2.opstina = "
				+ "(select m.opstina from Mesto m where m = "
	 				+ "(select u.mesto from User u where username like :user)))) "
	 				+ " and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2)) "
			+ "or ((select a.id from User u inner join u.authorities a where u.id = "
				+ "(select u.id from User u where username like :user)) in (1))" )
	List<Kotlarnica> findAll(@Param("user") String user);
	
	@Query("SELECT k FROM Kotlarnica k "
			+ "where (k.javnoPreduzece in "
				+ "(select j from JavnoPreduzece j where j.mesto in "
				+ "(select m2 from Mesto m2 where m2.opstina = "
				+ "(select m.opstina from Mesto m where m = "
	 				+ "(select u.mesto from User u where username like :user)))) "
	 				+ " and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2)) "
			+ "or ((select a.id from User u inner join u.authorities a where u.id = "
				+ "(select u.id from User u where username like :user)) in (1))" )
	Page<Kotlarnica> findAll(Pageable pageRequest, @Param("user") String user);
}
