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

import com.isem.mvc.model.BrojiloKotlarnica;
import com.isem.mvc.service.BrojiloKotlarnicaService;
import com.isem.mvc.tab.BrojiloKotlarnicaView;

@RestController
@RequestMapping("/brojilo_kotlarnica")
public class BrojiloKotlarnicaController {
	@Autowired
	private BrojiloKotlarnicaService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<BrojiloKotlarnica> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<BrojiloKotlarnica> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/sve", params = {"obj_id"}, method=RequestMethod.GET)
	public List<BrojiloKotlarnica> getAllBrojiloByObjekat(@RequestParam(value = "obj_id") Long obj_id) {	
		return service.findBrojiloByKotlarnica(obj_id);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<BrojiloKotlarnicaView> getAllView() {
		return service.findAllView();
	}
	
	@RequestMapping(value="/tab", params = {"obj_id"}, method=RequestMethod.GET)
	public List<BrojiloKotlarnicaView> findBrojiloViewByObjekat(@RequestParam(value = "obj_id") Long obj_id) {		
		return service.findBrojiloViewByKotlarnica(obj_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public BrojiloKotlarnica findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public BrojiloKotlarnica add(@RequestBody BrojiloKotlarnica obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
