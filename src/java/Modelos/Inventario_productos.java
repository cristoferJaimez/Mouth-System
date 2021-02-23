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
public class Inventario_productos {

    private int id_productos;
    private String nom_prod;
    private String des_prod;
    private String fecha_ven;
    private int cantidad;
    private int id_inventario;
    private int categoria_id_categoria;

    public Inventario_productos() {
    }

    public Inventario_productos(int id_productos, String nom_prod, String des_prod, String fecha_ven, int cantidad, int id_inventario, int categoria_id_categoria) {
        this.id_productos = id_productos;
        this.nom_prod = nom_prod;
        this.des_prod = des_prod;
        this.fecha_ven = fecha_ven;
        this.cantidad = cantidad;
        this.id_inventario = id_inventario;
        this.categoria_id_categoria = categoria_id_categoria;
    }

    public int getId_productos() {
        return id_productos;
    }

    public void setId_productos(int id_productos) {
        this.id_productos = id_productos;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public String getDes_prod() {
        return des_prod;
    }

    public void setDes_prod(String des_prod) {
        this.des_prod = des_prod;
    }

    public String getFecha_ven() {
        return fecha_ven;
    }

    public void setFecha_ven(String fecha_ven) {
        this.fecha_ven = fecha_ven;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getCategoria_id_categoria() {
        return categoria_id_categoria;
    }

    public void setCategoria_id_categoria(int categoria_id_categoria) {
        this.categoria_id_categoria = categoria_id_categoria;
    }

    
    
    

}
