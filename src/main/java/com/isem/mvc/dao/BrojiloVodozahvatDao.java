package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.BrojiloVodozahvat;

@Repository
public interface BrojiloVodozahvatDao extends PagingAndSortingRepository<BrojiloVodozahvat, Long> {
	BrojiloVodozahvat findById(Long id);
	
	List<BrojiloVodozahvat> findAll();

	Page<BrojiloVodozahvat> findAll(Pageable pageRequest);
}
