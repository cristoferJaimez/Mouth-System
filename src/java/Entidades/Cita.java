/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "cita")
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c")
    , @NamedQuery(name = "Cita.findByIdCita", query = "SELECT c FROM Cita c WHERE c.idCita = :idCita")
    , @NamedQuery(name = "Cita.findByFechaHora", query = "SELECT c FROM Cita c WHERE c.fechaHora = :fechaHora")
    , @NamedQuery(name = "Cita.findByIdPaciente", query = "SELECT c FROM Cita c WHERE c.idPaciente = :idPaciente")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cita", nullable = false)
    private Integer idCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;
    @JoinColumn(name = "id_agenda", referencedColumnName = "id_agenda", nullable = false)
    @ManyToOne(optional = false)
    private Agenda idAgenda;
    @JoinColumn(name = "id_estado_cita", referencedColumnName = "id_estado_cita", nullable = false)
    @ManyToOne(optional = false)
    private EstadoCita idEstadoCita;
    @JoinColumn(name = "paciente_id_paciente", referencedColumnName = "id_paciente", nullable = false)
    @ManyToOne(optional = false)
    private Paciente pacienteIdPaciente;

    public Cita() {
    }

    public Cita(Integer idCita) {
        this.idCita = idCita;
    }

    public Cita(Integer idCita, Date fechaHora, int idPaciente) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.idPaciente = idPaciente;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Agenda getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Agenda idAgenda) {
        this.idAgenda = idAgenda;
    }

    public EstadoCita getIdEstadoCita() {
        return idEstadoCita;
    }

    public void setIdEstadoCita(EstadoCita idEstadoCita) {
        this.idEstadoCita = idEstadoCita;
    }

    public Paciente getPacienteIdPaciente() {
        return pacienteIdPaciente;
    }

    public void setPacienteIdPaciente(Paciente pacienteIdPaciente) {
        this.pacienteIdPaciente = pacienteIdPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cita[ idCita=" + idCita + " ]";
    }
    
}
