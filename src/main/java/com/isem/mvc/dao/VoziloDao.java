package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Vozilo;

@Repository
public interface VoziloDao extends PagingAndSortingRepository<Vozilo, Long> {
	Vozilo findById(Long id);
	
	@Query("select v from Vozilo v " 
			 + "where ((select a.id from User u inner join u.authorities a where u.id = "
	 				+ "(select u.id from User u where username like :user)) in (1)"
	 				+ ")"
				+ "or" 
					+ "(v.javnoPreduzece.id in "
					+ "(select j.id from JavnoPreduzece j where mestoId in " 		
			 		+ "(select m.id from Mesto m where m.opstina in "				 
			 		+ "(select m2.opstina from Mesto m2 where m2 in "
			 		+ "(select u.mesto from User u where username like :user))))"
			 	  + "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2,4)"
		 	 		+ ") "
	 	 		+ "or"
	 	 			+ "(v.javnoPreduzece.id in "
	 	 			+ "(select u.javnoPreduzece.id from User u where username like :user) " 
	 	 			+ ") "
		)
	List<Vozilo> findAll();
	
	@Query("select v from Vozilo v " 
			 + "where ((select a.id from User u inner join u.authorities a where u.id = "
	 				+ "(select u.id from User u where username like :user)) in (1)"
	 				+ ")"
				+ "or" 
					+ "(v.javnoPreduzece.id in "
					+ "(select j.id from JavnoPreduzece j where mestoId in " 		
			 		+ "(select m.id from Mesto m where m.opstina in "				 
			 		+ "(select m2.opstina from Mesto m2 where m2 in "
			 		+ "(select u.mesto from User u where username like :user))))"
			 	  + "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2,4)"
		 	 		+ ") "
	 	 		+ "or"
	 	 			+ "(v.javnoPreduzece.id in "
	 	 			+ "(select u.javnoPreduzece.id from User u where username like :user) " 
	 	 			+ ") "
		)
	Page<Vozilo> findAll(Pageable pageRequest);
}
