package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Personagem;
import com.PI.Honkai.StarRail.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PersonagemController {
    @Autowired
    private final PersonagemService ps = null;
    
    @GetMapping("/index") 
    public String listaPersonagens(Model model) { 
        model.addAttribute("listaPersonagens", ps.listarTodosPersonagens()); 
        return "index"; 
    }
    
    @GetMapping("/tierList") 
    public String listaTiers(Model model) { 
        model.addAttribute("listaPersonagens", ps.listarTodosPersonagens()); 
        return "tierList"; 
    }
    
    @GetMapping("/personagemPg/{id}") 
    public String listaPersonagem(@PathVariable(value = "id") Integer id, Model model) { 
        Personagem p = ps.getPersonagemId(id);
        model.addAttribute("personagem", p); 
        return "personagemPg"; 
    }
}
