package service;

import datos.SubjectsDao;
import domain.Subjects;
import java.util.List;
import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author JONATAN
 */
@Stateless
@DeclareRoles({"ROLE_ADMIN","ROLE_USER"})
@RolesAllowed({"ROLE_ADMIN","ROLE_USER"})
public class SubjectsServiceImpl implements SubjectsService,SubjectsServiceRemote {
    
    @Inject
    private SubjectsDao subjectsDao;
    
    @Resource
    private SessionContext contexto;

    @Override
    public List<Subjects> listarMaterias() {
        return subjectsDao.findAllSubjects();
    }

    @Override
    public Subjects encontrarMateriasPorId(Subjects subjects) {
        return subjectsDao.findSubjectsById(subjects);
    }

    @Override
    public Subjects encontrarMateriasPorNombre(Subjects subjects) {
        return subjectsDao.findSubjectsByName(subjects);
    }

    @Override
    public Subjects encontrarMateriasPorDescripcion(Subjects subjects) {
        return subjectsDao.findSubjectsByDescription(subjects);
    }

    @Override
    public Subjects encontrarMateriasPorHorario(Subjects subjects) {
        return subjectsDao.findSubjectsBySchedule(subjects);
    }

    @Override
    public Subjects encontrarMateriasPorProfesor(Subjects subjects) {
        return subjectsDao.findSubjectsByProfessor(subjects);
    }

    @Override
    public Subjects encontrarMateriasPorCupo(Subjects subjects) {
        return subjectsDao.findSubjectsByQuota(subjects);
    }
    public Subjects encontrarMateriasPorInscriptos(Subjects subjects){
        return subjectsDao.findSubjectsByEnrolled(subjects);
    }

    @Override
    @RolesAllowed("ROLE_ADMIN")
    public void agregarMaterias(Subjects subjects) {
        subjectsDao.insertSubjects(subjects);
    }

    @Override
    @RolesAllowed("ROLE_ADMIN")
    public void modificarMaterias(Subjects subjects) {
        subjectsDao.updateSubjects(subjects);
        
    }

    @Override
    @RolesAllowed("ROLE_ADMIN")
    public void eliminarMaterias(Subjects subjects) {
        subjectsDao.deleteSubjects(subjects);
    }
    
   
    
}
