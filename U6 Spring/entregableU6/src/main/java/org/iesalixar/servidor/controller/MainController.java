package org.iesalixar.servidor.controller;

import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.dto.AsignaturaDTO;
import org.iesalixar.servidor.dto.GradoDTO;
import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.services.AsignaturaServiceImpl;
import org.iesalixar.servidor.services.GradoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@Autowired
	GradoServiceImpl gradoService;
	
	@Autowired
	AsignaturaServiceImpl asignaturaService;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("contenido","INICIO");
		return "index";
	}
	
	
	@RequestMapping("/grados")
	public String grados(Model model) {
		
		List<Grado> grados = gradoService.getAllGrados();
		
		model.addAttribute("contenido","PRODUCTOS");
		model.addAttribute("grados",grados);
		return "grados";
	}
	
	@RequestMapping("grados/asignatura")
	public String asignaturas(@RequestParam(required=false,name="codigo") String codigo,Model model) {
		if (codigo==null) {
			return "redirect:/grados/";
		}
		Optional<Asignatura> asignatura = asignaturaService.findAsignaturaById(Long.parseLong(codigo));
		model.addAttribute("asignatura",asignatura.get());				
		return "asignatura";		
	}
	
	
	
	
	@GetMapping("/grados/addGrado")
	public String addGet(Model model) {
		
		GradoDTO gradDTO = new GradoDTO();		
		model.addAttribute("grado", gradDTO);		
		return "addGrado";
	}
	
	@PostMapping("/grados/addGrado")
	public String addPost(@ModelAttribute GradoDTO grado) {
		
		Grado gradDB = new Grado();
		gradDB.setNombre(grado.getNombre());
		gradDB = gradoService.insertGrado(gradDB);

		if (gradDB==null) {
			return "redirect:/grados/addGrado";
		}
		
		return "redirect:/grados";
		
	}
	
	
	@GetMapping("/grados/addasignatura")
	public String addasignaturaGet(Model model) {
		AsignaturaDTO asgDTO = new AsignaturaDTO();		
		model.addAttribute("asignatura", asgDTO);		
		return "addasignatura";
	}
	
	@PostMapping("/grados/addasignatura")
	public String addasignaturaPost(@ModelAttribute AsignaturaDTO asignaturaDTO) {
		
		Asignatura asgBD = new Asignatura();
		asgBD.setNombre(asignaturaDTO.getNombre());
		asgBD.setCreditos(asignaturaDTO.getCreditos());
		asgBD.setTipo(asignaturaDTO.getTipo());
		asgBD.setCurso(asignaturaDTO.getCurso());
		asgBD.setCuatrimestre(asignaturaDTO.getCuatrimestre());

		asgBD = asignaturaService.insertAsignatura(asgBD);

		if (asgBD==null) {
			return "redirect:/grados/addasignatura";
		}
		
		return "redirect:/grados";
		
	}
	
	
	@RequestMapping("/services")
	public String services(Model model)  {
		model.addAttribute("contenido","SERVICIOS");
		return "services";
	}
	
	
	
}
