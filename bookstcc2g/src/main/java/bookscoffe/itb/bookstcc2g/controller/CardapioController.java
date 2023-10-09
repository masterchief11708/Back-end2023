package bookscoffe.itb.bookstcc2g.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bookscoffe.itb.bookstcc2g.model.Cardapio;
import bookscoffe.itb.bookstcc2g.repository.CardapioRepository;


@Controller
@RequestMapping("/cafeteria/cardapio")
public class CardapioController {

	@Autowired
	private CardapioRepository cardapioRepository;
	
	@GetMapping("/novo-produto")
	String novoProduto(Cardapio cardapio, Model model) {
		
	    model.addAttribute("cardapio",cardapio);
	    return "cardapio1";
	}
	
	// Cadastrar Produto
	
	@PostMapping("/add-cardapio")
	String addNovoCardapio(Cardapio cardapio, Model model) {
		
		cardapio.setCodStatusCardapio(true);
		cardapioRepository.save(cardapio);
		
		return "redirect:/cardapio/cadastro/sucesso";
		
    }
	
	// Abrir formulário de Login
	@GetMapping("/cardapio/sucesso")
	String showPageSucessoCardapio() {
		
		return "sucesso-cardapio";
	}
	
	// Abrir formulário de edição (perfil)
}
