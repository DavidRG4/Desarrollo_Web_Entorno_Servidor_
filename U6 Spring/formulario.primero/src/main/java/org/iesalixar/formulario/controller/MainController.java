package org.iesalixar.formulario.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.iesalixar.formulario.DTO.formularioDTO;
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
		
		List<String> curso= new ArrayList<>();
		List<String> asignents= new ArrayList<>();
		asignents.add("DIW");
		asignents.add("EMP");
		asignents.add("DWES");
		asignents.add("DWEC");
		
		curso.add("DAW1");
		curso.add("DAW2");
		model.addAttribute("cursos", curso);
		model.addAttribute("asignent", asignents);
		model.addAttribute("form", new formularioDTO());

		return "/formulario";

	}

	@PostMapping("/form")
	public String complexFormPost(@ModelAttribute formularioDTO form, Model model) {

		model.addAttribute("form", form);
		return "/formulario";

	}

}
