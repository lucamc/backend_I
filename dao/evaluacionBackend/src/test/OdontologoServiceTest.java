package test;

import dao.impl.OdontologoImplEnMemoria;
import dao.impl.OdontologoImplH2;
import model.Odontologo;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {


    // Registrar odontólogos en la base de datos H2 y luego listarlos.
    @Test
    public void testRegistrarOdontologoEListarEnH2() {

        // Creación de instancia de servicio de odontólogos
        OdontologoService odontologoService = new OdontologoService();

        // Establecer la implementación de H2 para el DAO
        odontologoService.setOdontologoIDao(new OdontologoImplH2());

        // Registrar odontólogos
        odontologoService.registrarOdontologo(new Odontologo("M10","Lucas","Custodio"));
        odontologoService.registrarOdontologo(new Odontologo("M30","Juan","Sosa"));

        // Listar odontólogos registrados
        List<Odontologo> odontologosRegistrados = odontologoService.listarOdontologos();

        assertEquals(odontologosRegistrados.size(), 2);

    }

    // Registrar odontólogos en memoria y luego listarlos.
    @Test
    public void testRegistrarOdontologosEListarEnMemoria() {

        // Creación de instancia de servicio de odontólogos
        OdontologoService odontologoService = new OdontologoService();

        // Establecer la implementación en memoria para el DAO
        odontologoService.setOdontologoIDao(new OdontologoImplEnMemoria());

        // Registrar odontólogos
        odontologoService.registrarOdontologo(new Odontologo("M10","Lucas","Custodio"));
        odontologoService.registrarOdontologo(new Odontologo("M30","Juan","Sosa"));

        assertEquals(2, odontologoService.listarOdontologos().size());
    }

}