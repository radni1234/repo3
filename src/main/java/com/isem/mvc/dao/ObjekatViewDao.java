package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.ObjekatView;


public interface ObjekatViewDao extends Repository<ObjekatView, Long> {
	
	@Query("select o from Objekat o " 
			 + "where "
			 	+ "(o.mesto.id in "
			 		+ "(select m from Mesto m where m.opstina in "				 
			 		+ "(select m2.opstina from Mesto m2 where m2 in "
			 		+ "(select u.mesto from User u where username like :user)))"
			 	  + "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (1,2,4)"
	 	 		+ ") "
	 	 		+ "or"
	 	 		+ "(o.id in "
	 	 			+ "(select o.id from User u inner join u.objekti o where username like :user)"
	 			  + "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (3)"
	 	 		+ "	)"
		  )
	List<ObjekatView> findAll(@Param("user") String user);
	
	@Query("select o from Objekat o " 
			 + "where "
			 	+ "(o.mesto.id in "
			 		+ "(select m from Mesto m where m.opstina in "				 
			 		+ "(select m2.opstina from Mesto m2 where m2 in "
			 		+ "(select u.mesto from User u where username like :user)))"
			 	  + "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (1,2,4)"
	 	 		+ ") "
	 	 		+ "or"
	 	 		+ "(o.id in "
	 	 			+ "(select o.id from User u inner join u.objekti o where username like :user)"
	 			  + "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (3)"
	 	 		+ "	)"
		  )
	Page<ObjekatView> findAll(Pageable pageRequest, @Param("user") String user);	
}
