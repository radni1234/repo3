package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.isem.mvc.tab.BrojiloKotlarnicaView;


public interface BrojiloKotlarnicaViewDao extends Repository<BrojiloKotlarnicaView, Long> {
	BrojiloKotlarnicaView findById(Long id);
	
	List<BrojiloKotlarnicaView> findAll();

	Page<BrojiloKotlarnicaView> findAll(Pageable pageRequest);
	
	@Query("SELECT b FROM BrojiloKotlarnicaView b where b.kotlarnicaId = :kotlarnica_id order by b.sifra_brojila")
	List<BrojiloKotlarnicaView> findBrojiloViewByKotlarnica(@Param("kotlarnica_id") Long id);
}
