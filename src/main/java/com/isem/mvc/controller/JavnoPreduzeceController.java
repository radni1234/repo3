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

import com.isem.mvc.lov.Lov;
import com.isem.mvc.model.JavnoPreduzece;
import com.isem.mvc.security.JwtTokenUtil;
import com.isem.mvc.service.JavnoPreduzeceService;
import com.isem.mvc.tab.JavnoPreduzeceView;

@RestController
@RequestMapping("/javno_pred")
public class JavnoPreduzeceController {
	@Autowired
	private JavnoPreduzeceService service;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<JavnoPreduzece> getAll(@RequestHeader("Authorization") String user) {
		return service.findAll(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<JavnoPreduzece> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina,
								@RequestHeader("Authorization") String user) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable, jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<JavnoPreduzeceView> getAllView(@RequestHeader("Authorization") String user) {
		return service.findAllView(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}

	@RequestMapping(value="/tab", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<JavnoPreduzeceView> getAllView(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina,
								@RequestHeader("Authorization") String user) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAllView(pageable, jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}
	
	@RequestMapping(value="/lov", method=RequestMethod.GET)
	public List<Lov> energentTipLov(@RequestHeader("Authorization") String user) {
		return service.javnoPreduzeceLov(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public JavnoPreduzece findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public JavnoPreduzece add(@RequestBody JavnoPreduzece obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
