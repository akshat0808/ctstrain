package comm.example.spring.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import comm.example.spring.model.Cd;

@Controller
@RequestMapping("/cd")

public class CdController {
	
	
	@RequestMapping(method = RequestMethod.GET,path = "/showForm")
	public String showFormForAdd()
	{
		return "add-cd";
	}
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("title") String title,
			@RequestParam("type") String type,
			@RequestParam("date") String date,Model theModel)
	{
		
		Cd cd=new Cd(title, type, date);
		theModel.addAttribute("cd",cd);
		
		return "success";
	}

}
