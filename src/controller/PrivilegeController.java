package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/privilege")
public class PrivilegeController {
	
	@RequestMapping("/index")
	public String index(){
		return "privilege/index";
	}  
	
	
}
