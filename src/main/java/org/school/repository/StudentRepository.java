package org.school.repository;

import org.school.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can define custom queries here, if needed
}

