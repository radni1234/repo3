package com.isem.mvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.izvestaj.ApsGodPot;
import com.isem.mvc.izvestaj.ApsMesPot;
import com.isem.mvc.izvestaj.UkPotEneObj;
import com.isem.mvc.izvestaj.dao.ApsGodPotDao;
import com.isem.mvc.izvestaj.dao.ApsMesPotDao;
import com.isem.mvc.izvestaj.dao.UkPotEneObjDao;

@Service
public class IzvestajService {
	@Autowired
	private ApsMesPotDao dao;
	
	@Autowired
	private UkPotEneObjDao dao2;
	
	@Autowired
	private ApsGodPotDao dao3;
	
	public List<ApsMesPot> apsMesPot (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao.apsMesPot(obj_id, ene_tip_id, datum_od, datum_do);
	}	
	
	public List<UkPotEneObj> ukPotEneObj (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao2.ukPotEneObj(obj_id, ene_tip_id, datum_od, datum_do);
	}	
	
	public List<ApsGodPot> apsGodPot (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao3.apsGodPot(obj_id, ene_tip_id, datum_od, datum_do);
	}

}
