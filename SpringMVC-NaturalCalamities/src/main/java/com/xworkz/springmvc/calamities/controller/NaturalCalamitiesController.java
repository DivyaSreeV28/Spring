package com.xworkz.springmvc.calamities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.springmvc.calamities.dto.NaturalCalamitiesDTO;
import com.xworkz.springmvc.calamities.service.NaturalCalamitiesService;

@Component
@RequestMapping("/")
public class NaturalCalamitiesController {
	
	@Autowired
	private NaturalCalamitiesService naturalCalamitiesService;

	public NaturalCalamitiesController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value="/register.odc",method = RequestMethod.POST)
	public String register(NaturalCalamitiesDTO dto, Model model) {
		System.out.println("Invoked register");
		System.out.println(dto);
		
		int isValid=this.naturalCalamitiesService.validateAndSave(dto);
		if(isValid==0) {
			model.addAttribute("place", "Place of calamity: "+dto.getPlace());
			model.addAttribute("date", "Date of calamity: "+dto.getDate());
			model.addAttribute("type", "Type of calamity: "+dto.getTypes());
			model.addAttribute("area", "Area of calamity: "+dto.getArea());
			model.addAttribute("loss", "Average Loss due to calamity: "+dto.getLoss());
			model.addAttribute("deaths", "Number of Deaths due to calamity: "+dto.getDeaths());
			model.addAttribute("injured", "Number of Injured due to calamity: "+dto.getInjured());
			model.addAttribute("name", "Name of calamity Captured By: "+dto.getName());
			System.out.println("Directing to succes.jsp");
			return "success";
		}
		else {
			System.out.println("Data not valid");
			model.addAttribute("Error", "Please check which field is not valid and enter valid data");
			return "index";
		}
		
	}

}