package com.dev.regex.service;

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
		else if(input.matches(getWWWURLRegEx()))
			System.out.println("This is a URL");
		else
			System.out.println("Nothing matched");
	}
	
	public String getEmailRegEx() {
		return "[a-z|0-9]+.[a-z|0-9]*@[a-z]+.[a-z]+";
	}
	
	public String getURLRegEx() {
		return "https?:(a-z0-9\\.)?[a-z0-9]\\.[a-z0-9]";
	}
	
	public String getNormalStringWithAplhabets() {
		return "("+"[a-z|A-Z]"+")"+"+";
	}
	
	public String getNormalStringWithDigits() {
		return "("+"[0-9]"+")"+"+";
	}
	
	public String getNormalStringWithAlphaAndDigits() {
		return "("+"[a-z|A-Z|0-9]"+")"+"+";
	}
	
	public String getNormalString() {
		return "[0-9|a-z|A-Z|"+"\\"+"s]+";
	}
	
	public String getWWWURLRegEx() {
		return "https?://www"+"\\"+"."+"([a-z|0-9])+"+"\\"+"."+"(com|gov|edu)";
	}
}
