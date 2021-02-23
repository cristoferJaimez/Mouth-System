package Config;

import Modelos.CatalogoDAO;
import Modelos.InventarioDAO;

/**
 *
 * @author Cristo
 */
public class test {
    
    public static void main(String[] args) {
        
        try {
            Conexion con = new Conexion();
            con.Conexion();
            
            
            /*inventario DAO*/
            
            InventarioDAO invDao = new InventarioDAO();
            invDao.Listar();
            
            /*catalogo DAO*/
            
            CatalogoDAO catDAO = new CatalogoDAO();
            catDAO.Listar();
            
            
        } catch (Exception e) {
            System.out.println("Error en test" + e);
        }
        
     
    }
    
}
