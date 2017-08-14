package com.isem.mvc.controller;

    import java.io.BufferedOutputStream;
    import java.io.File;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.util.Iterator;

    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestMethod;
    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.multipart.MultipartFile;
    import org.springframework.web.multipart.MultipartHttpServletRequest;

    
    @CrossOrigin(origins = "*")
    @RestController
    public class FileUploadController {

      @RequestMapping(value = "/upload", method = RequestMethod.POST)
      public void UploadFile(MultipartHttpServletRequest request) throws IOException {

    	  System.out.println(request.toString());
    	System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
        Iterator<String> itr = request.getFileNames();
        itr.next();
        System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        
        System.out.println(itr.toString());
        
        MultipartFile file = request.getFile(itr.next());
        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        String fileName = file.getOriginalFilename();
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        File dir = new File("C:\\Directory1");
        if (dir.isDirectory()) {
          File serverFile = new File(dir, fileName);
          BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
          stream.write(file.getBytes());
          stream.close();
        }
      }
    }
