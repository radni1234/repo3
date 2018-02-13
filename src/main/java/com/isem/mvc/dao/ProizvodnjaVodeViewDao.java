package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isem.mvc.tab.ProizvodnjaVodeView;

@Repository
public interface ProizvodnjaVodeViewDao extends PagingAndSortingRepository<ProizvodnjaVodeView, Long> {
	ProizvodnjaVodeView findById(Long id);
	
	List<ProizvodnjaVodeView> findAll();

	Page<ProizvodnjaVodeView> findAll(Pageable pageRequest);
	
	@Query("SELECT p FROM ProizvodnjaVodeView p where p.vodozahvatId = :vodozahvat_id")
    public List<ProizvodnjaVodeView> findProizVodeViewByVodozahvat(@Param("vodozahvat_id") Long vodozahvat_id);
}
