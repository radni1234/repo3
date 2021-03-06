package com.isem.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.TrendIskljuceno;
import com.isem.mvc.security.JwtTokenUtil;
import com.isem.mvc.service.TrendIskljucenoService;
import com.isem.mvc.tab.TrendIskljucenoView;

@RestController
@RequestMapping("trend_isklj")
public class TrendIskljucenoController {
	@Autowired
	private TrendIskljucenoService service;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<TrendIskljuceno> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<TrendIskljuceno> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<TrendIskljucenoView> getAllTab(@RequestHeader("Authorization") String user) {
		
		return service.findAllView(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public TrendIskljuceno findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public TrendIskljuceno add(@RequestBody TrendIskljuceno obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
