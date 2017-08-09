package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.BrojiloVrstaKolone;

@Repository
public interface BrojiloVrstaKoloneDao extends PagingAndSortingRepository<BrojiloVrstaKolone, Long> {
	BrojiloVrstaKolone findById(Long id);
	
	List<BrojiloVrstaKolone> findAll();

	Page<BrojiloVrstaKolone> findAll(Pageable pageRequest);
	
	@Query("SELECT b FROM BrojiloVrstaKolone b where b.brojiloVrsta.id = :id order by rbr")
	List<BrojiloVrstaKolone> findBrojiloVrstaKoloneByBrojiloVrsta(@Param("id") Long id);
	
	@Query("SELECT b FROM BrojiloVrstaKolone b where b.brojiloVrsta.id = (select b2.brojiloVrsta.id from Brojilo b2 where b2.id = :id) order by rbr")
	List<BrojiloVrstaKolone> findBrojiloVrstaKoloneByBrojilo(@Param("id") Long id);
}
