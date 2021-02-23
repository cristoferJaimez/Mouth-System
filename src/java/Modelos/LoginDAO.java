package Modelos;

import Config.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cristo
 */
public class LoginDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    Conexion cn = new Conexion();

    public Login_usuarios_login Validar(String email, String clave) {

        Login_usuarios_login log_in = new Login_usuarios_login();
        String consulta = "SELECT * FROM usuarios_login WHERE email_usu =  ?  AND contrasenna =  ? ";

        con = cn.Conexion();

        try {
            ps = (PreparedStatement) con.prepareStatement(consulta);
            ps.setString(1, email);
            ps.setString(2, clave);

            rs = ps.executeQuery();
            rs.next();

            do {
                log_in.setEmail_usu(rs.getString("email_usu"));
                log_in.setContrasenna(rs.getString("contrasenna"));
                /*  log_in.setDatos_usuario_num_doc(rs.getDatos_usuario_num_doc("datos_usuario_num_doc"));*/
            } while (rs.next());

        } catch (SQLException e) {

            System.out.println("Error " + e.getMessage());
        }
        return log_in;
    }

    public Login_datos_usuario RegistrarUsuario(String num_doc, String pri_nom, String seg_nom, String pri_ape, String seg_ape, String tipo_doc,String fecha_nac, String nacionalidad, int tipo_usu) {
        Login_datos_usuario log_dat = new Login_datos_usuario();
        String guardarSQL = "Insert into datos_usuario (num_doc, pri_nom, seg_nom, pri_ape, seg_ape, tipo_doc, fecha_nac, nacionalidad, tipo_usuario_id_tipo_usuraio) values "
                + "(" + num_doc + ", " + pri_nom + ", " + seg_nom + ",  " + pri_ape + ", " + seg_ape + " , " + tipo_doc+ ", " + fecha_nac + ", " + nacionalidad + ", , " + tipo_usu + ")";

        con = cn.Conexion();

        try {
            ps = (PreparedStatement) con.prepareStatement(guardarSQL);
            ps.setString(1, num_doc);
            ps.setString(2, pri_nom);
            ps.setString(3, seg_nom);
            ps.setString(4, pri_ape);
            ps.setString(5, seg_ape); 
            ps.setString(6, tipo_doc);
            ps.setString(7, fecha_nac);
            ps.setString(8, nacionalidad);
            ps.setInt(9, tipo_usu);
            
            
            rs = ps.executeQuery();
            rs.next();
            System.out.println("Usuario creado...");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Probleas al crear usuario: " + e.getMessage());
        }
        
        return log_dat;
    }

}
