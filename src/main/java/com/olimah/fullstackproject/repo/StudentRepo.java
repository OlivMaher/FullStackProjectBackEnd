package com.olimah.fullstackproject.repo;

import com.olimah.fullstackproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
