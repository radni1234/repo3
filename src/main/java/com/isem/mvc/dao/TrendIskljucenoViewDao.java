package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.TrendIskljucenoView;

@Repository
public interface TrendIskljucenoViewDao extends PagingAndSortingRepository<TrendIskljucenoView, Long> {
	TrendIskljucenoView findById(Long id);
	
	List<TrendIskljucenoView> findAll();

	Page<TrendIskljucenoView> findAll(Pageable pageRequest);
	
	@Query("select t from TrendIskljucenoView t "
			+ "where t.objekatId in ("
				+ "select o.id from ObjekatView o " 
				 + "where "
				 	+ "(o.mestoId in "
				 		+ "(select m.id from Mesto m where m.opstina in "				 
				 		+ "(select m2.opstina from Mesto m2 where m2 in "
				 		+ "(select u.mesto from User u where username like :user)))"
				 	  + "and (select a.id from User u inner join u.authorities a where u.id = "
			 	 		+ "(select u.id from User u where username like :user)) in (2,4)"
		 	 		+ ") "
		 	 		+ "or"
		 	 		+ "(o.id in "
		 	 			+ "(select o.id from User u inner join u.objekti o where username like :user)"
		 			  + "and (select a.id from User u inner join u.authorities a where u.id = "
			 	 		+ "(select u.id from User u where username like :user)) in (3)"
		 	 		+ "	)"
		 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
		 				+ "(select u.id from User u where username like :user)) in (1))"
 				+ ")"
		  )
	List<TrendIskljucenoView> findAll(@Param("user") String user);
}
