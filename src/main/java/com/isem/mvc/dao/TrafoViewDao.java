package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.TrafoView;

@Repository
public interface TrafoViewDao extends PagingAndSortingRepository<TrafoView, Long> {
	TrafoView findById(Long id);
	
	@Query("SELECT t FROM TrafoView t "
			+ "where (t.opstinaId in "	
				+ "(select m.opstina.id from Mesto m where m = "
	 				+ "(select u.mesto from User u where username like :user)) "
	 				+ "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2,3))"
		 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (1))")
	List<TrafoView> findAll(@Param("user") String user);
	
	@Query("SELECT t FROM TrafoView t "
			+ "where (t.opstinaId in "	
				+ "(select m.opstina.id from Mesto m where m = "
	 				+ "(select u.mesto from User u where username like :user)) "
	 				+ "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2,3))"
		 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (1))")
	Page<TrafoView> findAll(Pageable pageRequest, @Param("user") String user);
}
