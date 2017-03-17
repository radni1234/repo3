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

import com.isem.mvc.model.ObjekatMere;
import com.isem.mvc.service.ObjekatMereService;

@RestController
@RequestMapping("/obj_mere")
public class ObjekatMereController {
	@Autowired
	private ObjekatMereService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<ObjekatMere> getAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/sve", params = {"obj_id"}, method=RequestMethod.GET)
	public List<ObjekatMere> findObjekatMereByObjekat(@RequestParam(value = "obj_id") Long id) {	
		return service.findObjekatMereByObjekat(id);
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<ObjekatMere> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public ObjekatMere findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public ObjekatMere add(@RequestBody ObjekatMere obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
