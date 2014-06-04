package controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

@Controller
@RequestMapping("/main")
public class Main {
	
	@RequestMapping(value="/upload",method=RequestMethod.GET)
	public String upload(){
		return "main/upload";
	}
	
	@RequestMapping(value="/uploadAction",method=RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file){
		return "main/upload";
	}
}
