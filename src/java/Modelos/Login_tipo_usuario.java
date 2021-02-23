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
public class Login_tipo_usuario {
    
    private  int  id_tipo_usuario;
    private  String cargo;

    public Login_tipo_usuario() {
    }
    
    public Login_tipo_usuario(int id_tipo_usuario, String cargo) {
        this.id_tipo_usuario = id_tipo_usuario;
        this.cargo = cargo;
    }

    public int getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(int id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

   
   
    
    
}
