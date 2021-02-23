package Modelos;

/**
 *
 * @author Cristo
 */
public class Catalogo_catalogo_servicios {

    private int id_catalogo_servicios;
    private String nom_servicio;
    private int descuento_servicio;
    private float costo_servicio;
    private String img_servicio;
    private String descripcion;

    public Catalogo_catalogo_servicios() {
    }

    public Catalogo_catalogo_servicios(int id_catalogo_servicios, String nom_servicio, int descuento_servicio, float costo_servicio, String img_servicio, String descripcion) {
        this.id_catalogo_servicios = id_catalogo_servicios;
        this.nom_servicio = nom_servicio;
        this.descuento_servicio = descuento_servicio;
        this.costo_servicio = costo_servicio;
        this.img_servicio = img_servicio;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public int getId_catalogo_servicios() {
        return id_catalogo_servicios;
    }

    public void setId_catalogo_servicios(int id_catalogo_servicios) {
        this.id_catalogo_servicios = id_catalogo_servicios;
    }

    public String getNom_servicio() {
        return nom_servicio;
    }

    public void setNom_servicio(String nom_servicio) {
        this.nom_servicio = nom_servicio;
    }

    public int getDescuento_servicio() {
        return descuento_servicio;
    }

    public void setDescuento_servicio(int descuento_servicio) {
        this.descuento_servicio = descuento_servicio;
    }

    public float getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(float costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public String getImg_servicio() {
        return img_servicio;
    }

    public void setImg_servicio(String img_servicio) {
        this.img_servicio = img_servicio;
    }
    
    
    

}
