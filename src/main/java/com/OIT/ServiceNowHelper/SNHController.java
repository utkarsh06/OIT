package com.OIT.ServiceNowHelper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
	
@Controller
public class SNHController {

	@GetMapping(path = "/helper")
	public String help(Model model) {
		
		Fields field = new Fields();
		model.addAttribute(field);
		System.out.println("this is done");
		return "helper";
	}
	
	
	@PostMapping(path = "/helper")
	public String helped(){
		return "helper";
	}

}
