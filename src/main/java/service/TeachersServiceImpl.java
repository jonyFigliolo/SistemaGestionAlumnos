package service;

import datos.TeachersDao;
import domain.Teachers;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author JONATAN
 */
@Stateless
public class TeachersServiceImpl implements TeachersService,TeachersServiceRemote {
    @Inject
    private TeachersDao teachersDao;

    @Override
    public List<Teachers> listarProfesores() {
        return teachersDao.findAllTeachers();
    }

    @Override
    public Teachers encontrarProfesoresPorId(Teachers teachers) {
        return teachersDao.findTeachersById(teachers);
    }

    @Override
    public Teachers encontrarProfesoresPorNombre(Teachers teachers) {
        return teachersDao.findTeachersByName(teachers);
    }

    @Override
    public Teachers encontrarProfesoresPorApellido(Teachers teachers) {
        return teachersDao.findTeachersByLastName(teachers);
    }

    @Override
    public Teachers encontrarProfesoresPorDni(Teachers teachers) {
        return teachersDao.findTeachersByDni(teachers);
    }

    @Override
    public Teachers encontrarProfesoresPorActivo(Teachers teachers) {
        return teachersDao.findTeachersByActive(teachers);
    }

    @Override
    public void agregarProfesores(Teachers teachers) {
        teachersDao.insertTeachers(teachers);
    }

    @Override
    public void modificarProfesores(Teachers teachers) {
        teachersDao.updateTeachers(teachers);
    }

    @Override
    public void eliminarProfesores(Teachers teachers) {
        teachersDao.deleteTeachers(teachers);
    }
    
}
