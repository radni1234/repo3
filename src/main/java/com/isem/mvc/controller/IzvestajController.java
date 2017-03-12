package com.isem.mvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.Izvestaj;
import com.isem.mvc.service.IzvestajService;

@RestController
@RequestMapping("/izvestaj")
public class IzvestajController {
	@Autowired
	private IzvestajService service;
	
	@RequestMapping(value="/aps_mes_pot", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<Izvestaj> izvApsMesPot(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.izvApsMesPot(obj_id, ene_tip_id, datum_od, datum_do);
	}
}
