/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "historia_clinica")
@NamedQueries({
    @NamedQuery(name = "HistoriaClinica.findAll", query = "SELECT h FROM HistoriaClinica h")
    , @NamedQuery(name = "HistoriaClinica.findByIdHistoriaClinica", query = "SELECT h FROM HistoriaClinica h WHERE h.idHistoriaClinica = :idHistoriaClinica")
    , @NamedQuery(name = "HistoriaClinica.findByFechaInicio", query = "SELECT h FROM HistoriaClinica h WHERE h.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "HistoriaClinica.findByFechaFin", query = "SELECT h FROM HistoriaClinica h WHERE h.fechaFin = :fechaFin")})
public class HistoriaClinica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_historia_clinica", nullable = false)
    private Integer idHistoriaClinica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fin", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historiaClinicaIdHistoriaClinica")
    private List<Tratamientos> tratamientosList;
    @JoinColumn(name = "paciente_id_paciente", referencedColumnName = "id_paciente", nullable = false)
    @ManyToOne(optional = false)
    private Paciente pacienteIdPaciente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historiaClinicaIdHistoriaClinica")
    private List<DetalleHistoria> detalleHistoriaList;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Integer idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public HistoriaClinica(Integer idHistoriaClinica, Date fechaInicio, Date fechaFin) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Integer idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Tratamientos> getTratamientosList() {
        return tratamientosList;
    }

    public void setTratamientosList(List<Tratamientos> tratamientosList) {
        this.tratamientosList = tratamientosList;
    }

    public Paciente getPacienteIdPaciente() {
        return pacienteIdPaciente;
    }

    public void setPacienteIdPaciente(Paciente pacienteIdPaciente) {
        this.pacienteIdPaciente = pacienteIdPaciente;
    }

    public List<DetalleHistoria> getDetalleHistoriaList() {
        return detalleHistoriaList;
    }

    public void setDetalleHistoriaList(List<DetalleHistoria> detalleHistoriaList) {
        this.detalleHistoriaList = detalleHistoriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistoriaClinica != null ? idHistoriaClinica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriaClinica)) {
            return false;
        }
        HistoriaClinica other = (HistoriaClinica) object;
        if ((this.idHistoriaClinica == null && other.idHistoriaClinica != null) || (this.idHistoriaClinica != null && !this.idHistoriaClinica.equals(other.idHistoriaClinica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.HistoriaClinica[ idHistoriaClinica=" + idHistoriaClinica + " ]";
    }
    
}
