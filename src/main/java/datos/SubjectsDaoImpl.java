package datos;

import domain.Subjects;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JONATAN
 */
@Stateless
public class SubjectsDaoImpl implements SubjectsDao {
    @PersistenceContext(unitName="sgaPU")
    EntityManager em;

    @Override
    public List<Subjects> findAllSubjects() {
        return em.createNamedQuery("Subjects.findAll").getResultList();
    }

    @Override
    public Subjects findSubjectsById(Subjects subjects) {
        return em.find(Subjects.class,subjects.getIdSubjects());
    }

    @Override
    public Subjects findSubjectsByName(Subjects subjects) {
        return em.find(Subjects.class,subjects.getName());
    }

    @Override
    public Subjects findSubjectsByDescription(Subjects subjects) {
        return em.find(Subjects.class,subjects.getDescription());
    }

    @Override
    public Subjects findSubjectsBySchedule(Subjects subjects) {
        return em.find(Subjects.class,subjects.getSchedule());
    }

    @Override
    public Subjects findSubjectsByProfessor(Subjects subjects) {
        return em.find(Subjects.class,subjects.getProfessor());
    }

    @Override
    public Subjects findSubjectsByQuota(Subjects subjects) {
        return em.find(Subjects.class,subjects.getQuota());
    }
    public Subjects findSubjectsByEnrolled(Subjects subjects){
        return em.find(Subjects.class,subjects.getEnrolled());
    }

    @Override
    public void insertSubjects(Subjects subjects) {
        em.persist(subjects);

    }

    @Override
    public void updateSubjects(Subjects subjects) {
        em.merge(subjects);
    }

    @Override
    public void deleteSubjects(Subjects subjects) {
        em.remove(em.merge(subjects));
    }


    

    
}
