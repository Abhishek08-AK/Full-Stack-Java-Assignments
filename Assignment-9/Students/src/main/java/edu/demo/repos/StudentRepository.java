package edu.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.demo.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
