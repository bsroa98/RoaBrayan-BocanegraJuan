package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    protected static Connection conexion = null;

    private static void conectar() {
        try {
            //Class.forName("com.postgresql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CRUDP", "postgres", "root");
        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    private Conexion() {
    }

    public static Connection getInstance() {
        if (conexion == null) {
            conectar();
        }
        return conexion;
    }

}

