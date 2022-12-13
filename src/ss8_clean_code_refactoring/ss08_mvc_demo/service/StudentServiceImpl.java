package ss8_clean_code_refactoring.ss08_mvc_demo.service;

import ss8_clean_code_refactoring.ss08_mvc_demo.model.Student;
import ss8_clean_code_refactoring.ss08_mvc_demo.repository.IStudentRepository;
import ss8_clean_code_refactoring.ss08_mvc_demo.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements IStudentService{

    private IStudentRepository repository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }
}