package com.isem.mvc.izvestaj;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;


	@NamedStoredProcedureQuery(
	        name="izv_voz_uk_pot_ene",
	        procedureName="izv_voz_uk_pot_ene",
	        resultClasses = { VozUkPotEne.class },
	        parameters={
	            @StoredProcedureParameter(name="i_voz_id", type=String.class, mode=ParameterMode.IN),
	            @StoredProcedureParameter(name="i_ene_id", type=String.class, mode=ParameterMode.IN),
	            @StoredProcedureParameter(name="i_datum_od", type=Date.class, mode=ParameterMode.IN),
	            @StoredProcedureParameter(name="i_datum_do", type=Date.class, mode=ParameterMode.IN)
	        }
	)

	public class VozUkPotEne {
		private String grupa;
		private String energent;	
		private String vozilo;
		private Double kolicina;
		private Double kolicinaKwh;
		private Double emisijaCo2;
		private Double iznos;
		
		public VozUkPotEne(String grupa, String energent, String vozilo,
				Double kolicina, Double kolicinaKwh, Double emisijaCo2, Double iznos) {
			super();
			this.grupa = grupa;
			this.energent = energent;
			this.vozilo = vozilo;
			this.kolicina = kolicina;
			this.kolicinaKwh = kolicinaKwh;
			this.emisijaCo2 = emisijaCo2;
			this.iznos = iznos;
		}

		public String getGrupa() {
			return grupa;
		}

		public String getEnergent() {
			return energent;
		}

		public String getVozilo() {
			return vozilo;
		}

		public Double getKolicina() {
			return kolicina;
		}

		public Double getKolicinaKwh() {
			return kolicinaKwh;
		}

		public Double getEmisijaCo2() {
			return emisijaCo2;
		}

		public Double getIznos() {
			return iznos;
		}
		
		
}
