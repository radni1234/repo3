package com.isem.mvc.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.KorisnikMeniView;

@Repository
public interface KorisnikMeniViewDao extends PagingAndSortingRepository<KorisnikMeniView, Long> {
	
	KorisnikMeniView findByUsername (String userName);	
	
}
