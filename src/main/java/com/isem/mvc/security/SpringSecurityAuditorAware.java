package com.isem.mvc.security;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SpringSecurityAuditorAware implements AuditorAware<String> {

	  public String getCurrentAuditor() {

	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

	    if (authentication == null || !authentication.isAuthenticated()) {
	      return null;
	    }

	    return ((JwtUser) authentication.getPrincipal()).getUsername();
	  }
	}