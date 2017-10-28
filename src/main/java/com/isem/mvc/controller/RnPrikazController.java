package com.isem.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.service.RnPrikazService;
import com.isem.mvc.tab.RnPrikaz;

@RestController
@RequestMapping("/rn_prikaz")
public class RnPrikazController {
	@Autowired
	private RnPrikazService service;
	
	@RequestMapping(params = {"bro_id"}, method=RequestMethod.GET)
	public List<RnPrikaz> rnPrikaz(@RequestParam("bro_id") String bro_id) {
		return service.rnPrikaz(bro_id);
	}
	
	@RequestMapping(params = {"kot_id"}, method=RequestMethod.GET)
	public List<RnPrikaz> rnPrikazKotlarnica(@RequestParam("kot_id") String kot_id) {
		return service.rnPrikazKotlarnica(kot_id);
	}
	
	@RequestMapping(params = {"vod_id"}, method=RequestMethod.GET)
	public List<RnPrikaz> rnPrikazVodozahvat(@RequestParam("vod_id") String vod_id) {
		return service.rnPrikazVodozahvat(vod_id);
	}
}
