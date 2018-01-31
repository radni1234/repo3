package com.isem.mvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isem.mvc.izvestaj.ApsGodPot;
import com.isem.mvc.izvestaj.ApsMesPot;
import com.isem.mvc.izvestaj.EfikObj;
import com.isem.mvc.izvestaj.PregObj;
import com.isem.mvc.izvestaj.RasGodPot;
import com.isem.mvc.izvestaj.RasMesPot;
import com.isem.mvc.izvestaj.RasPotPoTraf;
import com.isem.mvc.izvestaj.SpecGodPot;
import com.isem.mvc.izvestaj.SpecMesPot;
import com.isem.mvc.izvestaj.SpecPotEneObj;
import com.isem.mvc.izvestaj.UkPotEneObj;
import com.isem.mvc.izvestaj.UkPotObj;
import com.isem.mvc.izvestaj.VodGodPot;
import com.isem.mvc.izvestaj.VodMesPot;
import com.isem.mvc.izvestaj.VodPotPoVod;
import com.isem.mvc.service.IzvestajService;

@RestController
@RequestMapping("/izvestaj")
public class IzvestajController {
	@Autowired
	private IzvestajService service;
	
	@RequestMapping(value="/aps_mes_pot", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<ApsMesPot> izvApsMesPot(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.apsMesPot(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	@RequestMapping(value="/uk_pot_ene_obj", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<UkPotEneObj> ukPotEneObj(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.ukPotEneObj(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	
	@RequestMapping(value="/aps_god_pot", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<ApsGodPot> izvApsGodPot(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.apsGodPot(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	@RequestMapping(value="/spec_god_pot", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do", "indikator"}, method=RequestMethod.GET)
	public List<SpecGodPot> izvSpecGodPot(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do,
			@RequestParam("indikator") String indikator) {
		return service.specGodPot(obj_id, ene_tip_id, datum_od, datum_do, indikator);
	}
	
	@RequestMapping(value="/spec_mes_pot", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do", "indikator"}, method=RequestMethod.GET)
	public List<SpecMesPot> izvSpecMesPot(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do,
			@RequestParam("indikator") String indikator) {
		return service.specMesPot(obj_id, ene_tip_id, datum_od, datum_do, indikator);
	}
	
	@RequestMapping(value="/uk_pot_obj", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<UkPotObj> izvUkPotObj(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.ukPotObj(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	@RequestMapping(value="/spec_pot_ene_obj", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do", "indikator"}, method=RequestMethod.GET)
	public List<SpecPotEneObj> izvSpecPotEneObj(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do,
			@RequestParam("indikator") String indikator) {
		return service.specPotEneObj(obj_id, ene_tip_id, datum_od, datum_do, indikator);
	}
	
	@RequestMapping(value="/efik_obj", params = {"obj_id", "ene_tip_id", "datum_od", "datum_do", "indikator"}, method=RequestMethod.GET)
	public List<EfikObj> izvEfikObj(@RequestParam("obj_id") String obj_id,
			@RequestParam("ene_tip_id") String ene_tip_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do,
			@RequestParam("indikator") String indikator) {
		return service.efikObj(obj_id, ene_tip_id, datum_od, datum_do, indikator);
	}
	
	@RequestMapping(value="/preg_obj", params = {"obj_id"}, method=RequestMethod.GET)
	public List<PregObj> pregObj(@RequestParam("obj_id") String obj_id) {
		return service.pregObj(obj_id);
	}
	
	@RequestMapping(value="/ras_god_pot", params = {"trafo_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<RasGodPot> rasGodPot(@RequestParam("trafo_id") String trafo_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.rasGodPot(trafo_id, datum_od, datum_do);
	}
	
	@RequestMapping(value="/ras_mes_pot", params = {"trafo_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<RasMesPot> rasMesPot(@RequestParam("trafo_id") String trafo_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.rasMesPot(trafo_id, datum_od, datum_do);
	}
	
	@RequestMapping(value="/ras_pot_po_traf", params = {"trafo_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<RasPotPoTraf> rasPotPoTraf(@RequestParam("trafo_id") String trafo_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.rasPotPoTraf(trafo_id, datum_od, datum_do);
	}
	
	@RequestMapping(value="/vod_god_pot", params = {"vod_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<VodGodPot> vodGodPot(@RequestParam("vod_id") String vod_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.vodGodPot(vod_id, datum_od, datum_do);
	}
	
	@RequestMapping(value="/vod_mes_pot", params = {"vod_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<VodMesPot> vodMesPot(@RequestParam("vod_id") String vod_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.vodMesPot(vod_id, datum_od, datum_do);
	}
	
	@RequestMapping(value="/vod_pot_po_traf", params = {"vod_id", "datum_od", "datum_do"}, method=RequestMethod.GET)
	public List<VodPotPoVod> vodPotPoVod(@RequestParam("vod_id") String vod_id,
			@RequestParam(value = "datum_od") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_od,
			@RequestParam(value = "datum_do") @DateTimeFormat(pattern = "dd.MM.yyyy") Date datum_do) {
		return service.vodPotPoVod(vod_id, datum_od, datum_do);
	}
}
