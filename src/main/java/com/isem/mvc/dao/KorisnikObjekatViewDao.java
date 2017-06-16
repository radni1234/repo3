package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.KorisnikObjekatView;

public interface KorisnikObjekatViewDao extends Repository<KorisnikObjekatView, Long> {
	@Query("SELECT k FROM KorisnikObjekatView k where k.korisnikId = :id order by objekat")
	List<KorisnikObjekatView> findKorisnikObjekatViewByKorisnik(@Param("id") Long id);
}	
