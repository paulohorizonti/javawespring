package br.com.precisomtx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriaProdutoController {
	
	@GetMapping("/categoriasprodutos")
	public String index() {
		return "categoriasprodutos/index";
	}

}
