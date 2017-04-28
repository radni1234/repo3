package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.model.security.Authority;

public interface UlogaDao extends PagingAndSortingRepository<Authority, Long> {
	Authority findById(Long id);
	
	@Query("select a from Authority a join a.users u where u.username like :user ")
	List<Authority> findByUser(@Param("user") String user);
	
	List<Authority> findAll();
	
	Page<Authority> findAll(Pageable pageRequest);
}
