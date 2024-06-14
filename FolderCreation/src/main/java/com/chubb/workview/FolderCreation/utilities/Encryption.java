package com.chubb.workview.FolderCreation.utilities;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

public class Encryption {
	private static SecretKeySpec secretKey;
	private static byte[] key;
	private static String aes = "AES/ECB/PKCS5Padding";
	private static String secretKeySpec = "AES";
	private static String encoding = "UTF-8";
	private static String sha = "SHA-1";

	private static final Logger LOGGER = Logger.getLogger(Encryption.class);

	Encryption() {
	}

	public static void setKey(String myKey) {

		MessageDigest sha1 = null;
		try {
			key = myKey.getBytes(encoding);
			sha1 = MessageDigest.getInstance(sha);
			key = sha1.digest(key);
			key = Arrays.copyOf(key, 16);
			secretKey = new SecretKeySpec(key, secretKeySpec);

		} catch (NoSuchAlgorithmException nsa) {
			LOGGER.info(nsa);
		} catch (UnsupportedEncodingException e) {
			LOGGER.info(e);
		}

	}

	/**
	 * This method is used to decrypt the parameter
	 * 
	 * @param strToEncrypt
	 * @return String
	 */
	public static String decrypt(String strToDecrypt, String passPhrase) {
		try {
			Encryption.setKey(passPhrase);
			Cipher cipher = Cipher.getInstance(aes);

			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			return new String(cipher.doFinal(Base64.decodeBase64(strToDecrypt)));

		} catch (Exception e) {
			LOGGER.info("Error while decrypting: " + e);
			return null;
		}
	}

}
