package servicio;

import dao.IDao;
import modelo.Estudiante;

import java.util.List;

public class EstudianteService {

    // Attribute
    private IDao<Estudiante> estudianteIDao;


    // Getter and Setter
    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }



    // Methodos que implementa Service
    // delegar la responsabilidad de metodos al DAO
    public Estudiante guardarEstudiante(Estudiante e) {

        return estudianteIDao.guardar(e);
    }

    public void eliminarEstudiante(Long id) {
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id) {
        return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos() {
        return estudianteIDao.buscarTodos();
    }
}
