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

import com.isem.mvc.model.StepenDan;
import com.isem.mvc.service.StepenDanService;
import com.isem.mvc.tab.StepenDanView;

@RestController
@RequestMapping("/stepen_dan")
public class StepenDanController {
	@Autowired
	private StepenDanService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<StepenDan> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<StepenDan> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/sve", params = {"ops_id", "god"}, method=RequestMethod.GET)
	public List<StepenDan> findStepenDanByOpsGod(@RequestParam(value = "ops_id") long ops_id, 
			@RequestParam(value = "god") int god ) {
		return service.findStepenDanByOpsGod(ops_id, god);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<StepenDanView> getAllView() {
		return service.findAllView();
	}

	@RequestMapping(value="/tab", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<StepenDanView> getAllView(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAllView(pageable);
	}
	
	@RequestMapping(value="/tab", params = {"ops_id", "god"}, method=RequestMethod.GET)
	public List<StepenDanView> findStepenDanViewByOpsGod(@RequestParam(value = "ops_id") long ops_id, 
			@RequestParam(value = "god") int god ) {
		return service.findStepenDanViewByOpsGod(ops_id, god);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public StepenDan findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public StepenDan add(@RequestBody StepenDan obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
