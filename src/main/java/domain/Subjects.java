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
    @NamedQuery(name = "Subjects.findAll", query = "SELECT a FROM Subjects a"),
    @NamedQuery(name = "Subjects.findByIdSubjects", query = "SELECT a FROM Subjects a WHERE a.idSubjects = :idSubjects"),
    @NamedQuery(name = "Subjects.findByName", query = "SELECT a FROM Subjects a WHERE a.name = :name"),
    @NamedQuery(name = "Subjects.findByDescription", query = "SELECT a FROM Subjects a WHERE a.description = :description"),
    @NamedQuery(name = "Subjects.findByProfessor", query = "SELECT a FROM Subjects a WHERE a.professor = :professor"),
    @NamedQuery(name = "Subjects.findBySchedule", query = "SELECT a FROM Subjects a WHERE a.schedule = :schedule"),
    @NamedQuery(name = "Subjects.findByEnrolled", query = "SELECT a FROM Subjects a WHERE a.enrolled = :enrolled"),
    @NamedQuery(name = "Subjects.findByQuota", query = "SELECT a FROM Subjects a WHERE a.quota = :quota")})

@Table(name="subjects")
public class Subjects implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idSubjects")
    private int idSubjects;
    private String name;
    private String description;
    private String schedule;
    private String professor;
    private String enrolled;
    private int quota;
    
    public Subjects(){
        
    }
    public Subjects(String name,String description,String schedule,String professor,int quota,String enrolled ){
        this.name=name;
        this.description=description;
        this.schedule=schedule;
        this.professor=professor;
        this.quota=quota;
        this.enrolled=enrolled;
    }
    
    

    public int getIdSubjects() {
        return idSubjects;
    }

    public void setIdSubjects(int idSubjects) {
        this.idSubjects = idSubjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(String enrolled) {
        this.enrolled = enrolled;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "Subjects{" + "idSubjects=" + idSubjects + ", name=" + name + ", description=" + description + ", schedule=" + schedule + ", professor=" + professor + ", enrolled=" + enrolled + ", quota=" + quota + '}';
    }
    
    
    
    

    
    
}
