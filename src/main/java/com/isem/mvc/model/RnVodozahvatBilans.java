package com.isem.mvc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RnVodozahvatBilans {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "RN_VODOZAHVAT_ID",
            foreignKey = @ForeignKey(name = "RN_VODOZAHVAT_BILANS_FK1")
    )
	private RnVodozahvat rnVodozahvat;

	@ManyToOne
    @JoinColumn(name = "BROJILO_VODOZAHVAT_ID",
            foreignKey = @ForeignKey(name = "RN_VODOZAHVAT_BILANS_FK2")
    )
	private BrojiloVodozahvat brojiloVodozahvat;
	
	@ManyToOne
    @JoinColumn(name = "ENERGENT_ID",
            foreignKey = @ForeignKey(name = "RN_VODOZAHVAT_BILANS_FK3")
    )
	private Energent energent;
	
	@ManyToOne
    @JoinColumn(name = "DOBAVLJAC_ID",
            foreignKey = @ForeignKey(name = "RN_VODOZAHVAT_BILANS_FK4")
    )
	private Dobavljac dobavljac;
	
	@ManyToOne
    @JoinColumn(name = "RN_TIP_ID",
            foreignKey = @ForeignKey(name = "RN_VODOZAHVAT_BILANS_FK5")
    )
	private RnTip rnTip;
	
	@Column(name = "DATUMR")
	private Date datumr;
	
	@Column(name = "IZNOS", columnDefinition = "numeric(18,2)")
	private Double iznos;
	
	@Column(name = "KOLICINA", columnDefinition = "numeric(18,2)")
	private Double kolicina;
	
	@Column(name = "KOLICINA_KWH", columnDefinition = "numeric(18,2)")
	private Double kolicina_kwh;	
	
	@Column(name = "KOLICINA_FIN_ENE", columnDefinition = "numeric(18,2)")
	private Double kolicina_fin_ene;
	
	@Column(name = "KOLICINA_PRIM_ENE", columnDefinition = "numeric(18,2)")
	private Double kolicina_prim_ene;
	
	@Column(name = "EMISIJA_CO2", columnDefinition = "numeric(18,2)")
	private Double emisija_co2;
	
}
