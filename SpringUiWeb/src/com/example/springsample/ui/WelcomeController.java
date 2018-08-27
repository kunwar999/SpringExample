
package com.example.springsample.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springsample.common.util.WelcomeUtil;

/*
 * author: Crunchify.com
 * 
 */

@Controller
public class WelcomeController {

	private WelcomeUtil welcomeUtil;

	public void setWelcomeUtil(WelcomeUtil welcomeUtil) {
		this.welcomeUtil = welcomeUtil;
	}

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		return new ModelAndView("welcome", "message", this.welcomeUtil.print());
	}

	@RequestMapping("/jsf")
	public ModelAndView helloJsf() {

		return new ModelAndView("redirect:jsf/hello.xhtml");
	}
}