
package Modelos;

/**
 *
 * @author or560
 */
public class Agenda_estado_cita {
   private int id_estado_cita;
   private String estado;

    public Agenda_estado_cita() {
    }

    public Agenda_estado_cita(int id_estado_cita, String estado) {
        this.id_estado_cita = id_estado_cita;
        this.estado = estado;
    }

    public int getId_estado_cita() {
        return id_estado_cita;
    }

    public void setId_estado_cita(int id_estado_cita) {
        this.id_estado_cita = id_estado_cita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
