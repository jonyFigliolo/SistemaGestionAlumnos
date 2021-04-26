package service;

import domain.Teachers;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author JONATAN
 */
@Remote
public interface TeachersServiceRemote {
    public List<Teachers> listarProfesores();
    public Teachers encontrarProfesoresPorId(Teachers teachers);
    public Teachers encontrarProfesoresPorNombre(Teachers teachers);
    public Teachers encontrarProfesoresPorApellido(Teachers teachers);
    public Teachers encontrarProfesoresPorDni(Teachers teachers);
    public Teachers encontrarProfesoresPorActivo(Teachers teachers);
    public void agregarProfesores(Teachers teachers);
    public void modificarProfesores(Teachers teachers);
    public void eliminarProfesores(Teachers teachers);
    
    
}
