package com.MarkinKonstantin.LaboratoryWork_6.service;

import com.MarkinKonstantin.LaboratoryWork_6.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    ResponseEntity<Student> saveStudent(Student student);

    ResponseEntity<Student>  getStudent(int id);

    ResponseEntity<Student> deleteStudent(int id);
}
