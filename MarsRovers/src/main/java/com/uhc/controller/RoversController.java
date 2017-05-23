package com.uhc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.uhc.model.Rover;
import com.uhc.service.RoverService;

@Controller
@RequestMapping("/") //Definindo o "/" antes de todo mapping
public class RoversController {
	
	
	@Autowired
	private RoverService roverService;
	
	/*
	 * Mapping para index
	 */
	@GetMapping
	public ModelAndView novo(Rover rover){
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject(rover);
		
		return mv;
	}
	
	/*
	 * Mapping para quando formulário for submetido.
	 * Chama o service para calcular as coordenadas
	 */
	@PostMapping
	public ModelAndView calcular(Rover rover, BindingResult result, RedirectAttributes attributes){
		
		roverService.calcular(rover);
		attributes.addFlashAttribute("mensagem", "Rover calculado com sucesso!");
		return new ModelAndView("redirect:/");
	}

}