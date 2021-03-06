package com.isem.mvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.PotrosnjaPodstanice;
import com.isem.mvc.service.PotrosnjaPodstaniceService;

@RestController
@RequestMapping("/potrosnja_podstanice")
public class PotrosnjaPodstaniceController {

	@Autowired
	private PotrosnjaPodstaniceService service;
	
	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<PotrosnjaPodstanice> getAll() {
		return service.findAll();
	}
	
	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<PotrosnjaPodstanice> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/sve", params = {"podstanica_id"}, method=RequestMethod.GET)
	public List<PotrosnjaPodstanice> findPotrosnjaByPodstanica(@RequestParam(value = "podstanica_id") Long id) {	
		return service.findPotrosnjaByPodstanica(id);
	}
	
	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public PotrosnjaPodstanice findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public PotrosnjaPodstanice add(@RequestBody PotrosnjaPodstanice obj) {
		
		return service.save(obj);
	}
	
	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/provera", params = {"datum", "podstanica_id"}, method=RequestMethod.GET)
	public Long proveriRacun(@RequestParam(value = "datum") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum, 
								@RequestParam(value = "podstanica_id") Long podstanica_id ) {

		return service.proveriRacun(datum, podstanica_id);
	}
}
