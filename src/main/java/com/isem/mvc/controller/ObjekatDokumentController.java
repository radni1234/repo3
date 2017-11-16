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

import com.isem.mvc.model.ObjekatDokument;
import com.isem.mvc.service.ObjekatDokumentService;

@RestController
@RequestMapping("/obj_dok")
public class ObjekatDokumentController {
	@Autowired
	private ObjekatDokumentService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<ObjekatDokument> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<ObjekatDokument> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/sve", params = {"obj_id"}, method=RequestMethod.GET)
	public List<ObjekatDokument> findDokumentByObjekat(@RequestParam(value = "obj_id") Long obj_id) {	
		return service.findDokumentByObjekat(obj_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public ObjekatDokument findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public ObjekatDokument add(@RequestBody ObjekatDokument obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
