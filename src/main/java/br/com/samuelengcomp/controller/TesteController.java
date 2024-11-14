package br.com.samuelengcomp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dash")
public class TesteController {

	
	@GetMapping("/teste")
	public String hello() {
		
		int a = 20; 
		int b = 25;
		int soma = a + b;
		
		
		return "Iniciando projeto " + soma;
	}
	
}
