package com;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import javax.xml.soap.MessageFactory;

import javax.xml.soap.MimeHeaders;

import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;

import javax.xml.soap.SOAPMessage;

public class Soap_Client {

	public static void main(String[] args) throws Exception {

		try {

			// SSL
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };

			HostnameVerifier hv = new HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					System.out.println("Warning: URL Host: " + urlHostName + " vs. " + session.getPeerHost());
					return true;
				}
			};

			SSLContext sc = SSLContext.getInstance("TLSV1.2");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());

			HttpsURLConnection.setDefaultHostnameVerifier(hv);
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// create message factory
			MessageFactory mf = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
			// headers for a SOAP message
			MimeHeaders header = new MimeHeaders();
			header.addHeader("Content-Type", "application/soap+xml");

			String request = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:ns=\"http://chubb.com/Workview/DocumentService/2016/06\" xmlns:ns1=\"http://chubb.com/WorkView/DocumentService/2016/06\" xmlns:wsa=\"http://www.w3.org/2005/08/addressing\" >"
					+ "                  <soap:Header> <wsa:Action>http://chubb.com/Workview/DocumentService/2016/06/DocumentService/ImportDocumentToFile</wsa:Action> "
					+ "                  	<wsa:To>https://eugbd-wweb0012.aceins.com:6300/WorkView/DocumentService/DocumentService.svc</wsa:To>"
					+ "                  </soap:Header>" + "                           <soap:Body>"
					+ "                           <ns:ImportDocumentToFile>"
					+ "									<ns:request>"
					+ "    								<ns1:FileNumber>KRPOLICY3256</ns1:FileNumber> "
					+ "    								<ns1:FileTypeCode>26</ns1:FileTypeCode>                                                           "
					+ "    								<ns1:FolderTypeCode>33</ns1:FolderTypeCode>                                               "
					+ "    								<ns1:DocumentTypeCode>33</ns1:DocumentTypeCode>                                   "
					+ "    								<ns1:DocumentProducer>KORAH</ns1:DocumentProducer>                           "
					+ "    								<ns1:UnderwriterYear>2016</ns1:UnderwriterYear>                                                        "
					+ "    								<ns1:DocumentData>RnJvbToJU2hhbm11Z2FtLCBBcnVubg0KU2VudDoJMTEgSmFudWFyeSAyMDE2IDExOjA5DQpUbzoJU2hhbm11Z2FtLCBBcnVubg0KU3ViamVjdDoJRlc6IGVtbCB0ZXN0DQpBdHRhY2htZW50czoJUGluZ0ZlZGVyYXRlX1NUU19NaWNyb3NvZnRfSW50ZXJvcGVyYWJpbGl0eS5wZGY7IEFTUEFDIFNJVCAtIERlcGxveW1lbnQgDQpTY2hlZHVsZSAtIDAxLzExDQoNCg0KDQpGcm9tOiBTaGFubXVnYW0sIEFydW5uICANClNlbnQ6IDExIEphbnVhcnkgMjAxNiAxMDo1MyANClRvOiBTaGFubXVnYW0sIEFydW5uIA0KU3ViamVjdDogZW1sIHRlc3QNCg0KDQo=</ns1:DocumentData>                                                          "
					+ "    								<ns1:UnderwriterYear>2016</ns1:UnderwriterYear>                                                        "
					+ "    								<ns1:DocumentDescription>test document</ns1:DocumentDescription>                                                        "
					+ "    								<ns1:DocumentFileName>test.txt</ns1:DocumentFileName>                                                        "
					+ "    								<ns1:DocumentInformation>test document</ns1:DocumentInformation>                                                        "
					+ "    								<ns1:EmailSender>KORAH</ns1:EmailSender>                                                        "
					+ "    								<ns1:BranchCode>1</ns1:BranchCode>                                                        "
					+ "    								<ns1:Pages>1</ns1:Pages>                                                        "
					+ "    								<ns1:EnvironmentData>                                                        "
					+ "    								<ns1:MessageGUID>410ffc85-fb7d-4d09-b49a-00227c98d3e1</ns1:MessageGUID>                                                        "
					+ "    								<ns1:CountryCode>EG</ns1:CountryCode>                                                        "
					+ "    								<ns1:SourceSystem>KORAH</ns1:SourceSystem>                                                        "
					+ "    								<ns1:WorkViewLogonID>KRCLUW</ns1:WorkViewLogonID>                                                        "
					+ "    								<ns1:WorkViewEnvironment>DEV</ns1:WorkViewEnvironment>                                                        "
					+ "    								</ns1:EnvironmentData>                                                        "
					+ "									</ns:request>                                                                       "
					+ "								</ns:ImportDocumentToFile>                                                                 "
					+ "										</soap:Body>                                                                       "
					+ "				</soap:Envelope>                                                                       ";

			InputStream is = new ByteArrayInputStream(request.getBytes());
			System.out.println("Request:"+request);
			// FileInputStream fis = new
			// FileInputStream("e://KORAH_DocumentRequest.xml");
			// create the SOAPMessage
			SOAPMessage soapMessage = mf.createMessage(header, is);

			URL requestURL = new URL(
					"https://eugbd-wweb0012.aceins.com:6300/WorkView/DocumentService/DocumentService.svc?wsdl");
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory.createConnection();
			SOAPMessage responseMessage = soapConnection.call(soapMessage, requestURL);

			responseMessage.writeTo(System.out);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}
}
