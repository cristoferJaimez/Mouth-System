package Controladores;

import Modelos.AgendaDAO;
import Modelos.Agenda_agenda;
import Modelos.Agenda_cita;
import Modelos.Agenda_estado_cita;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cristo
 */
@WebServlet(name = "citasControllers", urlPatterns = {"/citasControllers"})
public class citasControllers extends HttpServlet {

    
    /* Agnda dao */
    Agenda_agenda agn_agn = new Agenda_agenda();
    Agenda_cita agn_cit = new Agenda_cita();
    Agenda_estado_cita agn_est_cit = new Agenda_estado_cita();
    AgendaDAO agnDAO = new  AgendaDAO();
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String opcion = request.getParameter("opcion");
        
        switch (opcion) {

            case "Listar":
                System.out.println("listando desde controlador de citas");
                break;
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
