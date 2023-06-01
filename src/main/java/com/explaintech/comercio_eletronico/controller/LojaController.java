package com.explaintech.comercio_eletronico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/Produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String testProduto() {
		System.out.println("Lista de produtos");
		
		return "Produtos"; // Retorna nome do template
		
	}
	



}
