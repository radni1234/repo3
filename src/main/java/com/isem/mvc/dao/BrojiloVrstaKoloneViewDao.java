package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.isem.mvc.tab.BrojiloVrstaKoloneView;

public interface BrojiloVrstaKoloneViewDao extends Repository<BrojiloVrstaKoloneView, Long> {
	BrojiloVrstaKoloneView findById(Long id);
	
	List<BrojiloVrstaKoloneView> findAll();

	Page<BrojiloVrstaKoloneView> findAll(Pageable pageRequest);
}
