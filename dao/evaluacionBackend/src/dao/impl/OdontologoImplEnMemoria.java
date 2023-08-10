package dao.impl;

import dao.IDao;
import model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoImplEnMemoria implements IDao<Odontologo> {

    private static final Logger LOGGER = Logger.getLogger(OdontologoImplEnMemoria.class);
    private int contadorId = 1;



    private ArrayList<Odontologo> odontologosEnMemoria = new ArrayList<>();

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        odontologo.setId(contadorId++);
        odontologosEnMemoria.add(odontologo);
        LOGGER.info("Odontologo con ID: " + odontologo.getId() + " ha sido registrado en memoria.");
        return odontologo;
    }

    @Override
    public List<Odontologo> listar() {
        LOGGER.info("Listando todos los odontólogos en memoria. Total de odontólogos: " + odontologosEnMemoria.size());
        return odontologosEnMemoria;
    }
}
