package com.isem.mvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.service.GrafikService;
import com.isem.mvc.tab.Grafik;

@RestController
@RequestMapping("/grafik")
public class GrafikController {
	@Autowired
	private GrafikService service;
	
	@RequestMapping(value="/efik_obj_kws_pov", params = {"obj_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<Grafik> grafEfikObjKwhPov(@RequestParam("obj_id") String obj_id,		
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.grafEfikObjKwhPov(obj_id, datum_od, datum_do);
	}
}
