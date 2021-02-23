/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "detalle_fidelizacion")
@NamedQueries({
    @NamedQuery(name = "DetalleFidelizacion.findAll", query = "SELECT d FROM DetalleFidelizacion d")
    , @NamedQuery(name = "DetalleFidelizacion.findByIdDetalleFidelizacion", query = "SELECT d FROM DetalleFidelizacion d WHERE d.idDetalleFidelizacion = :idDetalleFidelizacion")})
public class DetalleFidelizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_fidelizacion", nullable = false)
    private Integer idDetalleFidelizacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detalleFidelizacionIdDetalleFidelizacion")
    private List<Fidelizacion> fidelizacionList;
    @JoinColumn(name = "paciente_id_paciente", referencedColumnName = "id_paciente", nullable = false)
    @ManyToOne(optional = false)
    private Paciente pacienteIdPaciente;

    public DetalleFidelizacion() {
    }

    public DetalleFidelizacion(Integer idDetalleFidelizacion) {
        this.idDetalleFidelizacion = idDetalleFidelizacion;
    }

    public Integer getIdDetalleFidelizacion() {
        return idDetalleFidelizacion;
    }

    public void setIdDetalleFidelizacion(Integer idDetalleFidelizacion) {
        this.idDetalleFidelizacion = idDetalleFidelizacion;
    }

    public List<Fidelizacion> getFidelizacionList() {
        return fidelizacionList;
    }

    public void setFidelizacionList(List<Fidelizacion> fidelizacionList) {
        this.fidelizacionList = fidelizacionList;
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
        hash += (idDetalleFidelizacion != null ? idDetalleFidelizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFidelizacion)) {
            return false;
        }
        DetalleFidelizacion other = (DetalleFidelizacion) object;
        if ((this.idDetalleFidelizacion == null && other.idDetalleFidelizacion != null) || (this.idDetalleFidelizacion != null && !this.idDetalleFidelizacion.equals(other.idDetalleFidelizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DetalleFidelizacion[ idDetalleFidelizacion=" + idDetalleFidelizacion + " ]";
    }
    
}
