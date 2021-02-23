package Config;

/*importaciones*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristo
 */
public class Conexion {

    /*datos de conexion base de datos variable estatica*/
    Connection con;

    String url = "jdbc:mysql://localhost:3306/mouth_system";
    String usuario = "root";
    String clave = "";

    public Connection Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexion Exitosa...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
