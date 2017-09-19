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

import com.isem.mvc.model.Svetiljka;
import com.isem.mvc.service.SvetiljkaService;
import com.isem.mvc.tab.SvetiljkaView;

@RestController
@RequestMapping("/svetiljka")
public class SvetiljkaController {	

	@Autowired
	private SvetiljkaService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<Svetiljka> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<Svetiljka> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<SvetiljkaView> getAllView() {
		return service.findAllView();
	}
	
	@RequestMapping(value="/tab", params = {"stub_id"}, method=RequestMethod.GET)
	public List<SvetiljkaView> findSvetiljkaViewByStub(@RequestParam(value = "stub_id") Long stub_id) {		
		return service.findSvetiljkaViewByStub(stub_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Svetiljka findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Svetiljka add(@RequestBody Svetiljka obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
