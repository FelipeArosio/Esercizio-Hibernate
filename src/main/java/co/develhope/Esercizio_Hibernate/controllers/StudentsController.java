package co.develhope.Esercizio_Hibernate.controllers;

import co.develhope.Esercizio_Hibernate.entities.Students;
import co.develhope.Esercizio_Hibernate.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsRepository studentsRepository;

    @GetMapping
    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    @PostMapping
    public Students createStudent(@RequestBody Students student) {
        return studentsRepository.save(student);
    }

}

