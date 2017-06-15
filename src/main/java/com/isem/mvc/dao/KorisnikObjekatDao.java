package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.KorisnikObjekat;

@Repository
public interface KorisnikObjekatDao extends PagingAndSortingRepository<KorisnikObjekat, Long> {
	KorisnikObjekat findById(Long id);
	
	List<KorisnikObjekat> findAll();

	Page<KorisnikObjekat> findAll(Pageable pageRequest);
}
