package com.dzeru.springchat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class IndexController
{
	@GetMapping("/")
	public String index(Principal principal)
	{
		if(principal != null)
		{
			return "redirect:/rooms";
		}
		return "index";
	}
}
