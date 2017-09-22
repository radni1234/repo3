package com.isem.mvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.RnTrafo;
import com.isem.mvc.service.RnTrafoService;
import com.isem.mvc.tab.RnTrafoView;

@RestController
@RequestMapping("/rn_trafo")
public class RnTrafoController {
	@Autowired
	private RnTrafoService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<RnTrafo> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<RnTrafo> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/sve", params = {"mesto_id", "datumr"}, method=RequestMethod.GET)
	public List<RnTrafo> findRnTrafoByMesto(@RequestParam(value = "mesto_id") Long mesto_id,
											@RequestParam(value = "datumr") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datumr) {	
		return service.findRnTrafoByMesto(mesto_id, datumr);
	}
	
	@RequestMapping(value = "/sve", params = {"trafo_id"}, method=RequestMethod.GET)
	public List<RnTrafo> findRnTrafoByTrafo(@RequestParam(value = "trafo_id") Long trafo_id) {	
		return service.findRnTrafoByTrafo(trafo_id);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<RnTrafoView> getAllView() {
		return service.findAllView();
	}
	
	@RequestMapping(value = "/tab", params = {"trafo_id"}, method=RequestMethod.GET)
	public List<RnTrafoView> findRnTrafoViewByTrafo(@RequestParam(value = "trafo_id") Long trafo_id) {	
		return service.findRnTrafoViewByTrafo(trafo_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public RnTrafo findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public RnTrafo add(@RequestBody RnTrafo obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/provera", params = {"datumr", "trafo_id"}, method=RequestMethod.GET)
	public Long proveriRacun(@RequestParam(value = "datumr") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datumr, 
								@RequestParam(value = "trafo_id") Long trafo_id ) {

		return service.proveriRacun(datumr, trafo_id);
	}
}
