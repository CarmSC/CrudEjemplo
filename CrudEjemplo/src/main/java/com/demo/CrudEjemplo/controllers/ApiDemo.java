package com.demo.CrudEjemplo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.CrudEjemplo.model.SuperHero;
import com.demo.CrudEjemplo.service.SuperHeroService;


@RestController
@RequestMapping("api")
public class ApiDemo {
	
	@Autowired
	SuperHeroService superHeroService;
	
    @GetMapping("/saludar")
    public String saludar(){ return "Hola mundo desde spring"; }
    
    //CONSULTAR TODOS LOS SUPER HEROES
    @GetMapping("/personajes")
    public ArrayList<SuperHero> getAllUser() {
		return superHeroService.getAllUser();
	}

    //CONSULTAR SUPER HEROE POR ID
	@GetMapping("/personaje/{id}")
	public Optional<SuperHero> getUserById(@PathVariable("id") long id) {
		return superHeroService.getUserById(id);
	}
    
    //MODIFICAR SUPER HEROE
    @RequestMapping(value ="/save", method = RequestMethod.POST)
	public SuperHero saveUser(@RequestBody SuperHero s) {
		return superHeroService.saveUser(s);
	}
    
    //Consultar todos los súper héroes que contienen "man"
    
    @GetMapping(value ="/show")
    public ArrayList<SuperHero> queryByvalue(@RequestBody SuperHero s) {
    		
    		ArrayList<SuperHero> superNew = new ArrayList<SuperHero>();

    		if(s.getName().contains("man")) {
    			
    			SuperHero superObj = new SuperHero(null);
    			superObj.setName(s.getName());
    			superNew.add(superObj);
    		}else {
    			return null;
    	}
    		return superNew;
	}
    
    //ELIMINAR UN SUPER HEROE POR ID
    @DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable("id") long id) {
    	
    	if(superHeroService.deleteUserById(id))
    		return "Se ha eliminado el usuario";
    	else 
    		return "No se ha eliminado el usuario";
    
	}
}
    

