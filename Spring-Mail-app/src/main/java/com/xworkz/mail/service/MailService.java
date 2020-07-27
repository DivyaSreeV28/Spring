package com.xworkz.mail.service;

import com.xworkz.mail.dto.MailDTO;

public interface MailService {

	public boolean sendMail(MailDTO mailDto);
	
}
