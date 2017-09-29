package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.VoziloKilometraza;

@Repository
public interface VoziloKilometrazaDao extends PagingAndSortingRepository<VoziloKilometraza, Long> {
	VoziloKilometraza findById(Long id);
	
	List<VoziloKilometraza> findAll();

	Page<VoziloKilometraza> findAll(Pageable pageRequest);
	
	@Query("SELECT v FROM VoziloKilometraza v where v.vozilo.id = :id")
    public List<VoziloKilometraza> findVoziloKilometrazaByVozilo(@Param("id") Long id);
}
