package com.minhnguyen.blockchain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * there are many cryptographic algorithms you can choose from, however SHA256 fits 
 * just fine for this example. 
 * We can import java.security.MessageDigest; to get access to the SHA256 algorithm.
 * @author Minh Nguyen
 *
 */
public class StringUtil {
	

		//Applies Sha256 to a string and returns the result. 
		public static String applySha256(String input){	
			try {
				MessageDigest digest = MessageDigest.getInstance("SHA-256");
				//Apply sha256 to our input
				byte[] hash = digest.digest(input.getBytes("UTF-8"));
				StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
				for (int i = 0; i < hash.length; i++) {
					String hex = Integer.toHexString(0xff & hash[i]);
					if(hex.length() == 1) hexString.append('0');
					hexString.append(hex);
				}
				return hexString.toString();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return input;	 
		}
		
}
