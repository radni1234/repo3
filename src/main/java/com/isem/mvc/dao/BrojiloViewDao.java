package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.BrojiloView;


public interface BrojiloViewDao extends Repository<BrojiloView, Long> {
	BrojiloView findById(Long id);
	
	List<BrojiloView> findAll();

	Page<BrojiloView> findAll(Pageable pageRequest);
	
	@Query("SELECT b FROM BrojiloView b where b.objekatId = :obj_id order by b.sifra_brojila")
	List<BrojiloView> findBrojiloViewByObjekat(@Param("obj_id") Long id);
}
