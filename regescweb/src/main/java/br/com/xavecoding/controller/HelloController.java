package br.com.xavecoding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController 
{
	@GetMapping("/hello-servlet")
	public String hello(HttpServletRequest request)
	{
		//usando o request para passar valores para tela view
		request.setAttribute("nome", "Zezinho");
		
		//vai renderizar o arquivo que esta em templates, com o nome de hello.html
		return "hello";
		
		
	}
	
	@GetMapping("/hello-model")
	public String hello(Model model)
	{
		//usando o request para passar valores para tela view
		model.addAttribute("nome", "Samuka");
		
		//vai renderizar o arquivo que esta em templates, com o nome de hello.html
		return "hello";
		
		
	}
	
	@GetMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView mv = new ModelAndView("hello");
		//usando o request para passar valores para tela view
		mv.addObject("nome", "Maria");
		
		//vai renderizar o arquivo que esta em templates, com o nome de hello.html
		return mv;
		
		
	}
	

}
