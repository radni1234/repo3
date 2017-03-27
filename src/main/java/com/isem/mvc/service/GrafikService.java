package com.isem.mvc.service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.GrafikCusumDao;
import com.isem.mvc.dao.GrafikDao;
import com.isem.mvc.tab.Grafik;
import com.isem.mvc.tab.GrafikCusum;

@Service
public class GrafikService {
	@Autowired
	private GrafikDao dao;
	
	@Autowired
	private GrafikCusumDao daoCusum;
	
	public List<Grafik> grafEfikObjKwhPov (String obj_id, Date datum_od, Date datum_do) {
		return dao.grafEfikObjKwhPov(obj_id, datum_od, datum_do);
	}
	
	public List<GrafikCusum> grafCusumPre (BigInteger mera_id) {
		return daoCusum.grafCusumPre(mera_id);
	}
	
	public List<GrafikCusum> grafCusumPosle (BigInteger mera_id) {
		return daoCusum.grafCusumPosle(mera_id);
	}
}
