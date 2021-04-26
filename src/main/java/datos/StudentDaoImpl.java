package datos;

import domain.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JONATAN
 */
@Stateless
public class StudentDaoImpl implements StudentDao {
    
    @PersistenceContext(unitName="sgaPU")
    EntityManager em;

    @Override
    public List<Student> findAllStudent() {
        return em.createNamedQuery("Student.findAll").getResultList();
    }

    @Override
    public Student findStudentById(Student student) {
        return em.find(Student.class, student.getIdstudent());
    }

    @Override
    public Student findStudentByDni(Student student) {
        return em.find(Student.class, student.getDni());
    }

    @Override
    public Student findStudentByFile(Student student) {
        return em.find(Student.class,student.getFile());
    }

    @Override
    public void insertStudent(Student student) {
        em.persist(student);
    }

    @Override
    public void updateStudent(Student student) {
        em.merge(student);
    }

    @Override
    public void deleteStudent(Student student) {
        em.remove(em.merge(student));
    }
    
    
}
