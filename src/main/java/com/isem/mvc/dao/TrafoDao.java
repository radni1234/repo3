package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Trafo;

@Repository
public interface TrafoDao extends PagingAndSortingRepository<Trafo, Long> {
	Trafo findById(Long id);
	
	@Query("SELECT t FROM Trafo t "
			+ "where (t.mesto in "
					+ "(select m2 from Mesto m2 where m2.opstina = "
						+ "(select m.opstina from Mesto m where m = "
			 				+ "(select u.mesto from User u where username like :user))) "
			 				+ " and (select a.id from User u inner join u.authorities a where u.id = "
				 	 		+ "(select u.id from User u where username like :user)) in (2,3)) "
	 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
	 	 			+ "(select u.id from User u where username like :user)) in (1))" )
	List<Trafo> findAll(@Param("user") String user);
	
	@Query("SELECT t FROM Trafo t "
			+ "where (t.mesto in "
					+ "(select m2 from Mesto m2 where m2.opstina = "
						+ "(select m.opstina from Mesto m where m = "
			 				+ "(select u.mesto from User u where username like :user))) "
			 				+ " and (select a.id from User u inner join u.authorities a where u.id = "
				 	 		+ "(select u.id from User u where username like :user)) in (2,3)) "
	 	 		+ "or ((select a.id from User u inner join u.authorities a where u.id = "
	 	 			+ "(select u.id from User u where username like :user)) in (1))" )
	Page<Trafo> findAll(Pageable pageRequest, @Param("user") String user);
	
	@Query("SELECT t FROM Trafo t  where t.mesto.id = :mesto_id order by t.redosled")
    public List<Trafo> findTrafoByMesto(@Param("mesto_id") Long mesto_id);
}
