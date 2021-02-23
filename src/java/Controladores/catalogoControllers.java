package Controladores;

import Modelos.CatalogoDAO;
import Modelos.Catalogo_catalogo_servicios;
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
@WebServlet(name = "stockControllers", urlPatterns = {"/stockControllers"})
public class catalogoControllers extends HttpServlet {
    

    /*Catalogo de Servicios*/
    Catalogo_catalogo_servicios cat_ser = new Catalogo_catalogo_servicios();
    CatalogoDAO catDAO = new CatalogoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        String accion = request.getParameter("accion");
        String opcion = request.getParameter("opcion");

        switch (accion) {
            case "Inventario":

                switch (opcion) {

                    case "Listar":
                        List list  = catDAO.Listar();
                        request.setAttribute("catalogoServicios", list);         
                        break;

                    case "Agregar":
                        /*tomar los valores de la vista*/
                        break;

                    case "Editar":
                        break;

                    case "Actualizar":

                        break;

                    case "Eliminar":
                        break;
                }

                request.getRequestDispatcher("Vista/MouthSystem/Catalogo/listaCatalogo.jsp").forward(request, response);

                break;

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(catalogoControllers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(catalogoControllers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
