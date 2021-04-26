package datos;

import domain.Teachers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JONATAN
 */
@Stateless
public class TeachersDaoImpl implements TeachersDao {
    
    @PersistenceContext(unitName="sgaPU")
    EntityManager em;

    @Override
    public List<Teachers> findAllTeachers() {
        return em.createNamedQuery("Teachers.findAll").getResultList();
    }

    @Override
    public Teachers findTeachersById(Teachers teachers) {
        return em.find(Teachers.class,teachers.getIdTeachers());
    }

    @Override
    public Teachers findTeachersByName(Teachers teachers) {
        return em.find(Teachers.class, teachers.getLastName());
    }

    @Override
    public Teachers findTeachersByLastName(Teachers teachers) {
        return em.find(Teachers.class,teachers.getLastName());
    }

    @Override
    public Teachers findTeachersByDni(Teachers teachers) {
        return em.find(Teachers.class,teachers.getDni());
    }

    @Override
    public Teachers findTeachersByActive(Teachers teachers) {
        return em.find(Teachers.class,teachers.getActive());
    }

    @Override
    public void insertTeachers(Teachers teachers) {
        em.persist(teachers);
    }

    @Override
    public void updateTeachers(Teachers teachers) {
        em.merge(teachers);

    }

    @Override
    public void deleteTeachers(Teachers teachers) {
        em.remove(em.merge(teachers));
    }

    
}
