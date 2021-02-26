package Controladores;

import Modelos.LoginDAO;
import Modelos.Login_datos_usuario;
import Modelos.Login_usuarios_login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Cristo
 */
@WebServlet(name = "ValidarLogin", urlPatterns = {"/ValidarLogin"})
public class ValidarLogin extends HttpServlet {

    Login_usuarios_login log_usu = new Login_usuarios_login();
    Login_datos_usuario log_dat = new Login_datos_usuario();
    LoginDAO lodDAO = new LoginDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");

        switch (accion) {

            case "Entrar":
                String email = request.getParameter("email");
                String clave = request.getParameter("password");

                log_usu = lodDAO.Validar(email, clave);
                System.out.println(log_usu.getEmail_usu());
                if (log_usu.getEmail_usu() != null && log_usu.getContrasenna() != null) {

                    System.out.println(log_usu.getEmail_usu());
                    request.setAttribute("email", log_usu);
                    request.setAttribute("clave", log_usu);
                    request.getRequestDispatcher("ControladorURL?accion=Principal").forward(request, response);
                } else {
                    request.getRequestDispatcher("vista/Error/error404.xhtml").forward(request, response);
                }
                break;

            /*Registrar*/
            case "Registrar":
                String num_doc = request.getParameter("documento");
                String pri_nom = request.getParameter("pri_nom");
                String seg_nom = request.getParameter("seg_nom");
                String pri_ape = request.getParameter("pri_ape");
                String seg_ape = request.getParameter("seg_ape");
                String tipo_doc = request.getParameter("tipo_doc");
                String fecha_nac = request.getParameter("fecha_nac");
                String nacionalidad = request.getParameter("nacionalidad");

                log_dat = lodDAO.RegistrarUsuario(num_doc, pri_nom, seg_nom, pri_ape, seg_ape, tipo_doc, fecha_nac, nacionalidad, 1);
                request.getRequestDispatcher("ControladorURL?accion=Principal").forward(request, response);
                break;
            /*Actualizar*/
            case "Actualizar":
                break;

            /*Listar*/
            case "Listar":

                break;

            /*Eliminar*/
            case "Eliminar":
                break;
            default:
                System.out.println("Error inesperado...");
                break;
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
