
package Modelos;

/**
 *
 * @author or560
 */
public class Fidelizacion_fidelizacion {
    private int id_fidelizacion;
    private int puntaje;
    private String observacion;
    private int id_paciente;
    private int id_odontologo;
    private Fidelizacion_Detalle_fidelizacion id_detalle_fidelizacion;

    public Fidelizacion_fidelizacion() {
    }

    public Fidelizacion_fidelizacion(int id_fidelizacion, int puntaje, String observacion, int id_paciente, int id_odontologo, Fidelizacion_Detalle_fidelizacion id_detalle_fidelizacion) {
        this.id_fidelizacion = id_fidelizacion;
        this.puntaje = puntaje;
        this.observacion = observacion;
        this.id_paciente = id_paciente;
        this.id_odontologo = id_odontologo;
        this.id_detalle_fidelizacion = id_detalle_fidelizacion;
    }

    public int getId_fidelizacion() {
        return id_fidelizacion;
    }

    public void setId_fidelizacion(int id_fidelizacion) {
        this.id_fidelizacion = id_fidelizacion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public Fidelizacion_Detalle_fidelizacion getId_detalle_fidelizacion() {
        return id_detalle_fidelizacion;
    }

    public void setId_detalle_fidelizacion(Fidelizacion_Detalle_fidelizacion id_detalle_fidelizacion) {
        this.id_detalle_fidelizacion = id_detalle_fidelizacion;
    }
    
}
