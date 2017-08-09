package com.isem.mvc.tab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(
        name="rn_prikaz",
        procedureName="rn_prikaz",
        resultClasses = { RnPrikaz.class },
        parameters={
            @StoredProcedureParameter(name="i_bro_id", type=String.class, mode=ParameterMode.IN)
        }
)
public class RnPrikaz {
	private BigInteger id;
	private String brojilo;
	private String energent;
	private String godina;
	private String mesec;
	private String dobavljac;
	private String rnTip;
	private String brojRn;
	private Date datumr;
	private String napomena;
	private String uneo;
	private Date datumu;
	private String menjao;
	private Date datumm;
	
	private BigDecimal k1;
	private BigDecimal k2;
	private BigDecimal k3;
	private BigDecimal k4;
	private BigDecimal k5;
	private BigDecimal k6;
	private BigDecimal k7;
	private BigDecimal k8;
	private BigDecimal k9;
	private BigDecimal k10;	
	
	
	
	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2, BigDecimal k3, BigDecimal k4, BigDecimal k5, BigDecimal k6,
			BigDecimal k7, BigDecimal k8, BigDecimal k9, BigDecimal k10) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
		this.k4 = k4;
		this.k5 = k5;
		this.k6 = k6;
		this.k7 = k7;
		this.k8 = k8;
		this.k9 = k9;
		this.k10 = k10;
	}	
	
	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2, BigDecimal k3, BigDecimal k4, BigDecimal k5, BigDecimal k6,
			BigDecimal k7, BigDecimal k8, BigDecimal k9) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
		this.k4 = k4;
		this.k5 = k5;
		this.k6 = k6;
		this.k7 = k7;
		this.k8 = k8;
		this.k9 = k9;
	}	

	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2, BigDecimal k3, BigDecimal k4, BigDecimal k5, BigDecimal k6,
			BigDecimal k7, BigDecimal k8) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
		this.k4 = k4;
		this.k5 = k5;
		this.k6 = k6;
		this.k7 = k7;
		this.k8 = k8;
	}	

	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2, BigDecimal k3, BigDecimal k4, BigDecimal k5, BigDecimal k6,
			BigDecimal k7) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
		this.k4 = k4;
		this.k5 = k5;
		this.k6 = k6;
		this.k7 = k7;
	}	
	
	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2, BigDecimal k3, BigDecimal k4, BigDecimal k5, BigDecimal k6) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
		this.k4 = k4;
		this.k5 = k5;
		this.k6 = k6;
	}	

	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2, BigDecimal k3, BigDecimal k4, BigDecimal k5) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
		this.k4 = k4;
		this.k5 = k5;
	}
	
	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2, BigDecimal k3, BigDecimal k4) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
		this.k4 = k4;
	}	

	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2, BigDecimal k3) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
	}	

	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1, BigDecimal k2) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
		this.k2 = k2;
	}	

	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm, BigDecimal k1) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
		this.k1 = k1;
	}
	
	public RnPrikaz(BigInteger id, String brojilo, String energent, String godina, String mesec, String dobavljac,
			String rnTip, String brojRn, Date datumr, String napomena, String uneo, Date datumu, String menjao,
			Date datumm) {
		super();
		this.id = id;
		this.brojilo = brojilo;
		this.energent = energent;
		this.godina = godina;
		this.mesec = mesec;
		this.dobavljac = dobavljac;
		this.rnTip = rnTip;
		this.brojRn = brojRn;
		this.datumr = datumr;
		this.napomena = napomena;
		this.uneo = uneo;
		this.datumu = datumu;
		this.menjao = menjao;
		this.datumm = datumm;
	}

	public BigInteger getId() {
		return id;
	}
	public String getBrojilo() {
		return brojilo;
	}
	public String getEnergent() {
		return energent;
	}
	public String getGodina() {
		return godina;
	}
	public String getMesec() {
		return mesec;
	}
	public String getDobavljac() {
		return dobavljac;
	}
	public String getRnTip() {
		return rnTip;
	}
	public String getBrojRn() {
		return brojRn;
	}
	public Date getDatumr() {
		return datumr;
	}
	public String getNapomena() {
		return napomena;
	}
	public String getUneo() {
		return uneo;
	}
	public Date getDatumu() {
		return datumu;
	}
	public String getMenjao() {
		return menjao;
	}
	public Date getDatumm() {
		return datumm;
	}
	public BigDecimal getK1() {
		return k1;
	}
	public BigDecimal getK2() {
		return k2;
	}
	public BigDecimal getK3() {
		return k3;
	}
	public BigDecimal getK4() {
		return k4;
	}
	public BigDecimal getK5() {
		return k5;
	}
	public BigDecimal getK6() {
		return k6;
	}
	public BigDecimal getK7() {
		return k7;
	}
	public BigDecimal getK8() {
		return k8;
	}
	public BigDecimal getK9() {
		return k9;
	}
	public BigDecimal getK10() {
		return k10;
	}
	
	
	
}
