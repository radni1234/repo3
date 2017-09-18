package com.isem.mvc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.PotrosnjaPodstanice;

@Repository
public interface PotrosnjaPodstaniceDao extends PagingAndSortingRepository<PotrosnjaPodstanice, Long> {
	PotrosnjaPodstanice findById(Long id);

	List<PotrosnjaPodstanice> findAll();

	Page<PotrosnjaPodstanice> findAll(Pageable pageRequest);

	@Query("SELECT p FROM PotrosnjaPodstanice p where p.podstanica.id = :id")
	public List<PotrosnjaPodstanice> findPotrosnjaByPodstanica(@Param("id") Long id);

	@Query("SELECT count(*) FROM PotrosnjaPodstanice p where p.podstanica.id = :podstanica_id and DATE(p.datum) = :datum")
	Long proveriRacun(@Param("datum") Date datum, @Param("podstanica_id") Long podstanica_id);
}
