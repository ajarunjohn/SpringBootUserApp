package com.webapp.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {

		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String rawPassword = "12345";
		System.out.println(bCryptPasswordEncoder.encode(rawPassword));
		
	}

}
