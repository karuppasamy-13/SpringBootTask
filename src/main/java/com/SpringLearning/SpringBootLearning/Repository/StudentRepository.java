package com.SpringLearning.SpringBootLearning.Repository;

import com.SpringLearning.SpringBootLearning.Model.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDTO, Long> {
}
