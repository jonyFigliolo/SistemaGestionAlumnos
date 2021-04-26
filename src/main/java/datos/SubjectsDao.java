package datos;



import domain.Subjects;
import java.util.List;

/**
 *
 * @author JONATAN
 */
public interface SubjectsDao {
    public List<Subjects> findAllSubjects();
    public Subjects findSubjectsById(Subjects subjects);
    public Subjects findSubjectsByName(Subjects subjects);
    public Subjects findSubjectsByDescription(Subjects subjects);
    public Subjects findSubjectsBySchedule(Subjects subjects);
    public Subjects findSubjectsByProfessor(Subjects subjects);
    public Subjects findSubjectsByQuota(Subjects subjects);
    public Subjects findSubjectsByEnrolled(Subjects subjects);
    public void insertSubjects(Subjects subjects);
    public void updateSubjects(Subjects subjects);
    public void deleteSubjects(Subjects subjects);
    
    
    
}
