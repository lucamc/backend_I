package dao.impl;

import dao.IDao;
import modelo.Estudiante;

import java.security.PrivilegedAction;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAOH2 implements IDao<Estudiante> {


    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_estudiantes";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";


    private final static String SQL_INSERT = "INSERT INTO estudiantes VALUES (?,?,?)";
    private final static String SQL_DELETE = "DELETE FROM estudiantes where id=?";
    private final static String SQL_SELECT = "SELECT * FROM estudiantes where id=?";
    private final static String SQL_SELECT_ALL = "SELECT * FROM estudiantes";



    @Override
    public Estudiante guardar(Estudiante estudiante) {
        Connection connection = null;
        PreparedStatement pstmt = null;

        // 1- Levantar El Driver Y conectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2-  Crear sentencia
            pstmt = connection.prepareStatement(SQL_INSERT);
            pstmt.setLong(1, estudiante.getId());
            pstmt.setString(2, estudiante.getNombre());
            pstmt.setString(3, estudiante.getApellido());

            // 3 - Ejecutar la sentencia
            pstmt.executeUpdate();
            pstmt.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return estudiante;
    }

    @Override
    public void eliminar(Long id) {

        Connection connection = null;
        PreparedStatement pstmt = null;

        // 1- Levantar El Driver Y conectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2-  Crear sentencia
            pstmt = connection.prepareStatement(SQL_DELETE);
            pstmt.setLong(1, id);


            // 3 - Ejecutar la sentencia
            pstmt.executeUpdate();
            pstmt.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Estudiante buscar(Long id) {

        Connection connection = null;
        PreparedStatement pstmt = null;
        Estudiante estudiante = null;

        // 1- Levantar El Driver Y conectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2-  Crear sentencia
            pstmt = connection.prepareStatement(SQL_SELECT);
            pstmt.setLong(1, id);


            // 3 - Ejecutar la sentencia
            ResultSet resultado = pstmt.executeQuery();

            // 4 - Evaluar los Resultados
            while (resultado.next()) {

                Long idEstudiante = resultado.getLong("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                estudiante = new Estudiante(idEstudiante, nombre, apellido);

            }

            pstmt.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return estudiante;
    }


    @Override
    public List<Estudiante> buscarTodos() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // 1- Levantar El Driver Y conectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2-  Crear sentencia
            pstmt = connection.prepareStatement(SQL_SELECT_ALL);


            // 3 - Ejecutar la sentencia
            ResultSet resultado = pstmt.executeQuery();

            // 4 - Evaluar los Resultados
            while (resultado.next()) {

                Long idEstudiante = resultado.getLong("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                Estudiante estudiante = new Estudiante(idEstudiante, nombre, apellido);

                estudiantes.add(estudiante);
            }

            pstmt.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return estudiantes;
    }


}

