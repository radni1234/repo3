package com.isem.mvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.model.ProizvodnjaVode;
import com.isem.mvc.service.ProizvodnjaVodeService;
import com.isem.mvc.tab.ProizvodnjaVodeView;

@RestController
@RequestMapping("/proizvodnja_vode")
public class ProizvodnjaVodeController {
	@Autowired
	private ProizvodnjaVodeService service;

	@RequestMapping(value="/sve", method=RequestMethod.GET)
	public List<ProizvodnjaVode> getAll() {
		return service.findAll();
	}

	@RequestMapping(value="/sve", params = {"str", "vel"}, method=RequestMethod.GET)
	public Page<ProizvodnjaVode> getAll(@RequestParam(value = "str") int strana, 
								@RequestParam(value = "vel") int velicina ) {
		
		Pageable pageable = new PageRequest(strana, velicina);
		
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/sve", params = {"vodozahvat_id"}, method=RequestMethod.GET)
	public List<ProizvodnjaVode> findProizvodnjaVodeByVodozahvat(@RequestParam(value = "vodozahvat_id") Long id) {	
		return service.findProizvodnjaVodeByVodozahvat(id);
	}
	
	@RequestMapping(value = "/tab", params = {"vodozahvat_id"}, method=RequestMethod.GET)
	public List<ProizvodnjaVodeView> findProizVodeViewByVodozahvat(@RequestParam(value = "vodozahvat_id") Long vodozahvat_id) {	
		return service.findProizVodeViewByVodozahvat(vodozahvat_id);
	}

	@RequestMapping(value="/jedan", params = {"id"}, method=RequestMethod.GET)
	public ProizvodnjaVode findById(@RequestParam("id") Long id){
		return service.findById(id);
	}		

	@RequestMapping(value="/dodaj", method=RequestMethod.POST)
	public ProizvodnjaVode add(@RequestBody ProizvodnjaVode obj) {
		
		return service.save(obj);
	}

	@RequestMapping(value="/obrisi", params = {"id"}, method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") Long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/provera", params = {"datum", "vodozahvat_id"}, method=RequestMethod.GET)
	public Long proveriUnos(@RequestParam(value = "datum") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum, 
								@RequestParam(value = "vodozahvat_id") Long vodozahvat_id ) {

		return service.proveriUnos(datum, vodozahvat_id);
	}
}
