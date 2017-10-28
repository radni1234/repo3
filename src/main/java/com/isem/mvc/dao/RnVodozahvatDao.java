package com.isem.mvc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Rn;
import com.isem.mvc.model.RnVodozahvat;

@Repository
public interface RnVodozahvatDao extends PagingAndSortingRepository<RnVodozahvat, Long> {
	RnVodozahvat findById(Long id);
	
	List<RnVodozahvat> findAll();

	Page<RnVodozahvat> findAll(Pageable pageRequest);
	
	@Query("SELECT r FROM RnVodozahvat r where r.brojiloVodozahvat in (select b from com.isem.mvc.model.BrojiloVodozahvat b where b.vodozahvat.id = :id)")
	List<Rn> findRnByVodozahvat(@Param("id") Long id);
	
	@Query("SELECT count(*) FROM RnVodozahvat r where r.brojiloVodozahvat.id = :brojilo_id and DATE(r.datumr) = :datumr")
	Long proveriRacun(@Param("datumr") Date datumr, @Param("brojilo_id") Long brojilo_id);
}