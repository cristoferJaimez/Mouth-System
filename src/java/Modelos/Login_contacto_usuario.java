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
public class Login_contacto_usuario {

    private int id_contacto_usuario;
    private String email_usu;
    private int telefono_fijo;
    private int telefono_celular;
    private Login_datos_usuario datos_usuario_num_do;

    public Login_contacto_usuario() {
    }

    public Login_contacto_usuario(int id_contacto_usuario, String email_usu, int telefono_fijo, int telefono_celular, Login_datos_usuario datos_usuario_num_do) {
        this.id_contacto_usuario = id_contacto_usuario;
        this.email_usu = email_usu;
        this.telefono_fijo = telefono_fijo;
        this.telefono_celular = telefono_celular;
        this.datos_usuario_num_do = datos_usuario_num_do;
    }

    public int getId_contacto_usuario() {
        return id_contacto_usuario;
    }

    public void setId_contacto_usuario(int id_contacto_usuario) {
        this.id_contacto_usuario = id_contacto_usuario;
    }

    public String getEmail_usu() {
        return email_usu;
    }

    public void setEmail_usu(String email_usu) {
        this.email_usu = email_usu;
    }

    public int getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(int telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public int getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(int telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public Login_datos_usuario getDatos_usuario_num_do() {
        return datos_usuario_num_do;
    }

    public void setDatos_usuario_num_do(Login_datos_usuario datos_usuario_num_do) {
        this.datos_usuario_num_do = datos_usuario_num_do;
    }
    
    
    

}
