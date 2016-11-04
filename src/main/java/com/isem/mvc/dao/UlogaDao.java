package com.isem.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isem.mvc.model.Uloga;

public interface UlogaDao extends JpaRepository<Uloga, Long> {
	Uloga findById(Long id);
}
