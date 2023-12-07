package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mostrar")
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";  	
	}
	
	@GetMapping("/BsmGeneration")
	public String bsmGeneration() {
		return "Persistência;\r\n"
				+ "Mentalidade de Crescimento;\r\n"
				+ "Responsabilidade Pessoal;\r\n"
				+ "Orientação ao Futuro;\r\n"
				+ "Proatividade;\r\n"
				+ "Comunicação;\r\n"
				+ "Trabalho em Equipe;\r\n"
				+ "Orientação ao Detalhe;";  	
	}
	
	@GetMapping("/semana")
	public String semana() {
		return "Meu objetivo é conseguir compreender o conteudo da semana !!";  	
	}
}

