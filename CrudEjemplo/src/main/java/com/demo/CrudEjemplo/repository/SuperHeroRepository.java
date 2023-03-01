package com.demo.CrudEjemplo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.CrudEjemplo.model.SuperHero;

@Repository
public interface SuperHeroRepository extends CrudRepository<SuperHero, Long>{

}
