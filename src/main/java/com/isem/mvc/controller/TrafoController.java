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

import com.isem.mvc.lov.Lov;
import com.isem.mvc.model.Trafo;
import com.isem.mvc.service.TrafoService;
import com.isem.mvc.tab.TrafoView;

@RestController
@RequestMapping("/trafo")
public class TrafoController {
	@Autowired
	private TrafoService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<Trafo> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<Trafo> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/sve", params = {"mesto_id"}, method=RequestMethod.GET)
	public List<Trafo> findTrafoByMesto(@RequestParam(value = "mesto_id") Long mesto_id) {	
		return service.findTrafoByMesto(mesto_id);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<TrafoView> getAllView() {
		return service.findAllView();
	}


	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Trafo findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Trafo add(@RequestBody Trafo obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/lov", params = {"ops_id", "mes_id"}, method=RequestMethod.GET)
	public List<Lov> getTrafoLov(@RequestParam(value = "ops_id") Long opsId, 
								   @RequestParam(value = "mes_id") Long mesId) {
		return service.trafoLov(opsId, mesId);
	}
}
