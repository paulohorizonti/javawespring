package br.com.xavecoding.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.xavecoding.models.Professor;
import br.com.xavecoding.models.StatusProfessor;
import ch.qos.logback.core.util.StatusPrinter;

@Controller
public class ProfessorController {
	
	@GetMapping("/professores")
	public ModelAndView index() {
		
		Professor batman = new Professor("Batman",new BigDecimal(5000.00), StatusProfessor.ATIVO);
		batman.setId(1l);
		Professor coringa = new Professor("Coringa",new BigDecimal(15000.00), StatusProfessor.AFASTADO);
		coringa.setId(2l);
		Professor mulherMaravilha = new Professor("Mulher Maravilha",new BigDecimal(10000.00), StatusProfessor.APOSENTADO);
		mulherMaravilha.setId(3l);
		
		List<Professor> professores = Arrays.asList(batman, coringa, mulherMaravilha);
		
		ModelAndView mv = new ModelAndView("professores/index");
		mv.addObject("professores",professores);
		return mv;
	}

}
