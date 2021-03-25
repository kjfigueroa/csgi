package com.csgi.proyecto.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.csgi.proyecto.modelo.Empleado;
import com.csgi.proyecto.service.EmpleadoService;

/*
 * Metodos para el departamento
import com.csgi.proyecto.service.DepartamentoService;
import com.csgi.proyecto.modelo.Departamento;
*/

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private EmpleadoService service;
	
	@GetMapping("/mostrar")
	public String mostrar(Model model) {
		List<Empleado>empleados=service.mostrar();
		model.addAttribute("empleados", empleados);
		return "index";
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("persona", new Empleado());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Empleado e, Model model) {
		service.save(e);
		return "redirect:/mostrar";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model) {
		Optional<Empleado>persona=service.mostrarId(id);
		model.addAttribute("persona", persona);
		return "form";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/mostrar";
	}
}
	
	/*
	 * Codigo para combinar los metodos de lectura y escritura para ambas entidades
	 * 
	 * 
	 * 	@Autowired
	private EmpleadoService service;
	@Autowired
	private DepartamentoService service_d;
	
	@GetMapping("/mostrar")
	public String mostrar(Model model) {
		List<Empleado>empleados=service.mostrar();
		List<Departamento>departamento=service_d.mostrar();
		model.addAttribute("empleados", empleados);
		model.addAttribute("departamento", departamento);
		return "index";
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("persona", new Empleado());
		model.addAttribute("departamento", new Departamento());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Empleado e, @Validated Departamento d, Model model) {
		service.save(e);
		service_d.save(d);
		return "redirect:/mostrar";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model) {
		Optional<Empleado>persona=service.mostrarId(id);
		Optional<Departamento>departamento=service_d.mostrarId(id);
		model.addAttribute("persona", persona);
		model.addAttribute("departamento", departamento);
		return "form";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/mostrar";
	}
	 */