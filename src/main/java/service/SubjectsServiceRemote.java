package service;

import domain.Subjects;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author JONATAN
 */
@Remote
public interface SubjectsServiceRemote {
    public List<Subjects> listarMaterias();
    public Subjects encontrarMateriasPorId(Subjects subjects);
    public Subjects encontrarMateriasPorNombre(Subjects subjects);
    public Subjects encontrarMateriasPorDescripcion(Subjects subjects);
    public Subjects encontrarMateriasPorHorario(Subjects subjects);
    public Subjects encontrarMateriasPorProfesor(Subjects subjects);
    public Subjects encontrarMateriasPorCupo(Subjects subjects);
    public Subjects encontrarMateriasPorInscriptos(Subjects subjects);
    public void agregarMaterias(Subjects subjects);
    public void modificarMaterias(Subjects subjects);
    public void eliminarMaterias(Subjects subjects);
    
    
}
