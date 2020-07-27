package com.xworkz.mail.dto;

public class MailDTO {
	
	private String emailId;
	private String subject;
	private String body;

	public MailDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "MailDTO [emailId=" + emailId + ", subject=" + subject + ", body=" + body + "]";
	}

	
}
