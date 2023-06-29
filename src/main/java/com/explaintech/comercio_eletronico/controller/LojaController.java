package com.explaintech.comercio_eletronico.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.explaintech.comercio_eletronico.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String testProduto(Model model) {
				
		
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		
		Produto p1 = new Produto();
		
		p1.setNome("Televisor Samsung 70'");
		p1.setCodigoDeBarras("1234567er2e2");
		p1.setId(122);
		p1.setPreco(6500.00);
		p1.setDescricao("Tv Samsung 8k full hd");
		p1.setCodStatus(false);
		
		
		Produto p2 = new Produto();
		
		p2.setNome("Lava roupa brastemp");
		p2.setCodigoDeBarras("132j31j3321");
		p2.setId(202);
		p2.setPreco(4000.00);
		p2.setDescricao("3 litros");
		p2.setCodStatus(true);
		
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		
		return "Produtos"; // Retorna nome do template.
		
		
	}
	
	@GetMapping("/novo-produto")
	public String novoProduto (Produto produto, Model model) {
		
		
		model.addAttribute("produto", produto);
		return "novo-prod";
		
	}
}
	




