package com.demo.CrudEjemplo.service;

import java.util.ArrayList;
import java.util.Optional;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.CrudEjemplo.model.SuperHero;
import com.demo.CrudEjemplo.repository.SuperHeroRepository;

@Service
public class SuperHeroServiceImpl implements SuperHeroService {
	
	@Autowired
	SuperHeroRepository superHeroRepository;

	
	public ArrayList<SuperHero> getAllUser() {
		return (ArrayList<SuperHero>) superHeroRepository.findAll();
	}
	
	public Optional<SuperHero> getUserById(long id) {
		return superHeroRepository.findById(id);
	}
	
	
	public SuperHero saveUser(SuperHero s) {
		return superHeroRepository.save(s);
	}

	public boolean deleteUserById(long id) {
		
		try {
			Optional<SuperHero> s = getUserById(id);
			superHeroRepository.delete(s.get());
			return true;
		}catch(Exception e) {
			return false;
	}
	}

	public ArrayList<SuperHero> queryByvalue(SuperHero s) {
		
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
	
	

}
