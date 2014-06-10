package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import common.ExcelView;

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
	
	@RequestMapping("/test")
	@ResponseStatus(reason="错误",value=HttpStatus.NOT_FOUND)
	public String test(){
		//System.out.println(systemUserDao.getUsers());
		return "main/test";
	}
	
	@RequestMapping("/getExcel")
	public String getExcel(ModelMap map){
		String[] headers=new String[3];
		headers[0]="姓名";
		headers[1]="性别";
		headers[2]="年龄";
		List<String[]> contents=new ArrayList<String[]>();
		String[] s1={"mu","1","20"};
		String[] s2={"smell","0","20"};
		contents.add(s1);
		contents.add(s2);
		map.put("head", headers);
		map.put("content", contents);
		map.put("filename", "测试下载");
		return "excelView";
	}
	
	@RequestMapping("/getJson")
	public String getJson(Map map){
		String str="hello world";
		map.put("msg", str);
		return "jsonView";
	}
	
	@RequestMapping("/getEntity")
	public ResponseEntity<String> getEntity(){
		String tr="hello world";
		return new ResponseEntity<String>(tr,HttpStatus.OK);
	}
	
}
