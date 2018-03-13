package com.isem.mvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isem.mvc.izvestaj.ApsGodPot;
import com.isem.mvc.izvestaj.ApsMesPot;
import com.isem.mvc.izvestaj.EfikObj;
import com.isem.mvc.izvestaj.KotEfikasnost;
import com.isem.mvc.izvestaj.KotGodPot;
import com.isem.mvc.izvestaj.KotMesPot;
import com.isem.mvc.izvestaj.KotPotPoKot;
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
import com.isem.mvc.izvestaj.VozEfikasnost;
import com.isem.mvc.izvestaj.VozPregled;
import com.isem.mvc.izvestaj.VozUkPotEne;
import com.isem.mvc.izvestaj.dao.ApsGodPotDao;
import com.isem.mvc.izvestaj.dao.ApsMesPotDao;
import com.isem.mvc.izvestaj.dao.EfikObjDao;
import com.isem.mvc.izvestaj.dao.KotEfikasnostDao;
import com.isem.mvc.izvestaj.dao.KotGodPotDao;
import com.isem.mvc.izvestaj.dao.KotMesPotDao;
import com.isem.mvc.izvestaj.dao.KotPotPoKotDao;
import com.isem.mvc.izvestaj.dao.PregObjDao;
import com.isem.mvc.izvestaj.dao.RasGodPotDao;
import com.isem.mvc.izvestaj.dao.RasMesPotDao;
import com.isem.mvc.izvestaj.dao.RasPotPoTrafDao;
import com.isem.mvc.izvestaj.dao.SpecGodPotDao;
import com.isem.mvc.izvestaj.dao.SpecMesPotDao;
import com.isem.mvc.izvestaj.dao.SpecPotEneObjDao;
import com.isem.mvc.izvestaj.dao.UkPotEneObjDao;
import com.isem.mvc.izvestaj.dao.UkPotObjDao;
import com.isem.mvc.izvestaj.dao.VodGodPotDao;
import com.isem.mvc.izvestaj.dao.VodMesPotDao;
import com.isem.mvc.izvestaj.dao.VodPotPoVodDao;
import com.isem.mvc.izvestaj.dao.VozEfikasnostDao;
import com.isem.mvc.izvestaj.dao.VozPregledDao;
import com.isem.mvc.izvestaj.dao.VozUkPotEneDao;

@Service
public class IzvestajService {
	@Autowired
	private ApsMesPotDao dao;
	
	@Autowired
	private UkPotEneObjDao dao2;
	
	@Autowired
	private ApsGodPotDao dao3;
	
	@Autowired
	private SpecGodPotDao dao4;
	
	@Autowired
	private SpecMesPotDao dao5;
	
	@Autowired
	private UkPotObjDao dao6;
	
	@Autowired
	private SpecPotEneObjDao dao7;
	
	@Autowired
	private EfikObjDao dao8;
	
	@Autowired
	private PregObjDao dao9;
	
	@Autowired
	private RasGodPotDao dao10;
	
	@Autowired
	private RasMesPotDao dao11;
	
	@Autowired
	private RasPotPoTrafDao dao12;
	
	@Autowired
	private VodGodPotDao dao13;
	
	@Autowired
	private VodMesPotDao dao14;
	
	@Autowired
	private VodPotPoVodDao dao15;
	
	@Autowired
	private KotGodPotDao dao16;
	
	@Autowired
	private KotMesPotDao dao17;
	
	@Autowired
	private KotPotPoKotDao dao18;
	
	@Autowired
	private VozUkPotEneDao dao19;
	
	@Autowired
	private VozPregledDao dao20;
	
	@Autowired
	private VozEfikasnostDao dao21;
	
	@Autowired
	private KotEfikasnostDao dao22;
	
	public List<ApsMesPot> apsMesPot (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao.apsMesPot(obj_id, ene_tip_id, datum_od, datum_do);
	}	
	
	public List<UkPotEneObj> ukPotEneObj (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao2.ukPotEneObj(obj_id, ene_tip_id, datum_od, datum_do);
	}	
	
	public List<ApsGodPot> apsGodPot (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao3.apsGodPot(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	public List<SpecGodPot> specGodPot (String obj_id, String ene_tip_id, Date datum_od, Date datum_do, String indikator) {
		return dao4.specGodPot(obj_id, ene_tip_id, datum_od, datum_do, indikator);
	}
	
	public List<SpecMesPot> specMesPot (String obj_id, String ene_tip_id, Date datum_od, Date datum_do, String indikator) {
		return dao5.specMesPot(obj_id, ene_tip_id, datum_od, datum_do, indikator);
	}
	
	public List<UkPotObj> ukPotObj (String obj_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao6.ukPotObj(obj_id, ene_tip_id, datum_od, datum_do);
	}
	
	public List<SpecPotEneObj> specPotEneObj (String obj_id, String ene_tip_id, Date datum_od, Date datum_do, String indikator) {
		return dao7.specPotEneObj(obj_id, ene_tip_id, datum_od, datum_do, indikator);
	}
	
	public List<EfikObj> efikObj (String obj_id, String ene_tip_id, Date datum_od, Date datum_do, String indikator) {
		return dao8.efikObj(obj_id, ene_tip_id, datum_od, datum_do, indikator);
	}
	
	public List<PregObj> pregObj (String obj_id) {
		return dao9.pregObj(obj_id);
	}
	
	public List<RasGodPot> rasGodPot (String trafo_id, Date datum_od, Date datum_do) {
		return dao10.rasGodPot(trafo_id, datum_od, datum_do);
	}
	
	public List<RasMesPot> rasMesPot (String trafo_id, Date datum_od, Date datum_do) {
		return dao11.rasMesPot(trafo_id, datum_od, datum_do);
	}
	
	public List<RasPotPoTraf> rasPotPoTraf (String trafo_id, Date datum_od, Date datum_do) {
		return dao12.rasPotPoTraf(trafo_id, datum_od, datum_do);
	}
	
	public List<VodGodPot> vodGodPot (Integer grupa_id, String vod_id, Date datum_od, Date datum_do) {
		return dao13.vodGodPot(grupa_id, vod_id, datum_od, datum_do);
	}
	
	public List<VodMesPot> vodMesPot (Integer grupa_id, String vod_id, Date datum_od, Date datum_do) {
		return dao14.vodMesPot(grupa_id, vod_id, datum_od, datum_do);
	}
	
	public List<VodPotPoVod> vodPotPoVod (Integer grupa_id, String vod_id, Date datum_od, Date datum_do) {
		return dao15.vodPotPoVod(grupa_id, vod_id, datum_od, datum_do);
	}
	
	public List<KotGodPot> kotGodPot (String kot_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao16.kotGodPot(kot_id, ene_tip_id, datum_od, datum_do);
	}
	
	public List<KotMesPot> kotMesPot (String kot_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao17.kotMesPot(kot_id, ene_tip_id, datum_od, datum_do);
	}
	
	public List<KotPotPoKot> kotPotPoKot (String kot_id, String ene_tip_id, Date datum_od, Date datum_do) {
		return dao18.kotPotPoKot(kot_id, ene_tip_id, datum_od, datum_do);
	}
	
	public List<VozUkPotEne> vozUkPotEne (String voz_id, String ene_id, Date datum_od, Date datum_do) {
		return dao19.vozUkPotEne(voz_id, ene_id, datum_od, datum_do);
	}
	
	public List<VozPregled> vozPregled (String voz_id) {
		return dao20.vozPregled(voz_id);
	}
	
	public List<VozEfikasnost> vozEfikasnost (String voz_id, Date datum_od, Date datum_do) {
		return dao21.vozEfikasnost(voz_id, datum_od, datum_do);
	}
	
	public List<KotEfikasnost> kotEfikasnost (String kot_id, Date datum_od, Date datum_do) {
		return dao22.kotEfikasnost(kot_id, datum_od, datum_do);
	}

}
