package com.xworkz.logger.emailsending.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.logger.emailsending.dto.MailDTO;
import com.xworkz.logger.emailsending.service.MailService;

//@Controller
@Component
@RequestMapping("/")
public class MailController {
	
	private static final Logger logger=Logger.getLogger(MailController.class);
	
	@Autowired
	public MailService mailService;

	public MailController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value="/click.odc")
	public String invokeMail(MailDTO mailDto,Model model) {
		System.out.println("SYSOUT:: Sending mail from controller");
		logger.info("FromMail: " + mailDto.getFrom());
		logger.info("FromTo: " + mailDto.getTo());
		logger.info("Subject: " + mailDto.getSubject());
		logger.info("Body: " + mailDto.getBody());

		model.addAttribute("message", "Mail has been sent successfully...");
		try {
			logger.info("Logger:: invoked sendMail from service");
			mailService.sendMail();
		} catch (Exception e) {
			logger.error("Exception in invokeMail " + e.getMessage());
		}
		return "success";
	}
}
