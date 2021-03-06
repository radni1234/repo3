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

import com.isem.mvc.model.BrojiloVrstaKolone;
import com.isem.mvc.service.BrojiloVrstaKoloneService;
import com.isem.mvc.tab.BrojiloVrstaKoloneView;

@RestController
@RequestMapping("/bro_vrs_kol")
public class BrojiloVrstaKoloneController {
	@Autowired
	private BrojiloVrstaKoloneService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<BrojiloVrstaKolone> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<BrojiloVrstaKolone> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/sve", params = {"bro_vrs_id"}, method=RequestMethod.GET)
	public List<BrojiloVrstaKolone> findBrojiloVrstaKoloneByBrojiloVrsta(@RequestParam(value = "bro_vrs_id") Long bro_vrs_id) {
		return service.findBrojiloVrstaKoloneByBrojiloVrsta(bro_vrs_id);
	}
	
	@RequestMapping(value="/sve", params = {"bro_id"}, method=RequestMethod.GET)
	public List<BrojiloVrstaKolone> findBrojiloVrstaKoloneByBrojilo(@RequestParam(value = "bro_id") Long bro_id) {
		return service.findBrojiloVrstaKoloneByBrojilo(bro_id);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<BrojiloVrstaKoloneView> getAllView() {
		return service.findAllView();
	}
	
	
	@RequestMapping(value="/tab", params = {"bro_vrs_id"}, method=RequestMethod.GET)
	public List<BrojiloVrstaKoloneView> getAllView(@RequestParam(value = "bro_vrs_id") Long bro_vrs_id) {		
		return service.findBrojiloVrstaKoloneViewByBrojiloVrsta(bro_vrs_id);
		
	}
	
	@RequestMapping(value="/tab", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<BrojiloVrstaKoloneView> getAllView(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAllView(pageable);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public BrojiloVrstaKolone findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public BrojiloVrstaKolone add(@RequestBody BrojiloVrstaKolone obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
