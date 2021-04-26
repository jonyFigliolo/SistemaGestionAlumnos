package web;

import datos.SubjectsDao;
import domain.Subjects;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;
import service.SubjectsService;

@Named("subjectsBean")
@RequestScoped
public class SubjectsBean {
    
    
    @Inject
    private SubjectsService subjectsService;
    @Inject
    private SubjectsDao subjectsDao;
    

    private Subjects subjectsSeleccionada;
    
    List<Subjects> subjects;
    
    
    public SubjectsBean(){
    }
    
    @PostConstruct
    public void inicializar(){
        //Inciamos las variables
        this.subjects = subjectsService.listarMaterias();
        this.subjectsSeleccionada = new Subjects();
    }
    
    public void editListener(RowEditEvent event){
        Subjects subject=(Subjects) event.getObject();
        subjectsService.modificarMaterias(subject);
    }
    
      public Subjects getSubjectsSeleccionada() {
        return subjectsSeleccionada;
    }

    public void setSubjectsSeleccionada(Subjects subjectsSeleccionada) {
        this.subjectsSeleccionada = subjectsSeleccionada;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }
    
    public void agregarMaterias(){
        this.subjectsService.agregarMaterias(subjectsSeleccionada);
        this.subjects.add(subjectsSeleccionada);
        this.subjectsSeleccionada = null;
    }
    
    public void eliminarMaterias(){
        this.subjectsService.eliminarMaterias(subjectsSeleccionada);
        this.subjects.remove(this.subjectsSeleccionada);
        this.subjectsSeleccionada = null;
    }
    
    public void reiniciarSubjectsSeleccionada(){
        this.subjectsSeleccionada = new Subjects();
    }
    
    public void inscribirse(){
        this.subjectsDao.insertSubjects(subjectsSeleccionada);
        this.subjects.add(subjectsSeleccionada);
        this.subjectsSeleccionada = null;
    }
   
        
        
        
    
    
}
