package com.isem.mvc.service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.GrafikCusumDao;
import com.isem.mvc.dao.GrafikDao;
import com.isem.mvc.dao.GrafikRasvetaGodDao;
import com.isem.mvc.dao.GrafikEneMixPieDao;
import com.isem.mvc.tab.GrafikEneMixPie;
import com.isem.mvc.dao.GrafikEneMixGodDao;
import com.isem.mvc.tab.GrafikEneMixGod;
import com.isem.mvc.dao.GrafikEneMixDao;
import com.isem.mvc.tab.GrafikEneMix;
import com.isem.mvc.tab.Grafik;
import com.isem.mvc.tab.GrafikRasvetaGod;
import com.isem.mvc.tab.GrafikCusum;

@Service
public class GrafikService {
	@Autowired
	private GrafikDao dao;
	
	@Autowired
	private GrafikRasvetaGodDao daoRasvetaGod;
	
	@Autowired
	private GrafikCusumDao daoCusum;
	
	@Autowired
	private GrafikEneMixPieDao daoMixPie;
	
	@Autowired
	private GrafikEneMixGodDao daoMixGod;
	
	@Autowired
	private GrafikEneMixDao daoMixMes;
	
	public List<Grafik> grafEfikObjKwhPov (String obj_id, Date datum_od, Date datum_do) {
		return dao.grafEfikObjKwhPov(obj_id, datum_od, datum_do);
	}
	
	public List<GrafikRasvetaGod> grafRasvetaGod (String obj_id, Date datum_od, Date datum_do) {
		return daoRasvetaGod.grafRasvetaGod(obj_id, datum_od, datum_do);
	}
	
	public List<GrafikEneMixPie> grafEneMixPie (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return daoMixPie.grafEneMixPie(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	public List<GrafikEneMixGod> grafEneMixGod (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return daoMixGod.grafEneMixGod(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	public List<GrafikEneMix> grafEneMix (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return daoMixMes.grafEneMix(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	public List<GrafikCusum> grafCusumPre (BigInteger mera_id) {
		return daoCusum.grafCusumPre(mera_id);
	}
	
	public List<GrafikCusum> grafCusumPosle (BigInteger mera_id) {
		return daoCusum.grafCusumPosle(mera_id);
	}
}
