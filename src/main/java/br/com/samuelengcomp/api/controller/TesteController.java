package br.com.samuelengcomp.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuelengcomp.domain.entities.Origem;

@RestController
@RequestMapping("/dash")
public class TesteController {
	
	@GetMapping("/teste")
	public void hello() {
		
		var a = Origem.INTERNACIONAL; 
		var b = Origem.NACIONAL;
		
		System.out.println("Origem a: " + a.getDescricao());
		
		System.out.println("Origem b: " + b);
		
	}

}
