package service;

import dao.IDao;
import model.Odontologo;

import java.util.List;
import java.util.logging.Logger;

public class OdontologoService {

    // Logger para registrar mensajes
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(OdontologoService.class));

    // Referencia al DAO que maneja las operaciones de los odontólogos
    private IDao<Odontologo> odontologoIDao;


    // Getter and Setter
    public IDao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    // Metodos
    public Odontologo registrarOdontologo(Odontologo odontologo) {
        LOGGER.info("Registrando Ondontologo: " + odontologo);
        return odontologoIDao.registrar(odontologo);
    }

    public List<Odontologo> listarOdontologos() {
        LOGGER.info("Listar Ondontologos");
        return odontologoIDao.listar();
    }
}
