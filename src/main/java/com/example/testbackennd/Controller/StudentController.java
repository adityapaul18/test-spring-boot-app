package com.example.testbackennd.Controller;

import com.example.testbackennd.Entity.Student;
import com.example.testbackennd.Service.StudentService;
import com.mongodb.internal.Iterables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/vi/student")
public class StudentController {

    @Autowired
    private StudentService StudentService;
    @PostMapping(value="/save")
    private String saveStudent(@RequestBody Student students){

        StudentService.saveorUpdate(students);
        return students.get_id();
    }

    @GetMapping(value="/getall")
    public Iterable<Student> getStudents(){
        return StudentService.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Student update(@RequestBody Student student, @PathVariable(name="id")String _id){
        student.set_id(_id);
        StudentService.saveorUpdate(student);
        return student;
    }

    @DeleteMapping(value="/delete/{id}")
    private void update(@PathVariable(name="id")String _id){
        StudentService.deleteStudent(_id);
    }

    @RequestMapping(value="/search/{id}")
    private Student getStudent(@PathVariable(name="id")String studentid){
        return StudentService.getStudentById(studentid);
    }


}
