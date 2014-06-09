package controller;

import java.io.File;

import javax.annotation.Resource;
import javax.enterprise.inject.New;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import dao.SystemUserDao;

@Controller
@RequestMapping("/main")
public class Main {
	

	private SystemUserDao systemUserDao;
	
	@RequestMapping(value="/upload",method=RequestMethod.GET)
	public String upload(){
		return "main/upload";
	}
	
	@RequestMapping(value="/uploadAction",method=RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file){
		return "main/upload";
	}
	
	@RequestMapping("/test/{userId}")
	public String test(@PathVariable("userId") String userId){
		//System.out.println(systemUserDao.getUsers());
		System.out.println(userId);
		return "main/test";
	}
	@RequestMapping(value="/param",params={"userId"})
	public String param(@RequestParam(value="userId") String userId){
		System.out.println(userId);
		return "main/param";
	}
	
	@RequestMapping("/request")
	public String request(@RequestParam(value="userId",required=false) String userId){
		return "main/request";
	}
}
