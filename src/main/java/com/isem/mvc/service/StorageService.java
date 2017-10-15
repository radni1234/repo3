package com.isem.mvc.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import com.isem.mvc.controller.ObjekatController;
import com.isem.mvc.model.Objekat;
 
@Service
public class StorageService {
	@Autowired
	ObjekatController objekatController;
	
	@Autowired
	ObjekatService objekatService;
	
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	private final Log logger = LogFactory.getLog(this.getClass());
	private final Path rootLocation = Paths.get("upload-dir");
	
 
	public void store(MultipartFile file, Long id) {
		try {
			
			logger.info("upload service!!!");
			logger.info(file.getOriginalFilename());
			logger.info(file.getContentType());
			logger.info("1."+file.getContentType());
			logger.info(file.getOriginalFilename().indexOf("."));
			logger.info(file.getOriginalFilename().substring(file.getOriginalFilename().indexOf(".")));
	

//			Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
			Files.copy(file.getInputStream(), this.rootLocation.resolve(id+file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."))));
			
			snimiNazivSlike(id, file.getOriginalFilename().substring(file.getOriginalFilename().indexOf(".")));
			
			
		} catch (Exception e) {
			throw new RuntimeException("FAIL!");
		}
	}
 
	public Resource loadFile(String filename) {
		try {
			Path file = rootLocation.resolve(filename);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new RuntimeException("FAIL!");
			}
		} catch (MalformedURLException e) {
			throw new RuntimeException("FAIL!");
		}
	}
 
	public void deleteAll() {
		FileSystemUtils.deleteRecursively(rootLocation.toFile());
	}
 
	public void init() {
		try {
			Files.createDirectory(rootLocation);
		} catch (IOException e) {
			throw new RuntimeException("Could not initialize storage!");
		}
	}
	
	private void snimiNazivSlike(Long id, String naziv){
		Objekat o = objekatService.findById(id);
		o.setSlikaNaziv(id+naziv);
		objekatService.save(o);	
	}
}