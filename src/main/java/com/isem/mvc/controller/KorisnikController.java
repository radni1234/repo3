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
import com.isem.mvc.view.KorisnikView;

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
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<KorisnikView> vratiKorisnikTabela(){
		return korisnikService.findAllView();
	}
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Korisnik addKorisnik(@RequestBody Korisnik korisnik) {
		Korisnik update = new Korisnik();
		
		if (korisnik.getId() != null) {		
			update = korisnikService.findById(korisnik.getId());			
		}
		
		if(update != null){
			update.setUloga(korisnik.getUloga());
			update.setUsername(korisnik.getUsername());
			update.setPassword(korisnik.getPassword());
			update.setMesto(korisnik.getMesto());
			update.setNaziv(korisnik.getNaziv());
			update.setTel(korisnik.getTel());
			update.setFax(korisnik.getFax());
			update.setMob(korisnik.getMob());
			update.setMail(korisnik.getMail());
			update.setBlokiran(korisnik.getBlokiran());
			update.setRasveta(korisnik.getRasveta());
			update.setAlarmRacun(korisnik.getAlarmRacun());
			update.setAlarmRacunStart(korisnik.getAlarmRacunStart());
			update.setAlarmTrend(korisnik.getAlarmTrend());
			update.setAlarmTrendStart(korisnik.getAlarmTrendStart());
			
			return korisnikService.save(update);
			
	    } else {
	    	
	    	return korisnikService.save(korisnik);
	    }		
		
	}
	
	@RequestMapping(value="/obrisi", method=RequestMethod.POST)
	public void obrisiKorisnika(@RequestBody Long id) {
		korisnikService.delete(id);
	}	
		 
}
