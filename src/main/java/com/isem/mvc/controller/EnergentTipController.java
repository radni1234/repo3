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
import com.isem.mvc.model.EnergentTip;
import com.isem.mvc.service.EnergentTipService;

@RestController
@RequestMapping("/energent_tip")
public class EnergentTipController {	

	@Autowired
	private EnergentTipService service;
	
	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<EnergentTip> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<EnergentTip> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/sve", params = {"bro_id"}, method=RequestMethod.GET)
	public List<EnergentTip> findEnergentTipByBrojilo(@RequestParam(value = "bro_id") Long bro_id ) {
		return service.findEnergentTipByBrojilo(bro_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public EnergentTip findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		
	
	@RequestMapping(value="/lov", method=RequestMethod.GET)
	public List<Lov> energentTipLov() {
		return service.energentTipLov();
	}
	
	@RequestMapping(value="/lov", params = {"obj_id"}, method=RequestMethod.GET)
	public List<Lov> energentTipLov(@RequestParam(value = "obj_id") Long objId) {
		return service.energentTipLov(objId);
	}
	
	@RequestMapping(value="/kot_lov", method=RequestMethod.GET)
	public List<Lov> energentTipKotLov() {
		return service.energentTipKotLov();
	}

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public EnergentTip add(@RequestBody EnergentTip obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
