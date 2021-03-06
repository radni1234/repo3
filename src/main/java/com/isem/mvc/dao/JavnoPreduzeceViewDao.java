package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.JavnoPreduzeceView;

@Repository
public interface JavnoPreduzeceViewDao extends PagingAndSortingRepository<JavnoPreduzeceView, Long> {
	JavnoPreduzeceView findById(Long id);
	
	@Query("SELECT j FROM JavnoPreduzeceView j "
			+ "where (j.opstinaId in "	
				+ "(select m.opstina.id from Mesto m where m = "
	 				+ "(select u.mesto from User u where username like :user)) "
	 				+ "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2,4))"
		 	 		+ "or "
		 	 		+ "((select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (1))"
		 	 		+ "or "
		 	 		+ "(j.id = (select u.javnoPreduzece.id from User u where username like :user) "
		 	 		+ "and ((select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (3)))"
			)
	List<JavnoPreduzeceView> findAll(@Param("user") String user);
	
	@Query("SELECT j FROM JavnoPreduzeceView j "
			+ "where (j.opstinaId in "	
				+ "(select m.opstina.id from Mesto m where m = "
	 				+ "(select u.mesto from User u where username like :user)) "
	 				+ "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2,4))"
		 	 		+ "or "
		 	 		+ "((select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (1))"
		 	 		+ "or "
		 	 		+ "(j.id = (select u.javnoPreduzece.id from User u where username like :user) "
		 	 		+ "and ((select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (3)))"
			)
	Page<JavnoPreduzeceView> findAll(Pageable pageRequest, @Param("user") String user);
}
