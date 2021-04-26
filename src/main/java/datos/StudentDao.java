package datos;

import domain.Student;
import java.util.List;

/**
 *
 * @author JONATAN
 */
public interface StudentDao {
    public List<Student> findAllStudent();
    public Student findStudentById(Student student);
    public Student findStudentByDni(Student student);
    public Student findStudentByFile(Student student);
    public void insertStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
    
    
}
