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

import com.isem.mvc.model.Mesto;
import com.isem.mvc.service.MestoService;

@RestController
@RequestMapping("/mesto")
public class MestoController {
	@Autowired
	private MestoService mestoService;
	
	@RequestMapping("/sve")
	public List<Mesto> getAllMesto() {
		return mestoService.findAll();
	}
	
	@RequestMapping(value = "/sve", params = {"str", "vel"})
	public Page<Mesto> getAllMesto(@RequestParam(value = "str") int strana, 
									  @RequestParam(value = "vel") int velicina ) {
		
	    Pageable pageable = new PageRequest(strana, velicina);
	    
		return mestoService.findAll(pageable);
	}
	
	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public Mesto vratiMestoaId(@RequestParam("id") Long id){
		return mestoService.findById(id);
	}	
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Mesto addMesto(@RequestBody Mesto mesto) {
		
		return mestoService.save(mesto);
		
		/*
		Mesto update = new Mesto();
		
		if (mesto.getId() != null) {		
			update = mestoService.findById(mesto.getId());			
		}
		
		if(update != null){
			update.setNaziv(mesto.getNaziv());
			update.setOpstina(mesto.getOpstina());
			
			return mestoService.save(update);
			
	    } else {
	    
	    	return mestoService.save(mesto);
	    }		
		*/
	}
}
