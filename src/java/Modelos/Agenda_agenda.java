
package Modelos;

import java.sql.Date;

/**
 *
 * @author or560
 */
public class Agenda_agenda {
   private int id_agenda;
   private Date fecha_inicio;
   private Date fecha_fin;
   private int id_odontologo;
   private medico id_medico;

    public Agenda_agenda() {
    }

    public Agenda_agenda(int id_agenda, Date fecha_inicio, Date fecha_fin, int id_odontologo, medico id_medico) {
        this.id_agenda = id_agenda;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.id_odontologo = id_odontologo;
        this.id_medico = id_medico;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public medico getId_medico() {
        return id_medico;
    }

    public void setId_medico(medico id_medico) {
        this.id_medico = id_medico;
    }
   
}
