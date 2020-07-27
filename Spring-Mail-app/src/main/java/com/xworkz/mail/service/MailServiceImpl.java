package com.xworkz.mail.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.xworkz.mail.dto.MailDTO;

@Service
public class MailServiceImpl implements MailService {
	
	private static final Logger logger=Logger.getLogger(MailServiceImpl.class);

	@Autowired
	public MailSender mailSender;
	
	public MailServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public boolean sendMail(MailDTO mailDto) {
		try {
			logger.info("Inside sendMail method");
			SimpleMailMessage simpleMessage=new SimpleMailMessage();
			simpleMessage.setTo(mailDto.getEmailId());
			simpleMessage.setSubject(mailDto.getSubject());
			simpleMessage.setText(mailDto.getBody());
			
			mailSender.send(simpleMessage);
		} catch (MailException me) {
			logger.error(me.getMessage(), me);
		}
		return false;
	}

}
