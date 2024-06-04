package co.develhope.Esercizio_Hibernate.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Enrollments")
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Students student;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Classes classEntity;
}
