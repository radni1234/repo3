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

import com.isem.mvc.model.Rn;
import com.isem.mvc.service.RnService;
import com.isem.mvc.tab.RnProc;

@RestController
@RequestMapping("/rn")
public class RnController {
	@Autowired
	private RnService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<Rn> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<Rn> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/sve", params = {"obj_id"}, method=RequestMethod.GET)
	public List<Rn> getAllRnByObjekat(@RequestParam(value = "obj_id") Long id) {	
		return service.findRnByObjekat(id);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<RnProc> getAllTab() {
		return service.findAllProc();
	}
	
	@RequestMapping(value="/tab", params = {"obj_id"}, method=RequestMethod.GET)
	public List<RnProc> getAllObjTab(Long obj_id) {
		return service.findAllObjProc(obj_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Rn findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Rn add(@RequestBody Rn obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/provera", params = {"datumr", "brojilo_id"}, method=RequestMethod.GET)
	public Long proveriRacun(@RequestParam(value = "datumr") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datumr, 
								@RequestParam(value = "brojilo_id") Long brojilo_id ) {

		return service.proveriRacun(datumr, brojilo_id);
	}
}
