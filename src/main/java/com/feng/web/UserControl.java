package com.feng.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserControl
{
	@RequestMapping(value="/index.jsp")
	public String test()
	{
		return "login";
	}
}
