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
public class CatalogoDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    /*para registar*/
    int res;

    public List Listar() throws Exception {

        String Consulta = "SELECT * FROM `catalogo_servicios`";

        /*lista de productos*/
        List<Catalogo_catalogo_servicios> lista = new ArrayList();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(Consulta);
            rs = ps.executeQuery();

            while (rs.next()) {

                Catalogo_catalogo_servicios cat_ser = new Catalogo_catalogo_servicios();

                cat_ser.setNom_servicio(rs.getString("nom_servicio"));
                cat_ser.setCosto_servicio(rs.getInt("costo_servicio"));
                cat_ser.setDescuento_servicio(rs.getInt("descuento_servicio"));
                cat_ser.setImg_servicio(rs.getString("img_servicio"));
                cat_ser.setDescripcion(rs.getString("descripcion"));

                lista.add(cat_ser);
                
                System.out.println("catalogo -------->" + cat_ser.getNom_servicio());
            }

        } catch (SQLException e) {
            System.out.println("Error al extraer productos para el catalogo " + e.getMessage());
        }

        return lista;

    }
    
    
  
    
    
   public int AgregarProductoCatalogo(){
        
       String SQL = "INSERT INTO (nom_servicio, descripcion, descuento_servicio, costo_servicio, img_servicio) VALUES(?, ?, ?, ?, ?)";
       
       try {
           con = cn.Conexion();
           ps = con.prepareStatement(SQL);
           
           
       } catch (SQLException e) {
           System.out.println("Error al guardar producto en caralogo de servicios" + e.getMessage());
       }
        return 0;
       
       
   }
   

}
