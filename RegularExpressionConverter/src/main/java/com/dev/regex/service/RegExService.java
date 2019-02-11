package com.dev.regex.service;

import com.dev.regex.constants.RegExConstants;

public class RegExService {
	
	public void regExProcess(String input) {
		
		if(input.matches(getEmailRegEx()))
			System.out.println("this is an e-mail");
		else if(input.matches(getURLRegEx()))
			System.out.println("This is a URL");
		else if(input.matches(getNormalStringWithAplhabets()))
			System.out.println("This is a String with only alphabets");
		else if(input.matches(getNormalStringWithDigits()))
			System.out.println("This is a String with only digits");
		else if(input.matches(getNormalStringWithAlphaAndDigits()))
			System.out.println("This is a normal string with digits and numbers");
		else if(input.matches(getNormalString()))
			System.out.println("This is a String containing spaces!!");
		else
			System.out.println("Nothing matched");
	}
	
	public String getEmailRegEx() {
		String regEx = "[a-z|0-9]+.[a-z|0-9]*@[a-z]+.[a-z]+";
		return regEx;
	}
	
	public String getURLRegEx() {
		String regEx = "https?:(a-z0-9\\.)?[a-z0-9]\\.[a-z0-9]";
		return regEx;
	}
	
	public String getNormalStringWithAplhabets() {
		String regEx = "("+"[a-z|A-Z]"+")"+"+";
		return regEx;
	}
	
	public String getNormalStringWithDigits() {
		String regEx = "("+"[0-9]"+")"+"+";
		return regEx;
	}
	
	public String getNormalStringWithAlphaAndDigits() {
		String regEx = "("+"[a-z|A-Z|0-9]"+")"+"+";
		return regEx;
	}
	
	public String getNormalString() {
		String regEx = "[0-9|a-z|A-Z|"+"\\"+"s]+";
		return regEx;
	}
}
