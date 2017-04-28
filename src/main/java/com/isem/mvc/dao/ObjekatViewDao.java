package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.ObjekatView;


public interface ObjekatViewDao extends Repository<ObjekatView, Long> {
	
	@Query("select o from ObjekatView o where "
			 + "(o.opstinaId in (select m.opstina from Mesto m where m in (select k.mesto from User k where username like :user)) "
			 + " and (select a.id from User k join k.authorities a where username like :user) = 2)"
			 + "or ((select a.id from User k join k.authorities a where username like :user) = 1)"
	
		  )
	List<ObjekatView> findAll(@Param("user") String user);
	
	Page<ObjekatView> findAll(Pageable pageRequest);	
}
