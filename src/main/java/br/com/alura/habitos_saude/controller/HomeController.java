package br.com.alura.habitos_saude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("titulo", "Hábitos de Saúde");
		model.addAttribute("mensagem", "Setup do Dia 1 concluído: Spring Boot + Thymeleaf + H2 funcionando!");
		return "index";
	}

}
