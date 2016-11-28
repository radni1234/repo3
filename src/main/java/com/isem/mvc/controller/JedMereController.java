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

import com.isem.mvc.model.JedMere;
import com.isem.mvc.service.JedMereService;

@RestController
@RequestMapping("/jedmere")
public class JedMereController {
	@Autowired
	private JedMereService jedMereService;
	
	@RequestMapping("/sve")
	public List<JedMere> getAllJedMere() {
		return jedMereService.findAll();
	}
	
	@RequestMapping(value = "/sve", params = {"str", "vel"})
	public Page<JedMere> getAllJedMere(@RequestParam(value = "str") int strana, 
									  @RequestParam(value = "vel") int velicina ) {
		
	    Pageable pageable = new PageRequest(strana, velicina);
	    
		return jedMereService.findAll(pageable);
	}
	
	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public JedMere vratiJedMereId(@RequestParam("id") Long id){
		return jedMereService.findById(id);
	}		
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public JedMere addJedMere(@RequestBody JedMere jedMere) {
		
		return jedMereService.save(jedMere);
	}
	
	@RequestMapping("/obrisi")
	public void test(@RequestBody Long id) {
		jedMereService.delete(id);
	}
}
