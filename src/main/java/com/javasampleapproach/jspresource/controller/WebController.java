package com.javasampleapproach.jspresource.controller;

import com.javasampleapproach.jspresource.*;

import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebController {

	@RequestMapping("/")
	ModelAndView home(ModelAndView modelAndView) {
		
		modelAndView.setViewName("home");
		modelAndView.getModel().put("name", "♡ hello world");

		return modelAndView;
	}

	@RestController
	public class CallbackController {
		@RequestMapping("/test")
		public Callback test(){
			Callback callback = new Callback();
			callback.setErrono(0);
			callback.setInfo("OK");
			return callback;
		}
	}
}
	

