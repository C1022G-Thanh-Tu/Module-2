package ss8_clean_code_refactoring.ss08_mvc_demo.service;

import ss8_clean_code_refactoring.ss08_mvc_demo.model.Student;

public interface IStudentService {
    /*CRUD*/
    Student[] findAll();

    void addStudent(Student student);

    /*Validation*/

}