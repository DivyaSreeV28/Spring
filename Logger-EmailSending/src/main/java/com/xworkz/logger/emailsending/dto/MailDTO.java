package com.xworkz.logger.emailsending.dto;

public class MailDTO {

	private String from;
	private String to;
	private String subject;
	private String body;
	
	public MailDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
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

	public MailDTO(String from, String to, String subject, String body) {
		super();
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.body = body;
	}

	@Override
	public String toString() {
		return "MailDTO [from=" + from + ", to=" + to + ", subject=" + subject + ", body=" + body + "]";
	}

	
}
