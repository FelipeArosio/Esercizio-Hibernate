package co.develhope.Esercizio_Hibernate.controllers;

import co.develhope.Esercizio_Hibernate.entities.Classes;
import co.develhope.Esercizio_Hibernate.repositories.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    private ClassesRepository classesRepository;

    @GetMapping
    public List<Classes> getAllClasses() {
        return classesRepository.findAll();
    }

    @PostMapping
    public Classes createClass(@RequestBody Classes classEntity) {
        return classesRepository.save(classEntity);
    }


}

