
package datos;

import domain.Student;
import domain.Subjects;
import domain.Teachers;
import java.util.List;

/**
 *
 * @author JONATAN
 */
public interface TeachersDao {
    public List<Teachers> findAllTeachers();
    public Teachers findTeachersById(Teachers teachers);
    public Teachers findTeachersByName(Teachers teachers);
    public Teachers findTeachersByLastName(Teachers teachers);
    public Teachers findTeachersByDni(Teachers teachers);
    public Teachers findTeachersByActive(Teachers teachers);
    public void insertTeachers(Teachers teachers);
    public void updateTeachers(Teachers teachers);
    public void deleteTeachers(Teachers teachers);
    
    
}
