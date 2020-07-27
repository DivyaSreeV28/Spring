package com.xworkz.mail.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.mail.dto.MailDTO;
import com.xworkz.mail.service.MailService;

@Controller
public class MailController {

	private static final Logger logger=Logger.getLogger(MailController.class);
	
	@Autowired
	public MailService mailService;
	
	public MailController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value="/send.odc",method=RequestMethod.POST)
	public String sendMail(MailDTO mailDto,Model model) {
		logger.info("Inside sendMail controller");
		boolean status=mailService.sendMail(mailDto);
		model.addAttribute("email", "Sent mail to: "+mailDto.getEmailId());
		return "success";
	}
}
