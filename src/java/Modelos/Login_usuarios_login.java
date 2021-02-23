/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Cristo
 */
public class Login_usuarios_login {
        
    private int id_login;
    private String email_usu;
    private String contrasenna;
    private Login_datos_usuario datos_usuario_num_doc;

    public Login_usuarios_login() {
    }

    public Login_usuarios_login(int id_login, String email_usu, String contrasenna, Login_datos_usuario datos_usuario_num_doc) {
        this.id_login = id_login;
        this.email_usu = email_usu;
        this.contrasenna = contrasenna;
        this.datos_usuario_num_doc = datos_usuario_num_doc;
    }

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public String getEmail_usu() {
        return email_usu;
    }

    public void setEmail_usu(String email_usu) {
        this.email_usu = email_usu;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public Login_datos_usuario getDatos_usuario_num_doc() {
        return datos_usuario_num_doc;
    }

    public void setDatos_usuario_num_doc(Login_datos_usuario datos_usuario_num_doc) {
        this.datos_usuario_num_doc = datos_usuario_num_doc;
    }

   
     
    
    
}
