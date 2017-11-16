package com.isem.mvc.service;

import java.io.File;
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

import com.isem.mvc.model.Objekat;
import com.isem.mvc.model.ObjekatDokument;
 
@Service
public class StorageService {

	
	@Autowired
	ObjekatService objekatService;
	
	@Autowired
	ObjekatDokumentService objekatDokumentService;
	
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	private final Log logger = LogFactory.getLog(this.getClass());
	private final Path rootLocation = Paths.get("upload-dir");
	
 
	public void store(MultipartFile file, Long tip, Long id) {
		try {
			logger.info("upload service!!!");			
						
			Objekat o = objekatService.findById(id);
			
			if (tip == 1){
			
				if (o.getSlikaNaziv() != null){
			
					delete(rootLocation.resolve(o.getSlikaNaziv()).toString());
					
				}
				
				String ekstenzija = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
	
				Files.copy(file.getInputStream(), this.rootLocation.resolve(id+ekstenzija));
				
				o.setSlikaNaziv(id+ekstenzija);
				objekatService.save(o);	
				
			} else if (tip == 2){
				
				String naziv = file.getOriginalFilename();
				Files.copy(file.getInputStream(), this.rootLocation.resolve(naziv));
				
				ObjekatDokument od = new ObjekatDokument();
				od.setDokument(naziv);
				od.setObjekat(o);
				
				objekatDokumentService.save(od);
				
			}
			
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
	
	public void delete(String filename) {
				
		
		try{
			File file = new File(filename);	
			
    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}

    	} catch(Exception e){

    		e.printStackTrace();

    	}

	}
 
	public void init() {
		try {
			Files.createDirectory(rootLocation);
		} catch (IOException e) {
			throw new RuntimeException("Could not initialize storage!");
		}
	}	

}