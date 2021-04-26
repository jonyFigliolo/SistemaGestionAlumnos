package service;

import domain.Student;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author JONATAN
 */
@Local
public interface StudentService {
    public List<Student> listarEstudiantes();
    public Student encontrarEstudiantePorId(Student student);
    public Student encontrarEstudiantePorDni(Student student);
    public Student encontrarEstudiantePorLegajo(Student student);
    public void agregarEstudiante(Student student);
    public void modificarEstudiante(Student student);
    public void eliminarEstudiante(Student student);
    
    
}
