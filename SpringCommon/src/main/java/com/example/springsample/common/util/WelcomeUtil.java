package com.example.springsample.common.util;

import org.springframework.stereotype.Component;

@Component
public class WelcomeUtil {

	public String print() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from WelcomeUtil **********</div><br><br>";

		return message;
	}
}
