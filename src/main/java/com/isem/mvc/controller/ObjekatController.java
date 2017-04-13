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
import com.isem.mvc.model.Objekat;
import com.isem.mvc.security.JwtTokenUtil;
import com.isem.mvc.service.ObjekatService;
import com.isem.mvc.tab.ObjekatView;

@RestController
@RequestMapping("/objekat")
public class ObjekatController {
	@Autowired
	private ObjekatService service;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<Objekat> getAll(@RequestHeader("Authorization") String user) {
		
		if(user != null && user.startsWith("Bearer ")) {
			user = user.substring(7);
        }
		
		String username = jwtTokenUtil.getUsernameFromToken(user);
		
		return service.findAll(username);
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<Objekat> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<ObjekatView> getAllTab(@RequestHeader("Authorization") String user) {
		if(user != null && user.startsWith("Bearer ")) {
			user = user.substring(7);
        }
		
		String username = jwtTokenUtil.getUsernameFromToken(user);
		
		return service.findAllView(username);
	}

	@RequestMapping(value="/tab", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<ObjekatView> getAllTab(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAllView(pageable);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Objekat findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Objekat add(@RequestBody Objekat obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/lov", method=RequestMethod.GET)
	public List<Lov> getObjekatLov() {
		return service.objekatLov();
	}
	
	@RequestMapping(value="/lov", params = {"ops_id", "mes_id", "gru_id", "podgru_id"}, method=RequestMethod.GET)
	public List<Lov> getObjekatLov(@RequestParam(value = "ops_id") Long opsId, 
								   @RequestParam(value = "mes_id") Long mesId,
								   @RequestParam(value = "gru_id") Long gruId, 
								   @RequestParam(value = "podgru_id") Long podgruId) {
		return service.objekatIzvestajLov(opsId, mesId, gruId, podgruId);
	}
}
