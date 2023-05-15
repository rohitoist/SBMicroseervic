package io.jackfrost.student.service;

import io.jackfrost.student.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<StudentEntity> getAllStudents(){
        List<StudentEntity> students = new ArrayList<>();
        StudentEntity student1 = StudentEntity.builder().department("Science").studentId(1).studentName("Athos").build();
        StudentEntity student2 = StudentEntity.builder().studentName("Porthos").studentId(2).department("Commerce").build();
        StudentEntity student3 = StudentEntity.builder().department("Arts").studentId(3).studentName("Aramis").build();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return students;
    }
}
