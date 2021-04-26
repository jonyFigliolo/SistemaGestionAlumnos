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
    @NamedQuery(name = "Teachers.findAll", query = "SELECT t FROM Teachers t"),
    @NamedQuery(name = "Teachers.findByIdTeachers", query = "SELECT t FROM Teachers t WHERE t.idTeachers = :idTeachers"),
    @NamedQuery(name = "Teachers.findByName", query = "SELECT t FROM Teachers t WHERE t.name = :name"),
    @NamedQuery(name = "Teachers.findByLastName", query = "SELECT t FROM Teachers t WHERE t.lastName = :lastName"),
    @NamedQuery(name = "Teachers.findByDni", query = "SELECT t FROM Teachers t WHERE t.dni = :dni"),
    @NamedQuery(name = "Teachers.findByActive", query = "SELECT t FROM Teachers t WHERE t.active = :active")})

@Table(name="teachers")
public class Teachers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idTeachers")
    private int idTeachers;
    private String name;
    private String lastName;
    private String dni;
    private String active;
    
    public Teachers(){
        
    }
    
    public Teachers(String name,String lasName,String dni,String active){
        this.name=name;
        this.lastName=lastName;
        this.dni=dni;
        this.active=active;
    }

    public int getIdTeachers() {
        return idTeachers;
    }

    public void setIdTeachers(int idTeachers) {
        this.idTeachers = idTeachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Teachers{" + "idTeachers=" + idTeachers + ", name=" + name + ", lastName=" + lastName + ", dni=" + dni + ", active=" + active + '}';
    }
    
    
    
    
}
