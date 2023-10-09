package bookscoffe.itb.bookstcc2g.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bookscoffe.itb.bookstcc2g.model.Usuario;
import bookscoffe.itb.bookstcc2g.repository.UsuarioRepository;

@Controller
@RequestMapping("/cafeteria/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/novo-usuario")
	String novoUsuario(Usuario usuario, Model model) {
		model.addAttribute("usuario",usuario);
		
		
		return "cadastro_user";
	}
	
	//inserir usuario
	@PostMapping("/add-usuario")
	String addNovouUsuario(Usuario usuario, Model model) {
		
		usuario.setCodStatusUsuario(true);
		Usuario usuarioBd = usuarioRepository.save(usuario);
		return "redirect:/cafeteria/usuario/home";
		
	}

	
	
	@GetMapping("/home")
	String showPageSucessoCadastro(){
		return "home";
	}

	
}
