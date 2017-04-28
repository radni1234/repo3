package com.isem.mvc.model.security;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
@Table(name = "AUTHORITY")
public class Authority {

	@Id
    @Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", length = 50)
    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthorityName name;
    
    @Column(name = "KRACI_NAZ", length = 5)
    private String kraciNaz;

    @ManyToMany(mappedBy = "authorities", fetch = FetchType.LAZY)
    private List<User> users;   
    
	
	@Version
    @Column(name = "VERSION", columnDefinition = "int(11) default 0")
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthorityName getName() {
        return name;
    }

    public void setName(AuthorityName name) {
        this.name = name;
    }    
    
    @JsonIgnore
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

	public String getKraciNaz() {
		return kraciNaz;
	}

	public Integer getVersion() {
		return version;
	}

	public void setKraciNaz(String kraciNaz) {
		this.kraciNaz = kraciNaz;
	}
    
    
}