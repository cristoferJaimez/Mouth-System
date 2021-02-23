package Modelos;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Cristo
 */
public class AgendaDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    /*para registar*/
    int res;
    
    // listar citas 
    
      public List ListarCitas() {

        String ConsultaSQL = "SELECT * FROM cita ";

        /*lista de citas*/
        List<Agenda_cita> citas = new ArrayList();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(ConsultaSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Agenda_cita agn_cit = new Agenda_cita();

                agn_cit.setFecha_hora(rs.getDate("fecha_hora"));
                agn_cit.setId_paciente(rs.getInt("id_paciente"));
                 
                
                
                citas.add(agn_cit);

            }

        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }

        return citas;

    }

    
    
}
