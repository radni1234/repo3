package com.isem.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ObjekatDokument;

@Repository
public interface ObjekatDokumentDao extends PagingAndSortingRepository<ObjekatDokument, Long> {
	ObjekatDokument findById(Long id);
	
	ObjekatDokument findByDokument(String dokument);
	
	List<ObjekatDokument> findAll();

	Page<ObjekatDokument> findAll(Pageable pageRequest);
	
	@Query("SELECT o FROM ObjekatDokument o where o.objekat.id = :id")
    public List<ObjekatDokument> findDokumentByObjekat(@Param("id") Long id);
	
	@Transactional
    Long deleteByDokument(String dokument);
}
