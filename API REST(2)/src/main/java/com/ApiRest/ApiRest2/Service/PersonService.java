package com.ApiRest.ApiRest2.Service;

import com.ApiRest.ApiRest2.Persona.Person;
import com.ApiRest.ApiRest2.Repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private PersonRepository personRepository;

    public void createPerson(Person person) {
        personRepository.save(person);

    }
}
