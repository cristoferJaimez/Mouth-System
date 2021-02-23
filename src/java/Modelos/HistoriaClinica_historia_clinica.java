
package Modelos;

import java.sql.Date;

/**
 *
 * @author or560
 */
public class HistoriaClinica_historia_clinica {
    private int id_historia_clinica;
    private paciente paciente_id_paciente;
    private Date fecha_inicio;
    private Date fecha_fin;

    public HistoriaClinica_historia_clinica() {
    }

    public HistoriaClinica_historia_clinica(int id_historia_clinica, paciente paciente_id_paciente, Date fecha_inicio, Date fecha_fin) {
        this.id_historia_clinica = id_historia_clinica;
        this.paciente_id_paciente = paciente_id_paciente;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getId_historia_clinica() {
        return id_historia_clinica;
    }

    public void setId_historia_clinica(int id_historia_clinica) {
        this.id_historia_clinica = id_historia_clinica;
    }

    public paciente getPaciente_id_paciente() {
        return paciente_id_paciente;
    }

    public void setPaciente_id_paciente(paciente paciente_id_paciente) {
        this.paciente_id_paciente = paciente_id_paciente;
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
    
    
    
    
}
