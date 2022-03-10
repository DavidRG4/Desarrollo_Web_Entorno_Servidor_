package org.iesalixar.servidor.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.dto.AsignaturaDTO;
import org.iesalixar.servidor.dto.ProfesorDTO;
import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Departamento;
import org.iesalixar.servidor.model.Profesor;
import org.iesalixar.servidor.repository.DepartamentoRepository;
import org.iesalixar.servidor.services.AsignaturaServiceImpl;
import org.iesalixar.servidor.services.DepartamentoServiceImpl;
import org.iesalixar.servidor.services.ProfesorServiceImpl;
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
	DepartamentoServiceImpl departamentoServiceImpl;

	@Autowired
	AsignaturaServiceImpl asignaturaService;

	@Autowired
	ProfesorServiceImpl profesorService;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("contenido", "INICIO");
		return "index";
	}

	@RequestMapping("/profesores")
	public String profesores(Model model) {

		List<Profesor> profesores = profesorService.getAllProfesores();

		model.addAttribute("contenido", "PRODUCTOS");
		model.addAttribute("profesores", profesores);
		return "profesores";
	}

	@RequestMapping("profesores/asignaturas")
	public String asignaturas(@RequestParam(required = false, name = "codigo") String codigo, Model model) {
		if (codigo == null) {
			return "redirect:/profesores/";
		}

		Optional<Profesor> profesor = profesorService.findProfesorById(Long.parseLong(codigo));
		model.addAttribute("profesor", profesor.get());
		return "asignaturas";
	}

	@GetMapping("/profesores/addProfesor")
	public String addGet(Model model) {
		List<Departamento> departamentos = departamentoServiceImpl.getAllDepartamentos();
		ProfesorDTO profDTO = new ProfesorDTO();
		model.addAttribute("departamentos", departamentos);
		model.addAttribute("profesor", profDTO);
		return "addProfesor";
	}

	@PostMapping("/profesores/addProfesor")
	public String addPost(@ModelAttribute ProfesorDTO profesor) {

		Profesor profDB = new Profesor();
		profDB.setNombre(profesor.getNombre());
		profDB.setId(profesor.getID());
		profDB.setNif(profesor.getNIF());
		profDB.setApellido1(profesor.getAppellido1());
		profDB.setCiudad(profesor.getCiudad());
		profDB.setDireccion(profesor.getDireccion());
		profDB.setFecha_nacimiento(profesor.getFecha_nacimiento());
		profDB.setSexo(profesor.getSexo());
		
		Optional<Departamento> departamento = departamentoServiceImpl
				.findDepartamentoById(profesor.getId_departamento());
		profDB.setDepartamento(departamento.get());
		profDB = profesorService.insertProfesores(profDB);

		if (profDB == null) {
			return "redirect:/profesores/addProfesor";
		}

		return "redirect:/profesores";

	}

	@GetMapping("/profesores/addAsignatura")
	public String addasignaturaGet(Model model) {
		List<Asignatura> asignaturas = asignaturaService.getAllAsignaturas();
		List<Profesor> profesors = profesorService.getAllProfesores();
		AsignaturaDTO asigDTO = new AsignaturaDTO();

		model.addAttribute("profesores", profesors);
		model.addAttribute("asignaturas", asignaturas);
		model.addAttribute("asignaturasProfesores", asigDTO);
		return "addasignatura";
	}

	@PostMapping("/profesores/addAsignatura")
	public String addasignaturaPost(@ModelAttribute AsignaturaDTO asignaturaDTO) {
		Asignatura asigDB = new Asignatura();
		Optional<Asignatura> asigantura = asignaturaService.findAsignaturaById(asignaturaDTO.getIDAsignatura());
		Optional<Profesor> profesor = profesorService.findProfesorById(asignaturaDTO.getIDProfesor());

		asigDB = asigantura.get();
		asigDB.setProfesor(profesor.get());
		asigDB = asignaturaService.insertAsignatura(asigDB);

		if (asigDB == null) {
			return "redirect:/profesores/addasignatura";
		}

		return "redirect:/profesores";

	}

	@RequestMapping("/services")
	public String services(Model model) {
		model.addAttribute("contenido", "SERVICIOS");
		return "services";
	}

}
