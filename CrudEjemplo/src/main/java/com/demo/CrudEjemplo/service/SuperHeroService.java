package com.demo.CrudEjemplo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.demo.CrudEjemplo.model.SuperHero;

public interface SuperHeroService {

	ArrayList<SuperHero> getAllUser();
	Optional<SuperHero> getUserById(long id);
	SuperHero saveUser(SuperHero s);
	ArrayList<SuperHero> queryByvalue(SuperHero s);
	boolean deleteUserById(long id);
}
