import dao.impl.EstudianteDAOH2;
import modelo.Estudiante;
import servicio.EstudianteService;

public class Main {
    public static void main(String[] args) {


        Estudiante estudiante = new Estudiante(1L, "Lucas", "Custodio");

        EstudianteService estudianteService = new EstudianteService();

        // Seteamos una estrategia de persistencia, es decir un DAO
        estudianteService.setEstudianteIDao(new EstudianteDAOH2());


        estudianteService.guardarEstudiante(estudiante);
        estudianteService.eliminarEstudiante(1L);

    }
}