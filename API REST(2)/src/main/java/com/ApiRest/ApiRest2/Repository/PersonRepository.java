package com.ApiRest.ApiRest2.Repository;

import com.ApiRest.ApiRest2.Persona.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Integer>  {




}
