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
public class InventarioDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    /*para registar*/
    int res;

    public List ListarCategoria() {

        String ConsultaSQL = "SELECT * FROM categoria ";

        /*lista de categoria*/
        List<Inventario_categoria> lista2 = new ArrayList();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(ConsultaSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Inventario_categoria inv_cat = new Inventario_categoria();

                inv_cat.setId_categoria(rs.getInt("id_categoria"));
                inv_cat.setCategoria(rs.getString("categoria"));

                lista2.add(inv_cat);

            }

        } catch (SQLException e) {
            System.out.println("Error al listar categorias" + e.getMessage());
        }

        return lista2;

    }

    public List Listar() throws Exception {

        String Consulta = "SELECT * FROM `productos` INNER JOIN categoria on productos.categoria_id_categoria = categoria.id_categoria ";
        String ConsultaSQL = "SELECT * FROM categoria ";
        /*lista de productos*/
        List<Inventario_productos> lista = new ArrayList();

        /*lista de categoria*/
        List<Inventario_categoria> lista2 = new ArrayList();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(Consulta);
            rs = ps.executeQuery();

            while (rs.next()) {
                Inventario_productos inv_prod = new Inventario_productos();
                Inventario_categoria inv_cat = new Inventario_categoria();

                inv_prod.setId_productos(rs.getInt("id_productos"));
                inv_prod.setNom_prod(rs.getString("nom_prod"));
                inv_prod.setDes_prod(rs.getString("des_prod"));
                inv_prod.setFecha_ven(rs.getString("fecha_ven"));
                inv_prod.setCantidad(rs.getInt("cantidad"));
                inv_cat.setId_categoria(rs.getInt("id_categoria"));
                inv_cat.setCategoria(rs.getString("categoria"));
                lista.add(inv_prod);

                System.out.println(inv_prod.getId_productos() + " consultando productos de inventario..." + inv_prod.getNom_prod() + " " + inv_prod.getDes_prod() + " " + inv_cat.getCategoria());
            }

        } catch (SQLException e) {
            
            System.out.println("Error al extraer productos " + e.getMessage());
        }

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(ConsultaSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Inventario_categoria inv_cat = new Inventario_categoria();

                inv_cat.setId_categoria(rs.getInt("id_categoria"));
                inv_cat.setCategoria(rs.getString("categoria"));

                lista2.add(inv_cat);

            }

        } catch (SQLException e) {
                        System.out.println("Error al extraer categorias " + e.getMessage());

        }

        return lista;

    }

    public int AgregarProducto(Inventario_productos inv_prod) {

        String SQL = "INSERT  INTO productos (nom_prod, des_prod, fecha_ven, cantidad, id_inventario,categoria_id_categoria ) VALUES(?, ?, ?, ?, '1',? )";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(SQL);
            ps.setString(1, inv_prod.getNom_prod());
            ps.setString(2, inv_prod.getDes_prod());
            ps.setString(3, inv_prod.getFecha_ven());
            ps.setInt(4, inv_prod.getCantidad());
            ps.setInt(5, inv_prod.getCategoria_id_categoria());
            ps.executeUpdate();

            System.out.println("Guardando en inventario...");

        } catch (SQLException e) {
            System.out.println("Error al intentar Guardar en inventario " + e.getMessage());
        }

        return res;
    }

    public Inventario_productos ListarID(int id) {

        Inventario_productos inv_prod = new Inventario_productos();

        String consulta = "SELECT * FROM productos WHERE id_productos = " + id;

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();

            while (rs.next()) {
                inv_prod.setNom_prod(rs.getString(2));
                inv_prod.setDes_prod(rs.getString(3));
                inv_prod.setCantidad(rs.getInt(4));
                inv_prod.setFecha_ven(rs.getString(5));
            }
        } catch (SQLException e) {
     
            System.out.println("Error al trar lista por id" + e.getMessage());
        } finally {
            /*cerrar conexio a base de datos*/
        }

        return inv_prod;
    }

    public int Actualizar(Inventario_productos inv_prod) {
        String consulta = "UPDATE productos set nom_prod = ? , des_prod =? , fecha_ven = ?, cantidad = ? ,id_inventario= 1,categoria_id_categoria= 1 WHERE id_productos = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);

            ps.setString(1, inv_prod.getNom_prod());
            ps.setString(2, inv_prod.getDes_prod());
            ps.setString(3, inv_prod.getFecha_ven());
            ps.setInt(4, inv_prod.getCantidad());
            ps.setInt(5, inv_prod.getId_productos());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al actualizar inventario" + e.getMessage());
        } finally {

        }
        return res;
    }

    public void Eliminar(int id) {
        String SQL = "DELETE FROM productos WHERE id_productos = " + id;
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(SQL);
            ps.executeUpdate();

            System.out.println("Elimino" + id);

        } catch (SQLException e) {
            System.out.println("Error al eliminar producto de inventario " + e.getMessage());
        }
    }
}
