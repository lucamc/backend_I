import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        try {
            // Establecer conexión con la base de datos
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

            // Crear una tabla
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "age INT NOT NULL" +
                    ")";

            Statement stmt = connection.createStatement();
            stmt.execute(createTableSQL);

            // Insertar datos en la tabla
            String insertSQL = "INSERT INTO students (name, age) VALUES ('Alice', 20), ('Bob', 22)";
            stmt.executeUpdate(insertSQL);

            // Consultar datos de la tabla y mostrarlos
            String querySQL = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(querySQL);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Cerrar recursos
            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}