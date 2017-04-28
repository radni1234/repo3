package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.security.User;

@Repository
public interface KorisnikDao extends PagingAndSortingRepository<User, Long>{
	
	User findByUsername (String userName);
	
	User findById(Long id);
	
	List<User> findAll();
	
	Page<User> findAll(Pageable pageRequest);	

}

