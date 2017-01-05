package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Energent;
import com.isem.mvc.model.BrojiloVrsta;
import com.isem.mvc.model.Brojilo;

@SuppressWarnings("unused")
@Repository
public interface EnergentDao extends PagingAndSortingRepository<Energent, Long> {
	Energent findById(Long id);
	
	List<Energent> findAll();

	Page<Energent> findAll(Pageable pageRequest);
	
	@Query("SELECT e FROM Energent e where e.energentTip.id = :id")
	List<Energent> findEnergentByEnergentTip(@Param("id") Long id);
	
	@Query("SELECT e FROM Energent e where e.energentTip in "
			+ "(select br.energentTip from BrojiloVrsta br where br in "
			+ "(select b.brojiloVrsta from Brojilo b where b.objekat.id = :id))")
	List<Energent> findEnergentByObjekat(@Param("id") Long id);
}
