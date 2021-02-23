package Modelos;

/**
 *
 * @author Cristo
 */
public class Catalogo_servicios {
        
    private int id_venta;
    private Catalogo_catalogo_servicios id_catalog_servicios;
    private paciente paciente_id_paciente;

    public Catalogo_servicios() {
    }

    public Catalogo_servicios(int id_venta, Catalogo_catalogo_servicios id_catalog_servicios, paciente paciente_id_paciente) {
        this.id_venta = id_venta;
        this.id_catalog_servicios = id_catalog_servicios;
        this.paciente_id_paciente = paciente_id_paciente;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Catalogo_catalogo_servicios getId_catalog_servicios() {
        return id_catalog_servicios;
    }

    public void setId_catalog_servicios(Catalogo_catalogo_servicios id_catalog_servicios) {
        this.id_catalog_servicios = id_catalog_servicios;
    }

    public paciente getPaciente_id_paciente() {
        return paciente_id_paciente;
    }

    public void setPaciente_id_paciente(paciente paciente_id_paciente) {
        this.paciente_id_paciente = paciente_id_paciente;
    }
       
}
