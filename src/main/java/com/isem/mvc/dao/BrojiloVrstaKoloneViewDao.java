package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.BrojiloVrstaKoloneView;

public interface BrojiloVrstaKoloneViewDao extends Repository<BrojiloVrstaKoloneView, Long> {
	BrojiloVrstaKoloneView findById(Long id);
	
	List<BrojiloVrstaKoloneView> findAll();

	Page<BrojiloVrstaKoloneView> findAll(Pageable pageRequest);
	
	@Query("SELECT b FROM BrojiloVrstaKoloneView b where b.brojiloVrstaId = :id order by rbr")
	List<BrojiloVrstaKoloneView> findBrojiloVrstaKoloneViewByBrojiloVrsta(@Param("id") Long id);
}
