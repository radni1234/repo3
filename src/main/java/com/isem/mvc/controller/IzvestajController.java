package com.isem.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.Izvestaj;
import com.isem.mvc.service.IzvestajService;

@RestController
@RequestMapping("/izvestaj")
public class IzvestajController {
	@Autowired
	private IzvestajService service;
	
	@RequestMapping(value="/aps_mes_pot", params = {"obj_id"}, method=RequestMethod.GET)
	public List<Izvestaj> izvApsMesPot(Long obj_id) {
		return service.izvApsMesPot(obj_id);
	}
}
