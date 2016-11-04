package com.isem.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.Uloga;
import com.isem.mvc.service.UlogaService;

@RestController
@RequestMapping("/uloga")
public class UlogaController {

	@Autowired
	private UlogaService ulogaService;
	
	@RequestMapping("/obrisi")
	public void test(@RequestBody Long id) {
		ulogaService.obrisiUlogu(id);
	}	
	
	@RequestMapping("/sve")
	public List<Uloga> getAllUloga() {
		return ulogaService.findAll();
	}
	
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Uloga addUloga(@RequestBody Uloga u) {
		Uloga ul = new Uloga();
		
		if (u.getId() != null) {
		
			ul = ulogaService.findById(u.getId());
			System.out.println("test3:"+ul);
		}
		
		if(ul != null){
			ul.setNaziv(u.getNaziv());
			ul.setKraciNaz(u.getKraciNaz());
			System.out.println("test2:"+ul);
			return ulogaService.save(ul);
			
	    } else {
	    	System.out.println("test:"+u);
	    	return ulogaService.save(u);
	    }		
		
	}
}



