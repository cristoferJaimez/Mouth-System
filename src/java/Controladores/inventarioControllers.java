package Controladores;
import Modelos.InventarioDAO;
import Modelos.Inventario_categoria;
import Modelos.Inventario_productos;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cristo
 */
@WebServlet(name = "inventarioControllers", urlPatterns = {"/inventarioControllers"})
public class inventarioControllers extends HttpServlet {

    /*Inventario DAO*/
    Inventario_productos inv_prod = new Inventario_productos();
    Inventario_categoria inv_cat = new Inventario_categoria();
    InventarioDAO invDAO = new InventarioDAO();
    int idProducto;

   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        String accion = request.getParameter("accion");
        String opcion = request.getParameter("opcion");

        switch (accion) {
            case "Inventario":

                switch (opcion) {

                    case "Listar":
                        List lista = invDAO.Listar();
                        List lista2 = invDAO.ListarCategoria();
                        request.setAttribute("inventarios", lista);
                        request.setAttribute("categorias", lista2);
                        break;

                    case "Agregar":
                        /*tomar los valores de la vista*/
                        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
                        String nom_prod = request.getParameter("nom_prod");
                        String des_prod = request.getParameter("descripcion");
                        String fecha_ven = request.getParameter("fecha_ven");
                        int id_categoria = Integer.parseInt(request.getParameter("categoria"));

                        inv_prod.setNom_prod(nom_prod);
                        inv_prod.setCantidad(cantidad);
                        inv_prod.setFecha_ven(fecha_ven);
                        inv_prod.setDes_prod(des_prod);
                        inv_prod.setCategoria_id_categoria(id_categoria);
                        invDAO.AgregarProducto(inv_prod);
                        request.getRequestDispatcher("inventarioControllers?accion=Inventario&opcion=Listar").forward(request, response);

                        System.out.println("se agrego producto al inventario");
                        System.out.println(inv_prod);
                        break;

                    case "Editar":
                        System.out.println("Editando Producto");
                        idProducto = Integer.parseInt(request.getParameter("id"));
                        Inventario_productos inv = invDAO.ListarID(idProducto);
                        request.setAttribute("productoSeleccionado", inv);
                        request.getRequestDispatcher("inventarioControllers?accion=Inventario&opcion=Listar").forward(request, response);
                        break;

                    case "Actualizar":

                        Inventario_productos inv_prod01 = new Inventario_productos();
                        int cantidadUpdate = Integer.parseInt(request.getParameter("cantidad"));
                        String nom_prodUpdate = request.getParameter("nom_prod");
                        String des_prodUpdate = request.getParameter("descripcion");
                        String fecha_venUpdate = request.getParameter("fecha_ven");
                        int categoriaUpdate = Integer.parseInt(request.getParameter("categoria"));

                        inv_prod01.setCantidad(cantidadUpdate);
                        inv_prod01.setNom_prod(nom_prodUpdate);
                        inv_prod01.setDes_prod(des_prodUpdate);
                        inv_prod01.setFecha_ven(fecha_venUpdate);
                        inv_prod01.setCategoria_id_categoria(categoriaUpdate);

                        System.out.println("nombre" + nom_prodUpdate + " des" + des_prodUpdate + " fecha " + fecha_venUpdate + "cantidad " + cantidadUpdate);
                        inv_prod01.setId_productos(idProducto);
                        invDAO.Actualizar(inv_prod01);

                        request.getRequestDispatcher("inventarioControllers?accion=Inventario&opcion=Listar").forward(request, response);
                        break;

                    case "Eliminar":
                        idProducto = Integer.parseInt(request.getParameter("id"));
                        invDAO.Eliminar(idProducto);
                        request.getRequestDispatcher("inventarioControllers?accion=Inventario&opcion=Listar").forward(request, response);
                        break;
                }

                request.getRequestDispatcher("Vista/MouthSystem/Inventario/Inventario.jsp?accion=Inventario&opcion=Listar").forward(request, response);

                break;

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(inventarioControllers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(inventarioControllers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
