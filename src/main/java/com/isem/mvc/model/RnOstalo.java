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
public class RnOstalo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "RN_ID",
            foreignKey = @ForeignKey(name = "RN_OSTALO_FK1")
    )
	private Rn rn;

	@ManyToOne
    @JoinColumn(name = "BROJILO_VRSTA_KOLONE_ID",
            foreignKey = @ForeignKey(name = "RN_OSTALO_FK2")
    )
	private BrojiloVrstaKolone brojiloVrstaKolone;
	
	@Column(name = "VREDNOST", columnDefinition = "numeric(18,2)")
	private String vrednost;

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;
}
