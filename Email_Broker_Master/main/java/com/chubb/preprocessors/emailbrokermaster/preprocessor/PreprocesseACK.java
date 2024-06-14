package com.chubb.preprocessors.emailbrokermaster.preprocessor;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

public class PreprocesseACK {

	 private static final Logger LOG = Logger.getLogger(ResourceLoader.class);
	 final static ResourceLoader resources = ResourceLoader.getResources();
	 
	 public static boolean sendACK(String from,String to,String subject,String text){
		 
				try {

				Properties props = new Properties();

				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

				props.put("mail.smtp.auth", "false");

				props.put("mail.smtp.host", resources.getConstantproperties().getProperty("hostName"));
				props.put("mail.smtp.socketFactory.port", resources.getConstantproperties().getProperty("portName"));

				Session session = Session.getInstance(props, new javax.mail.Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("", "");
					}
				});

				Message message = new MimeMessage(session);
					
					message.setFrom(new InternetAddress(from));
					message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
					message.setSubject(subject);
					message.setText(text);
					Transport.send(message);
					

					} catch (MessagingException e) {
						LOG.error(e);
						return false;
						
					}

		 
		 return true;
	 }
	
	
}
