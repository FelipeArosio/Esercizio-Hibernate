package co.develhope.Esercizio_Hibernate.repositories;

import co.develhope.Esercizio_Hibernate.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {
}

