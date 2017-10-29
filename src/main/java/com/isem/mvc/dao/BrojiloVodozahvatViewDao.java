package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.BrojiloVodozahvatView;

public interface BrojiloVodozahvatViewDao  extends Repository<BrojiloVodozahvatView, Long>{
	BrojiloVodozahvatView findById(Long id);
	
	List<BrojiloVodozahvatView> findAll();

	Page<BrojiloVodozahvatView> findAll(Pageable pageRequest);
	
	@Query("SELECT b FROM BrojiloVodozahvatView b where b.vodozahvatId = :vodozahvat_id order by b.sifra_brojila")
	List<BrojiloVodozahvatView> findBrojiloViewByVodozahvat(@Param("vodozahvat_id") Long vodozahvat_id);
}
