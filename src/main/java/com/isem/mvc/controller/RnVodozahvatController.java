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

import com.isem.mvc.model.RnVodozahvat;
import com.isem.mvc.service.RnVodozahvatService;

@RestController
@RequestMapping("/rn_vodozahvat")
public class RnVodozahvatController {
	@Autowired
	private RnVodozahvatService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<RnVodozahvat> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<RnVodozahvat> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public RnVodozahvat findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public RnVodozahvat add(@RequestBody RnVodozahvat obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/provera", params = {"datumr", "vodozahvat_id"}, method=RequestMethod.GET)
	public Long proveriRacun(@RequestParam(value = "datumr") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datumr, 
								@RequestParam(value = "vodozahvat_id") Long vodozahvat_id ) {

		return service.proveriRacun(datumr, vodozahvat_id);
	}
}
