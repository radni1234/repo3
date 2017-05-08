package com.isem.mvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.IzvestajDaoCustomImpl;
import com.isem.mvc.izvestaj.UkPotEneObj;
import com.isem.mvc.izvestaj.dao.UkPotEneObjDao;
import com.isem.mvc.model.Izvestaj;

@Service
public class IzvestajService {
	@Autowired
	private IzvestajDaoCustomImpl dao;
	
	@Autowired
	private UkPotEneObjDao dao2;
	
	public List<Izvestaj> izvApsMesPot (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao.izvApsMesPot(obj_id, ene_tip_id, datum_od, datum_do);
	}	
	
	public List<UkPotEneObj> ukPotEneObj (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao2.ukPotEneObj(obj_id, ene_tip_id, datum_od, datum_do);
	}	

}
