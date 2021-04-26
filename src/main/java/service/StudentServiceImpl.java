package service;

import datos.StudentDao;
import domain.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author JONATAN
 */
@Stateless
public class StudentServiceImpl implements StudentService,StudentServiceRemote {
    
    @Inject
    private StudentDao studentDao;

    @Override
    public List<Student> listarEstudiantes() {
        return studentDao.findAllStudent();
    }

    @Override
    public Student encontrarEstudiantePorId(Student student) {
        return studentDao.findStudentById(student);
    }

    @Override
    public Student encontrarEstudiantePorDni(Student student) {
        return studentDao.findStudentByDni(student);
    }

    @Override
    public Student encontrarEstudiantePorLegajo(Student student) {
        return studentDao.findStudentByFile(student);
    }

    @Override
    public void agregarEstudiante(Student student) {
        studentDao.insertStudent(student);
    }

    @Override
    public void modificarEstudiante(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public void eliminarEstudiante(Student student) {
        studentDao.deleteStudent(student);
    }
    
}
