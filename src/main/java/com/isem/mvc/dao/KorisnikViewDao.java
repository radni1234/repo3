package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.KorisnikView;

public interface KorisnikViewDao extends Repository<KorisnikView, Long> {
	@Query("SELECT k FROM KorisnikView k "
			+ "where (k.opstinaId in "	
				+ "(select m.opstina.id from Mesto m where m = "
	 				+ "(select u.mesto from User u where username like :user)) "
	 				+ "and (select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (2))"
		 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
		 	 		+ "(select u.id from User u where username like :user)) in (1))")
	List<KorisnikView> findAll(@Param("user") String user);
	
	@Query("SELECT k FROM KorisnikView k "
			+ "where k.opstinaId in "	
				+ "(select m.opstina.id from Mesto m where m = "
					+ "(select u.mesto from User u where username like :user)) "
					+ "and (select a.id from User u inner join u.authorities a where u.id = "
	 	 		+ "(select u.id from User u where username like :user)) in (2))"
	 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
	 	 		+ "(select u.id from User u where username like :user)) in (1))")
	Page<KorisnikView> findAll(Pageable pageRequest, @Param("user") String user);	
}
