package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.Repository;

import com.isem.mvc.tab.VoziloView;

public interface VoziloViewDao extends Repository<VoziloView, Long> {
	
	@Query("select v from VoziloView v " 
			 + "where ((select a.id from User u inner join u.authorities a where u.id = "
 	 				+ "(select u.id from User u where username like :user)) in (1)"
 	 				+ ")"
 				+ "or" 
 					+ "(v.javnoPreduzeceId in "
 					+ "(select j.id from JavnoPreduzece j where mesto.id in " 		
			 		+ "(select m.id from Mesto m where m.opstina in "				 
			 		+ "(select m2.opstina from Mesto m2 where m2 in "
			 		+ "(select u.mesto from User u where username like :user))))"
			 	  + "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2,4)"
		 	 		+ ") "
	 	 		+ "or"
	 	 			+ "(v.javnoPreduzeceId in "
	 	 			+ "(select u.javnoPreduzece.id from User u where username like :user) " 
	 	 			+ ") "
		)
	List<VoziloView> findAll(@Param("user") String user);
	
	@Query("select v from VoziloView v " 
			 + "where ((select a.id from User u inner join u.authorities a where u.id = "
	 				+ "(select u.id from User u where username like :user)) in (1)"
	 				+ ")"
				+ "or" 
					+ "(v.javnoPreduzeceId in "
					+ "(select j.id from JavnoPreduzece j where mesto.id in " 		
			 		+ "(select m.id from Mesto m where m.opstina in "				 
			 		+ "(select m2.opstina from Mesto m2 where m2 in "
			 		+ "(select u.mesto from User u where username like :user))))"
			 	  + "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2,4)"
		 	 		+ ") "
	 	 		+ "or"
	 	 			+ "(v.javnoPreduzeceId in "
	 	 			+ "(select u.javnoPreduzece.id from User u where username like :user) " 
	 	 			+ ") "
		)
	Page<VoziloView> findAll(@Param("user") String user, Pageable pageRequest);
}
