package com.ApiRest.ApiRest2.Controller;

import com.ApiRest.ApiRest2.Persona.Person;
import com.ApiRest.ApiRest2.Service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Person")
@RequiredArgsConstructor
public class PersonController extends Person {

    private final PersonService personService;

    @PostMapping
    public void createPerson(@RequestBody Person person) {

        personService.createPerson(person);

    }

}
