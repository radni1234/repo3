package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.IzvestajDaoCustomImpl;
import com.isem.mvc.model.Izvestaj;

@Service
public class IzvestajService {
	@Autowired
	private IzvestajDaoCustomImpl dao;
	
	public List<Izvestaj> izvApsMesPot (Long obj_id) {
		return dao.izvApsMesPot(obj_id);
	}
}
