package dao.impl;

import dao.IDao;
import model.Odontologo;
import service.OdontologoService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class OdontologoImplH2 implements IDao<Odontologo> {

    // Logger para registrar mensajes
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(OdontologoImplH2.class));

    // Configuración de conexión a la base de datos
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_JDBC_URL = "jdbc:h2:~/db_odontologos;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_JDBC_USER = "sa";
    private final static String DB_JDBC_PASSWORD = "";


    // Consultas SQL
    private final static String SQL_INSERT = "INSERT INTO odontologos (matricula, nombre, apellido) VALUES(?,?,?)";
    private final static String SQL_SELECT_ALL = "SELECT * FROM odontologos;";


    @Override
    public Odontologo registrar(Odontologo odontologo) {
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            // Cargar Driver
            LOGGER.info("Cargar Driver H2");
            Class.forName(DB_JDBC_DRIVER);

            //Establecer Conexión con db
            LOGGER.info("Establecer conexion con DB -> URL:" + DB_JDBC_URL);
            connection = DriverManager.getConnection(DB_JDBC_URL, DB_JDBC_USER, DB_JDBC_PASSWORD);

            // Preparar la consulta SQL para insertar un odontólogo
            pstmt = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, odontologo.getMatricula());
            pstmt.setString(2, odontologo.getNombre());
            pstmt.setString(3, odontologo.getApellido());

            // Ejecutar la consulta
            LOGGER.info("Ejecutando consulta SQL: " + SQL_INSERT);
            pstmt.executeUpdate();

            // Recuperar el ID autogenerado
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                int generatedId = rs.getInt(1);
                odontologo.setId(generatedId);
                LOGGER.info("Odontologo registrado exitosamente con ID: " + generatedId);
            } else {
                LOGGER.warning("No se pudo obtener el ID autogenerado para el odontólogo.");
            }


            pstmt.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return odontologo;
    }


    @Override
    public List<Odontologo> listar() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        List<Odontologo> odontologoList = new ArrayList<>();

        try {
            // Cargar Driver
            Class.forName(DB_JDBC_DRIVER);

            //Establecer Conexión
            connection = DriverManager.getConnection(DB_JDBC_URL, DB_JDBC_USER, DB_JDBC_PASSWORD);

            // Preparar y ejecutar la consulta para obtener todos los odontólogos
            LOGGER.info("Ejecutando consulta SQL: " + SQL_SELECT_ALL);
            pstmt = connection.prepareStatement(SQL_SELECT_ALL);
            ResultSet rs = pstmt.executeQuery();

            // Procesar los resultados y agregarlos a la lista
            while (rs.next()) {
                int id = rs.getInt("id");
                String matricula = rs.getString("matricula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Odontologo odontologo = new Odontologo(matricula, nombre, apellido);
                odontologoList.add(odontologo);
            }
            LOGGER.info("Se encontraron " + odontologoList.size() + " odontólogos en la base de datos.");

            pstmt.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return odontologoList;
    }
}

