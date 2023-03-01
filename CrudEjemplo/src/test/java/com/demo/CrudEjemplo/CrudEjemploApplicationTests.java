package com.demo.CrudEjemplo;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.CrudEjemplo.model.SuperHero;
import com.demo.CrudEjemplo.repository.SuperHeroRepository;

@SpringBootTest
class CrudEjemploApplicationTests {
	
	@Mock
	SuperHeroRepository superHeroRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public ArrayList<SuperHero> getAllUser() {
		ArrayList<SuperHero> listSH = new ArrayList<SuperHero>();
		SuperHero sh= new SuperHero(null);
		sh.setId(1L);
		sh.setName("Spiderman");
		listSH.add(sh);
		return listSH;
		
}
	
	@Test
	public SuperHero saveUser(SuperHero s) {
		
		SuperHero sh= new SuperHero(null);
		sh.setId(1L);
		sh.setName("Spiderman");
	
		return sh;
	}

	@Test
	public ArrayList<SuperHero> queryByvalue(SuperHero s) {
		
		ArrayList<SuperHero> superNew = new ArrayList<SuperHero>();
		
			SuperHero superObj = new SuperHero(null);
			superObj.setName(s.getName());
			superNew.add(superObj);
			
			return superNew;
	}
	

}
