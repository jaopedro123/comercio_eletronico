package com.explaintech.comercio_eletronico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.explaintech.comercio_eletronico.model.Produto;

@Controller
@RequestMapping("/comercio/Produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String testProduto() {
		System.out.println("Lista de produtos");
		
		Produto produto = new Produto();
		
		produto.setNome("Televisor Samsung 70'");
		produto.setCodigoDeBarras("1234567er2e2");
		produto.setId("122");
		produto.setPreco("1500.00");
		
		
		
		return "Produtos"; // Retorna nome do template
		
	}
	



}
