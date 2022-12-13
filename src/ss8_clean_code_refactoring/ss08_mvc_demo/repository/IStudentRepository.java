package ss8_clean_code_refactoring.ss08_mvc_demo.repository;

import ss8_clean_code_refactoring.ss08_mvc_demo.model.Student;

public interface IStudentRepository {
    /*CRUD*/
    Student[] findAll();

    void addStudent(Student student);
}