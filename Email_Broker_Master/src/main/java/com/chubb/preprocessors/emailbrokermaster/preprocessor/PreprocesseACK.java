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

import com.chubb.preprocessors.emailbrokermaster.dao.Encryption;

public class PreprocesseACK {

	 private static final Logger LOG = Logger.getLogger(ResourceLoader.class);
	 final static ResourceLoader resources = ResourceLoader.getResources();
	 final static String AOLPASSWORD=resources.getConstantproperties().getProperty("AOL_PASSWORD"); 
	 
	 public static boolean sendACK(String from,String to,String subject,String text){
		 
				try {

				Properties props = new Properties();

				
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

//				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.auth", "false");
			
				props.put("mail.smtp.host", resources.getConstantproperties().getProperty("hostName"));
				props.put("mail.smtp.socketFactory.port", resources.getConstantproperties().getProperty("portName"));

				Session session = Session.getInstance(props, new javax.mail.Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(from, Encryption.decrypt(AOLPASSWORD, ResourceLoader.getResources().getCipherproperties().getProperty("encryption.cipher")));
//						return new PasswordAuthentication("", "");
					}
				});
				/*ACK fix comand the above session and replace the below session obj*/
//				Session session = Session.getInstance(props);

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
