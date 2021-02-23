/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author Cristo
 */
public class Login_datos_usuario {

    private String num_doc;
    private String pri_nom;
    private String seg_nom;
    private String pri_ape;
    private String seg_ape;
    private String tipo_doc;
    private String fecha_nac;
    private String nacionalidad;
    private Login_tipo_usuario tipo_usuario_id_tipo_usuario;

    public Login_datos_usuario() {
    }

    public Login_datos_usuario(String num_doc, String pri_nom, String seg_nom, String pri_ape, String seg_ape, String tipo_doc, String fecha_nac, String nacionalidad, Login_tipo_usuario tipo_usuario_id_tipo_usuario) {
        this.num_doc = num_doc;
        this.pri_nom = pri_nom;
        this.seg_nom = seg_nom;
        this.pri_ape = pri_ape;
        this.seg_ape = seg_ape;
        this.tipo_doc = tipo_doc;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.tipo_usuario_id_tipo_usuario = tipo_usuario_id_tipo_usuario;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getPri_nom() {
        return pri_nom;
    }

    public void setPri_nom(String pri_nom) {
        this.pri_nom = pri_nom;
    }

    public String getSeg_nom() {
        return seg_nom;
    }

    public void setSeg_nom(String seg_nom) {
        this.seg_nom = seg_nom;
    }

    public String getPri_ape() {
        return pri_ape;
    }

    public void setPri_ape(String pri_ape) {
        this.pri_ape = pri_ape;
    }

    public String getSeg_ape() {
        return seg_ape;
    }

    public void setSeg_ape(String seg_ape) {
        this.seg_ape = seg_ape;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Login_tipo_usuario getTipo_usuario_id_tipo_usuario() {
        return tipo_usuario_id_tipo_usuario;
    }

    public void setTipo_usuario_id_tipo_usuario(Login_tipo_usuario tipo_usuario_id_tipo_usuario) {
        this.tipo_usuario_id_tipo_usuario = tipo_usuario_id_tipo_usuario;
    }

   
    
    

}
