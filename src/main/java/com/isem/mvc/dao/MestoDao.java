package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.model.Mesto;

public interface MestoDao extends PagingAndSortingRepository<Mesto, Long> {
	
	Mesto findById(Long id);
	
	@Query("SELECT m FROM Mesto m "
			+ "where (m.opstina = "
				+ "(select m.opstina from Mesto m where m = "
	 			+ "(select u.mesto from User u where username like :user)) "
	 			+ " and (select a.id from User u inner join u.authorities a where u.id = "
	 	 		+ "(select u.id from User u where username like :user)) in (2,3,4)) "
 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
 	 			+ "(select u.id from User u where username like :user)) in (1))"
	 			)
	List<Mesto> findAll(@Param("user") String user);
	
	@Query("SELECT m FROM Mesto m "
			+ "where (m.opstina = "
				+ "(select m.opstina from Mesto m where m = "
	 			+ "(select u.mesto from User u where username like :user)) "
	 			+ " and (select a.id from User u inner join u.authorities a where u.id = "
	 	 		+ "(select u.id from User u where username like :user)) in (2,3,4)) "
	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
	 			+ "(select u.id from User u where username like :user)) in (1))")
	Page<Mesto> findAll(Pageable pageRequest, @Param("user") String user);
	
	@Query("SELECT m FROM Mesto m where m.opstina.id = :id")
    public List<Mesto> findMestoByOpstina(@Param("id") Long id);
}
