package com.SpringLearning.SpringBootLearning.Repository;

import com.SpringLearning.SpringBootLearning.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}


