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

import com.isem.mvc.model.Energent;
import com.isem.mvc.service.EnergentService;
import com.isem.mvc.view.EnergentView;

@RestController
@RequestMapping("/energent")
public class EnergentController {
	@Autowired
	private EnergentService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<Energent> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<Energent> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<EnergentView> getAllView() {
		return service.findAllView();
	}

	@RequestMapping(value="/tab", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<EnergentView> getAllView(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAllView(pageable);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Energent findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Energent add(@RequestBody Energent obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
}
