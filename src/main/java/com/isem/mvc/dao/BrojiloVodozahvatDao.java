package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.BrojiloVodozahvat;

@Repository
public interface BrojiloVodozahvatDao extends PagingAndSortingRepository<BrojiloVodozahvat, Long> {
	BrojiloVodozahvat findById(Long id);
	
	List<BrojiloVodozahvat> findAll();

	Page<BrojiloVodozahvat> findAll(Pageable pageRequest);
	
	@Query("SELECT b FROM BrojiloVodozahvat b where b.vodozahvat.id = :id")
    public List<BrojiloVodozahvat> findBrojiloByVodozahvat(@Param("id") Long id);
}
