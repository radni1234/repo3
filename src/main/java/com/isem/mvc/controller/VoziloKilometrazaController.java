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

import com.isem.mvc.model.VoziloKilometraza;
import com.isem.mvc.service.VoziloKilometrazaService;

@RestController
@RequestMapping("/vozilo_km")
public class VoziloKilometrazaController {
	@Autowired
	private VoziloKilometrazaService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<VoziloKilometraza> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<VoziloKilometraza> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/sve", params = {"vozilo_id"}, method=RequestMethod.GET)
	public List<VoziloKilometraza> findVoziloKilometrazaByVozilo(@RequestParam(value = "vozilo_id") Long vozilo_id) {		
		return service.findVoziloKilometrazaByVozilo(vozilo_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public VoziloKilometraza findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public VoziloKilometraza add(@RequestBody VoziloKilometraza obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
