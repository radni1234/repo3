package com.isem.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.Korisnik;
import com.isem.mvc.service.KorisnikService;

@RestController
@RequestMapping("/korisnik")
public class KorisnikController {
	

	@Autowired
	private KorisnikService korisnikService;
	
	@RequestMapping("/obrisi")
	public void test(@RequestBody Long id) {
		korisnikService.obrisiKorisnika(id);
	}	
	
	@RequestMapping("/sve")
	public List<Korisnik> getAllUloga() {
		return korisnikService.findAll();
	}
	
	@RequestMapping("/poruka")
	public String loginSuccess(){
		return "Login Successful!";
	}
	
	@RequestMapping("/jedan")
	public Korisnik vratiKorisnika(){
		return korisnikService.findByUsername("toma");
	}
		 
}
