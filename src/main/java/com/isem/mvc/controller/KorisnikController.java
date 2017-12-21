package com.isem.mvc.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.security.User;
import com.isem.mvc.security.JwtTokenUtil;
import com.isem.mvc.service.KorisnikService;
import com.isem.mvc.tab.KorisnikMeniView;
import com.isem.mvc.tab.KorisnikView;

@RestController
@RequestMapping("/korisnik")
public class KorisnikController {	
//	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	private KorisnikService service;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<User> getAll(@RequestHeader("Authorization") String user) {
		return service.findAll(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<User> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina,
								@RequestHeader("Authorization") String user) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable, jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}
	
	@RequestMapping(value="/tab", method=RequestMethod.GET)
	public List<KorisnikView> getAllView(@RequestHeader("Authorization") String user){
		return service.findAllView(jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}
	
	@RequestMapping(value="/tab", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<KorisnikView> getAllView(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina,
								@RequestHeader("Authorization") String user) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAllView(pageable, jwtTokenUtil.vratiKorisnikaIzTokena(user));
	}
	
	@RequestMapping(value="/alarm", method=RequestMethod.GET)
	public List<User> korisnikAlarm() {
		return service.korisnikAlarm();
	}
	
	@RequestMapping(value="/alarm_ma", method=RequestMethod.GET)
	public List<User> menadzerAlarm() {
		return service.menadzerAlarm();
	}
	
	@RequestMapping(value="/alarm", params = {"menadzer"}, method=RequestMethod.GET)
	public List<User> menadzerKorisnikAlarm(@RequestParam(value = "menadzer") String menadzer) {
		return service.menadzerKorisnikAlarm(menadzer);
	}	

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public User findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		
	
	@RequestMapping(value="/jedan", params = {"username"}, method=RequestMethod.GET)
	public User findByUsername(@RequestParam("username") String username){
		return service.findByUsername(username);
	}
	
	@RequestMapping(value="/meni", params = {"username"}, method=RequestMethod.GET)
	public KorisnikMeniView findByUsernameMeni(@RequestParam("username") String username){
		return service.findByUsernameMeni(username);
	}

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public User add(@RequestBody User obj) {
		if(obj.getId() == null){
		
			obj.setPassword(passwordEncoder.encode(obj.getPassword()));
		} else {
			User u = service.findById(obj.getId());

			if (obj.getPassword() != null && !u.getPassword().equals(obj.getPassword())){
				
				obj.setPassword(passwordEncoder.encode(obj.getPassword()));
			} else {
				
				obj.setPassword(u.getPassword());
			}
		}
		
		
		final Log logger = LogFactory.getLog(this.getClass());
    	logger.info("enabled");
    	logger.info(obj.getEnabled());
    	
    	if (obj.getEnabled() == null){
    		obj.setEnabled(true); 
    	} 
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}	
		 
}
