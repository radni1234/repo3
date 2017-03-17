package com.isem.mvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.GrafikDao;
import com.isem.mvc.tab.Grafik;

@Service
public class GrafikService {
	@Autowired
	private GrafikDao dao;
	
	public List<Grafik> grafEfikObjKwhPov (String obj_id, Date datum_od, Date datum_do) {
		return dao.grafEfikObjKwhPov(obj_id, datum_od, datum_do);
	}
}
