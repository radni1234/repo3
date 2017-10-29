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

import com.isem.mvc.model.BrojiloVodozahvat;
import com.isem.mvc.service.BrojiloVodozahvatService;
import com.isem.mvc.tab.BrojiloVodozahvatView;

@RestController
@RequestMapping("/brojilo_vodozahvat")
public class BrojiloVodozahvatController {
	@Autowired
	private BrojiloVodozahvatService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<BrojiloVodozahvat> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<BrojiloVodozahvat> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/sve", params = {"vodozahvat_id"}, method=RequestMethod.GET)
	public List<BrojiloVodozahvat> getAllBrojiloByVodozahvat(@RequestParam(value = "vodozahvat_id") Long vod_id) {	
		return service.findBrojiloByVodozahvat(vod_id);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<BrojiloVodozahvatView> getAllView() {
		return service.findAllView();
	}
	
	@RequestMapping(value="/tab", params = {"vodozahvat_id"}, method=RequestMethod.GET)
	public List<BrojiloVodozahvatView> findBrojiloViewByVodozahvat(@RequestParam(value = "vodozahvat_id") Long vodozahvat_id) {		
		return service.findBrojiloViewByVodozahvat(vodozahvat_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public BrojiloVodozahvat findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public BrojiloVodozahvat add(@RequestBody BrojiloVodozahvat obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
