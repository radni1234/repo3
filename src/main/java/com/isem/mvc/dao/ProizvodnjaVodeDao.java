package com.isem.mvc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.ProizvodnjaVode;

@Repository
public interface ProizvodnjaVodeDao extends PagingAndSortingRepository<ProizvodnjaVode, Long> {
	ProizvodnjaVode findById(Long id);
	
	List<ProizvodnjaVode> findAll();

	Page<ProizvodnjaVode> findAll(Pageable pageRequest);
	
	@Query("SELECT p FROM ProizvodnjaVode p where p.vodozahvat.id = :id")
    public List<ProizvodnjaVode> findProizvodnjaVodeByVodozahvat(@Param("id") Long id);
	
	@Query("SELECT count(*) FROM ProizvodnjaVode p where p.vodozahvat.id = :id and DATE(p.datum) = :datum")
	Long proveriUnos(@Param("datum") Date datumr, @Param("id") Long id);
}
