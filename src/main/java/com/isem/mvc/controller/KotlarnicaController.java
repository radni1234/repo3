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
import com.isem.mvc.model.Kotlarnica;
import com.isem.mvc.security.JwtTokenUtil;
import com.isem.mvc.service.KotlarnicaService;
import com.isem.mvc.tab.KotlarnicaView;

@RestController
@RequestMapping("/kotlarnica")
public class KotlarnicaController {
	@Autowired
	private KotlarnicaService service;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<Kotlarnica> getAll(@RequestHeader("Authorization") String user) {
		return service.findAll(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<Kotlarnica> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina,
								@RequestHeader("Authorization") String user) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable, jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<KotlarnicaView> getAllView(@RequestHeader("Authorization") String user) {
		return service.findAllView(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}

	@RequestMapping(value="/tab", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<KotlarnicaView> getAllView(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina,
								@RequestHeader("Authorization") String user) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAllView(pageable, jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}	

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Kotlarnica findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Kotlarnica add(@RequestBody Kotlarnica obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/lov", params = {"ops_id", "mes_id"}, method=RequestMethod.GET)
	public List<Lov> getKotlarnicaLov(@RequestParam(value = "ops_id") Long opsId, 
								   @RequestParam(value = "mes_id") Long mesId) {
		return service.kotlarnicaLov(opsId, mesId);
	}
}
