package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.EnergentTip;

@Repository
public interface EnergentTipDao extends PagingAndSortingRepository<EnergentTip, Long> {
	EnergentTip findById(Long id);
	
	List<EnergentTip> findAll();

	Page<EnergentTip> findAll(Pageable pageRequest);
	
	@Query("SELECT br.energentTip from BrojiloVrsta br where br in "
			+ "(select b.brojiloVrsta from Brojilo b where b.id = :id))")
	List<EnergentTip> findEnergentTipByBrojilo(@Param("id") Long id);
}
