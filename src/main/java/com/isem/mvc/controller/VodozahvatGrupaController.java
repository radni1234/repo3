package com.isem.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.VodozahvatGrupa;
import com.isem.mvc.service.VodozahvatGrupaService;

@RestController
@RequestMapping("/vodozahvat_grupa")
public class VodozahvatGrupaController {
	@Autowired
	private VodozahvatGrupaService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<VodozahvatGrupa> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<VodozahvatGrupa> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public VodozahvatGrupa findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public VodozahvatGrupa add(@RequestBody VodozahvatGrupa obj) {
		
		return service.save(obj);
	}

}
