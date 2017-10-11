package com.isem.mvc;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isem.mvc.service.StorageService;

@SpringBootApplication
public class IsemApplication {
	@Resource	
	StorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(IsemApplication.class, args);		
	}	

}
