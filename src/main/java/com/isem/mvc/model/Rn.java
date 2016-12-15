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
import javax.persistence.Version;

@Entity
public class Rn {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@ManyToOne
    @JoinColumn(name = "BROJILO_ID",
            foreignKey = @ForeignKey(name = "RN_FK1")
    )
	private Brojilo brojilo;
	
	@ManyToOne
    @JoinColumn(name = "ENERGENT_ID",
            foreignKey = @ForeignKey(name = "RN_FK2")
    )
	private Energent energent;
	
	@ManyToOne
    @JoinColumn(name = "GODINA_ID",
            foreignKey = @ForeignKey(name = "RN_FK3")
    )
	private Godina godina;
	
	@ManyToOne
    @JoinColumn(name = "MESEC_ID",
            foreignKey = @ForeignKey(name = "RN_FK4")
    )
	private Mesec mesec;
	
	@ManyToOne
    @JoinColumn(name = "DOBAVLJAC_ID",
            foreignKey = @ForeignKey(name = "RN_FK5")
    )
	private Dobavljac dobavljac;
	
	@ManyToOne
    @JoinColumn(name = "RN_TIP_ID",
            foreignKey = @ForeignKey(name = "RN_FK6")
    )
	private RnTip rnTip;
	
	@Column(name = "BROJ_RN", length = 100)
	private String brojRn;
	
	@Column(name = "DATUMR")
	private Date datumr;
	
	@Column(name = "NAPOMENA", length = 2000)
	private String napomena;
	
	@Column(name = "UNEO", length = 100)
	private String uneo;
	
	@Column(name = "DATUMU")
	private Date datumu;
	
	@Column(name = "MENJAO", length = 100)
	private String menjao;
	
	@Column(name = "DATUMM")
	private Date datumm;
	
	@Column(name = "STARI_ID")
	private Long stariId;
	
	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;

}
