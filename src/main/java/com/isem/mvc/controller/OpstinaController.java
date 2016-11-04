package com.isem.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.Opstina;
import com.isem.mvc.service.OpstinaService;

@RestController
@RequestMapping("/opstina")
public class OpstinaController {
	
	@Autowired
	private OpstinaService opstinaService;
	
	@RequestMapping("/obrisi")
	public void test(@RequestBody Long id) {
		opstinaService.obrisiOpstinu(id);
	}	
	
	@RequestMapping("/sve")
	public List<Opstina> getAllOpstina() {
		return opstinaService.findAll();
	}
	
	@RequestMapping(value="/jedna", method=RequestMethod.GET)
	public Opstina getOpstina(@RequestParam("naziv") String naziv) {
		System.out.println("naziv "+naziv);
		return opstinaService.findByNaziv(naziv);
	}
	
	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public Opstina addOpstina(@RequestBody Opstina o) {
		Opstina op = new Opstina();
		
		if (o.getId() != null) {
		
			op = opstinaService.findById(o.getId());
		}
		
		if(op != null){
			op.setNaziv(o.getNaziv());
			return opstinaService.save(op);
	    } else {
	    	return opstinaService.save(o);
	    }		
		
	}
}



