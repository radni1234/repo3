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

import com.isem.mvc.model.Mesec;
import com.isem.mvc.service.MesecService;

@RestController
@RequestMapping("/mesec")
public class MesecController {
	@Autowired
	MesecService mesecService;
	
	@RequestMapping("/sve")
	public List<Mesec> getAllMesec() {
		return mesecService.findAll();
	}
	
	@RequestMapping(value = "/sve", params = {"str", "vel"})
	public Page<Mesec> getAllMesec(@RequestParam(value = "str") int strana, 
									  @RequestParam(value = "vel") int velicina ) {
		
	    Pageable pageable = new PageRequest(strana, velicina);
	    
		return mesecService.findAll(pageable);
	}
	
	@RequestMapping(value="/jedan", method=RequestMethod.GET)
	public Mesec getMesec(@RequestParam("id") Long id) {
		return mesecService.findById(id);
	}
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Mesec addMesec(@RequestBody Mesec mesec) {
		return mesecService.save(mesec);		
	}
	
	@RequestMapping("/obrisi")
	public void test(@RequestBody Long id) {
		mesecService.delete(id);
	}
}
