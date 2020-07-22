package com.xworkz.logger.emailsending.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
	
	private static final Logger logger=Logger.getLogger(MailServiceImpl.class);

	public MailServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public void sendMail() {
		try {
			System.out.println("Invoked sendMail method");
			logger.info("Logger:: inside seandMail");
		}catch (Exception e) {
			logger.error("Exception in MailServiceImpl "+e.getMessage());
		}
	}

}
