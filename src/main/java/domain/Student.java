package domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author JONATAN
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByIdStudent", query = "SELECT s FROM Student s WHERE s.idstudent = :idstudent"),
    @NamedQuery(name = "Student.findByDni", query = "SELECT s FROM Student s WHERE s.dni = :dni"),
    @NamedQuery(name = "Student.findByFile", query = "SELECT s FROM Student s WHERE s.file = :file")})


@Table(name="student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idstudent")
    private int idstudent;
    private String dni;
    private String file;
    
    public Student(){
        
    }
    public Student(String dni,String file){
        this.dni=dni;
        this.file=file;
    }

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Student{" + "idstudent=" + idstudent + ", dni=" + dni + ", file=" + file + '}';
    }
    
    
    
    
}




