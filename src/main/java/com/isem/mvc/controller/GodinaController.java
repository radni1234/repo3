package com.isem.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.Godina;
import com.isem.mvc.service.GodinaService;

@RestController
@RequestMapping("/godina")
public class GodinaController {
	
	@Autowired
	private GodinaService godinaService;
	
	@RequestMapping("/sve")
	public List<Godina> getAllGodina() {
		return godinaService.findAll();
	}
	
	@RequestMapping(value="/jedna", method=RequestMethod.GET)
	public Godina getGodina(@RequestParam("id") Long id) {
		return godinaService.findById(id);
	}
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Godina addGodina(@RequestBody Godina o) {
		Godina op = new Godina();
		
		if (o.getId() != null) {
		
			op = godinaService.findById(o.getId());
		}
		
		if(op != null){
			op.setNaziv(o.getNaziv());
			return godinaService.save(op);
	    } else {
	    	return godinaService.save(o);
	    }		
		
	}
	
	@RequestMapping("/obrisi")
	public void test(@RequestBody Long id) {
		godinaService.delete(id);
	}
}
