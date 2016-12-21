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

import com.isem.mvc.model.Dobavljac;
import com.isem.mvc.service.DobavljacService;
import com.isem.mvc.tab.DobavljacView;

@RestController
@RequestMapping("/dobavljac")
public class DobavljacController {
	@Autowired
	private DobavljacService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<Dobavljac> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<Dobavljac> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<DobavljacView> getAllView() {
		return service.findAllView();
	}

	@RequestMapping(value="/tab", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<DobavljacView> getAllView(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAllView(pageable);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Dobavljac findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Dobavljac add(@RequestBody Dobavljac obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
