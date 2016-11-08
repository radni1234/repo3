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

import com.isem.mvc.model.Korisnik;
import com.isem.mvc.service.KorisnikService;

@RestController
@RequestMapping("/korisnik")
public class KorisnikController {
	

	@Autowired
	private KorisnikService korisnikService;
	
	@RequestMapping("/sve")
	public List<Korisnik> getAllKorisnik() {
		return korisnikService.findAll();
	}
	
	@RequestMapping(value = "/sve", params = {"strana", "velicina"})
	public Page<Korisnik> getAllKorisnik(@RequestParam(value = "strana") int strana, 
									  @RequestParam(value = "velicina") int velicina ) {
		
	    Pageable pageable = new PageRequest(strana, velicina);
	    
		return korisnikService.findAll(pageable);
	}
	
	@RequestMapping(value="/jedan", params = {"username"}, method=RequestMethod.GET)
	public Korisnik vratiKorisnikaUsername(@RequestParam("username") String username){
		return korisnikService.findByUsername(username);
	}
	
	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Korisnik vratiKorisnikaId(@RequestParam("id") Long id){
		return korisnikService.findById(id);
	}	
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Korisnik addKorisnik(@RequestBody Korisnik k) {
		Korisnik ko = new Korisnik();
		
		if (k.getId() != null) {
		
			ko = korisnikService.findById(k.getId());
			System.out.println("test3:"+ko);
		}
		
		if(ko != null){
			ko.setUloga(k.getUloga());
			ko.setOpstina(k.getOpstina());
			ko.setUsername(k.getUsername());
			ko.setPassword(k.getPassword());
			System.out.println("test2:"+ko);
			return korisnikService.save(ko);
			
	    } else {
	    	System.out.println("test:"+k);
	    	return korisnikService.save(k);
	    }		
		
	}
	
	@RequestMapping(value="/obrisi", method=RequestMethod.POST)
	public void obrisiKorisnika(@RequestBody Long id) {
		korisnikService.delete(id);
	}	
		 
}
