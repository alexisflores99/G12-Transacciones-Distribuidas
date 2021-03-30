package breiner.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

    private AccesoDB() {
    }

    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        // Parámetros
        String driver = "com.mysql.cj.jdbc.Driver";
        String urlDB = "jdbc:mysql://localhost:3306/distribuidas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        try {
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(urlDB, user, pass);
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontro el driver de la BD.");
        } catch (Exception e) {
            throw new SQLException("No se puede establecer conexión de la BD.");
        }
        return cn;
    }

}
