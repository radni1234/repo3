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
import com.isem.mvc.model.Vozilo;
import com.isem.mvc.security.JwtTokenUtil;
import com.isem.mvc.service.VoziloService;
import com.isem.mvc.tab.VoziloView;

@RestController
@RequestMapping("/vozilo")
public class VoziloController {
	@Autowired
	private VoziloService service;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<Vozilo> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<Vozilo> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<VoziloView> getAllView(@RequestHeader("Authorization") String user) {
		return service.findAllView(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Vozilo findById(@RequestParam("id") Long id){
		return service.findById(id);
	}	
	
	@RequestMapping(value="/lov", params = {"ops_id", "mes_id", "jav_pred_id"}, method=RequestMethod.GET)
	public List<Lov> energentTipLov(@RequestParam(value = "ops_id") Long opsId, 
			   @RequestParam(value = "mes_id") Long mesId,
			   @RequestParam(value = "jav_pred_id") Long javPredId,
			   @RequestHeader("Authorization") String user) {
		return service.voziloLov(jwtTokenUtil.vratiKorisnikaIzTokena(user), opsId, mesId, javPredId);
	}

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Vozilo add(@RequestBody Vozilo obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
}
