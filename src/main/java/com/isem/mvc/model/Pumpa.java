package com.isem.mvc.model;

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
public class Pumpa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "KOTAO_ID",
            foreignKey = @ForeignKey(name = "PUMPA_FK1")
    )
	private Kotao kotao;
	
	@ManyToOne
    @JoinColumn(name = "PODSTANICA_ID",
            foreignKey = @ForeignKey(name = "PUMPA_FK2")
    )
	private Podstanica podstanica;

	@Column(name = "TIP", length = 100)
	private String tip;
	
	@Column(name = "PROIZVODJAC", length = 100)
	private String proizvodjac;
	
	@Column(name = "SNAGA", columnDefinition = "numeric(18,2)")
	private Double snaga;
	
	@Column(name = "PROTOK", columnDefinition = "numeric(18,2)")
	private Double protok;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;
}
