
package Modelos;

import java.sql.Date;

/**
 *
 * @author or560
 */
public class Agenda_cita {
    private int id_cita;
    private Date fecha_hora;
    private int id_agenda;
    private int id_estado_cita;
    private int id_paciente;

    public Agenda_cita() {
    }

    public Agenda_cita(int id_cita, Date fecha_hora, int id_agenda, int id_estado_cita, int id_paciente) {
        this.id_cita = id_cita;
        this.fecha_hora = fecha_hora;
        this.id_agenda = id_agenda;
        this.id_estado_cita = id_estado_cita;
        this.id_paciente = id_paciente;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public int getId_estado_cita() {
        return id_estado_cita;
    }

    public void setId_estado_cita(int id_estado_cita) {
        this.id_estado_cita = id_estado_cita;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

}