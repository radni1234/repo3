package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.RnPrikazDao;
import com.isem.mvc.tab.RnPrikaz;

@Service
public class RnPrikazService {
	@Autowired
	private RnPrikazDao dao;
	
	public List<RnPrikaz> rnPrikaz (String bro_id) {
		return dao.rnPrikaz(bro_id);
	}
	
	public List<RnPrikaz> rnPrikazKotlarnica (String kot_id) {
		return dao.rnPrikazKotlarnica(kot_id);
	}
}
