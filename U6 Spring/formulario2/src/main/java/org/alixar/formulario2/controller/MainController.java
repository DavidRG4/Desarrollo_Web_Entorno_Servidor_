package org.alixar.formulario2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.alixar.formulario2.DTO.personasDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	@GetMapping("/form")
	public String complexForm(Model model) {
		
		List<String> grupos= new ArrayList<>();
		grupos.add("grupo1");
		grupos.add("grupo2");
		grupos.add("grupo3");
		grupos.add("grupo4");
		grupos.add("grupo5");

		
		model.addAttribute("grupos", grupos);
		model.addAttribute("form", new personasDTO());

		return "/formulario";

	}

	@PostMapping("/form")
	public String complexFormPost(@ModelAttribute personasDTO form, Model model) {

		model.addAttribute("form", form);
		return "/formulario";

	}

}