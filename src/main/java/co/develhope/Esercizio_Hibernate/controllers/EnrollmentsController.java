package co.develhope.Esercizio_Hibernate.controllers;

import co.develhope.Esercizio_Hibernate.entities.Enrollments;
import co.develhope.Esercizio_Hibernate.repositories.EnrollmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentsController {

    @Autowired
    private EnrollmentsRepository enrollmentsRepository;

    @GetMapping
    public List<Enrollments> getAllEnrollments() {
        return enrollmentsRepository.findAll();
    }

    @PostMapping
    public Enrollments createEnrollment(@RequestBody Enrollments enrollment) {
        return enrollmentsRepository.save(enrollment);
    }

}

