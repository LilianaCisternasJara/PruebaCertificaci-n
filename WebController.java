package cl.aiep.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.aiep.prueba.services.CursoService;

@Controller
public class WebController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("")
	public String getPaginaInicio(Model model)
	{
		model.addAttribute("cursos", cursoService.listar());
		return "paginainicio";
	}
	
	@PostMapping("")
	public String postInicio()
	{
		return "cursos";
	}
	
	@GetMapping("/curso")
	public String getCursos()
	{
		return "cursos";
	}
	
	@PostMapping("/adm")
	public String postCursos(@RequestParam("username") String username,
			@RequestParam("password") String password,
			Model modelo)
	{
		return "administradores";
	}
	@GetMapping("/login")
	public String getLogin()
	{
		return "login";
	}
	
	@GetMapping("/administradores")
	public String getAdm()
	{
		return "administradores";
	}
	
	
	
	@GetMapping("/form1")
	public String getFormulario1()
	{
		return "formulario1";
	}
	
	@PostMapping("/f1")
	public String postFormulario()
	{
		return "";
	}
	
	@GetMapping("/form2")
	public String getFormulario2()
	{
		return "formulario2";
	}
	
	@GetMapping("/form3")
	public String getFormulario3()
	{
		return "formulario3";
	}
	
	@GetMapping("/creacioncurso")
	public String getCreacion()
	{
		return "administradores";
	}
	
	
	@GetMapping("/detalle")
	public String getDetalle()
	{
		return "detalles";
	}
	
	@GetMapping("/registrarme")
	public String getRegistro()
	{
		return "registro";
	}
}