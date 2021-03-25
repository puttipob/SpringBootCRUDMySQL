package com.example.crud.service;

import java.util.List;

import com.example.crud.model.Student;
import com.example.crud.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;

    //Get All student
    public List<Student> findAll(){
        return studentRepository.findAll(Sort.by("id").ascending());
    }

    // Get Student by ID
    public Student getOne(Integer id){
        return studentRepository.getOne(id);
    }

    // Add / Edit Student
    public Student save(Student std){
        return studentRepository.save(std);
    }

    // Delete Student
    public void delete(Student std){
        studentRepository.delete(std);
    }

    
}
