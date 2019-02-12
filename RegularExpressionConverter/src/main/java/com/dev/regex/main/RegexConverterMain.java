package com.dev.regex.main;

import com.dev.regex.service.RegExService;

public class RegexConverterMain {
	public static void main(String[] args) {
		RegExService regExService = new RegExService();
		regExService.regExProcess("vinay.duddilla@gmail.com");
		regExService.regExProcess("HelloWorld");
		regExService.regExProcess("Iam123");
		regExService.regExProcess("8481592567");
		regExService.regExProcess("Hello World 123");
		regExService.regExProcess("https://www.google.com");
	}

}
