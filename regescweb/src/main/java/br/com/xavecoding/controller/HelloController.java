package br.com.xavecoding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController 
{
	@GetMapping("/hello")
	public String hello()
	{
		//vai renderizar o arquivo que esta em templates, com o nome de hello.html
		return "hello";
		
		
	}
	

}
