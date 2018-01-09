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

import com.isem.mvc.model.security.User;

@Entity
public class TrendPoslato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "trend_obracunato_id",
    			foreignKey = @ForeignKey(name = "TREND_POSLATO_FK1"))	
    private TrendObracunato trendObracunato;
	
	@ManyToOne
    @JoinColumn(name = "user_id",
    			foreignKey = @ForeignKey(name = "TREND_POSLATO_FK2"))	
    private User user;
	

	@Version
	@Column(name = "VERSION", columnDefinition = "int(11) default 0")
	private Integer version;


	public Long getId() {
		return id;
	}


	public TrendObracunato getTrendObracunato() {
		return trendObracunato;
	}


	public User getUser() {
		return user;
	}


	public Integer getVersion() {
		return version;
	}


	public void setTrendObracunato(TrendObracunato trendObracunato) {
		this.trendObracunato = trendObracunato;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	 
}
