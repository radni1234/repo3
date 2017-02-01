package com.isem.mvc.dao;

import java.util.List;

import com.isem.mvc.model.Izvestaj;

public interface IzvestajDaoCustom {
	List<Izvestaj> izvApsMesPot(Long obj_id);
}
