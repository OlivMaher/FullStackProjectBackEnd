package com.olimah.fullstackproject.service;

import com.olimah.fullstackproject.model.Student;
import java.util.*;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudent();
}
