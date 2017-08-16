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
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.servlet.mvc.support.RedirectAttributes;
    
    @CrossOrigin(origins = "*")
    @RestController
    public class FileUploadController {
    	
    	@RequestMapping(value = "/upload", method = RequestMethod.POST)
        public String handleFileUpload(@RequestParam("uploadFile") MultipartFile file,
                RedirectAttributes redirectAttributes) {

     //       storageService.store(file);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded " + file.getOriginalFilename() + "!");

            return "redirect:/";
        }

//      @RequestMapping(value = "/upload", method = RequestMethod.POST)
//      public void UploadFile(MultipartHttpServletRequest request) throws IOException {
//
//    	 
//    	System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
//        Iterator<String> itr = request.getFileNames();
//        
//        System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
//        
//        
//        if(itr.hasNext()){
//        	System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
//        	MultipartFile file = request.getFile(itr.next());
//        	String fileName = file.getOriginalFilename();
//        	File dir = new File("C:\\Directory1");
//            if (dir.isDirectory()) {
//              File serverFile = new File(dir, fileName);
//              BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
//              stream.write(file.getBytes());
//              stream.close();
//            }
//        }
//        
//        
//        
//        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
//        
//      }
    }
