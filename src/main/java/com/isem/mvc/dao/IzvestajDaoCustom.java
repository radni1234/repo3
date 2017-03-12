package com.isem.mvc.dao;

import java.util.Date;
import java.util.List;

import com.isem.mvc.model.Izvestaj;

public interface IzvestajDaoCustom {
	List<Izvestaj> izvApsMesPot(String obj_id, String ene_tip_id, Date datum_od, Date datum_do);
}
