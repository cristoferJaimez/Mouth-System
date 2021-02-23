/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "fidelizacion")
@NamedQueries({
    @NamedQuery(name = "Fidelizacion.findAll", query = "SELECT f FROM Fidelizacion f")
    , @NamedQuery(name = "Fidelizacion.findByIdFidelizacion", query = "SELECT f FROM Fidelizacion f WHERE f.idFidelizacion = :idFidelizacion")
    , @NamedQuery(name = "Fidelizacion.findByPuntaje", query = "SELECT f FROM Fidelizacion f WHERE f.puntaje = :puntaje")
    , @NamedQuery(name = "Fidelizacion.findByObservacion", query = "SELECT f FROM Fidelizacion f WHERE f.observacion = :observacion")
    , @NamedQuery(name = "Fidelizacion.findByIdPaciente", query = "SELECT f FROM Fidelizacion f WHERE f.idPaciente = :idPaciente")
    , @NamedQuery(name = "Fidelizacion.findByIdOdontologo", query = "SELECT f FROM Fidelizacion f WHERE f.idOdontologo = :idOdontologo")})
public class Fidelizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fidelizacion", nullable = false)
    private Integer idFidelizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puntaje", nullable = false)
    private int puntaje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "observacion", nullable = false, length = 45)
    private String observacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_odontologo", nullable = false)
    private int idOdontologo;
    @JoinColumn(name = "detalle_fidelizacion_id_detalle_fidelizacion", referencedColumnName = "id_detalle_fidelizacion", nullable = false)
    @ManyToOne(optional = false)
    private DetalleFidelizacion detalleFidelizacionIdDetalleFidelizacion;

    public Fidelizacion() {
    }

    public Fidelizacion(Integer idFidelizacion) {
        this.idFidelizacion = idFidelizacion;
    }

    public Fidelizacion(Integer idFidelizacion, int puntaje, String observacion, int idPaciente, int idOdontologo) {
        this.idFidelizacion = idFidelizacion;
        this.puntaje = puntaje;
        this.observacion = observacion;
        this.idPaciente = idPaciente;
        this.idOdontologo = idOdontologo;
    }

    public Integer getIdFidelizacion() {
        return idFidelizacion;
    }

    public void setIdFidelizacion(Integer idFidelizacion) {
        this.idFidelizacion = idFidelizacion;
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

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdOdontologo() {
        return idOdontologo;
    }

    public void setIdOdontologo(int idOdontologo) {
        this.idOdontologo = idOdontologo;
    }

    public DetalleFidelizacion getDetalleFidelizacionIdDetalleFidelizacion() {
        return detalleFidelizacionIdDetalleFidelizacion;
    }

    public void setDetalleFidelizacionIdDetalleFidelizacion(DetalleFidelizacion detalleFidelizacionIdDetalleFidelizacion) {
        this.detalleFidelizacionIdDetalleFidelizacion = detalleFidelizacionIdDetalleFidelizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFidelizacion != null ? idFidelizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fidelizacion)) {
            return false;
        }
        Fidelizacion other = (Fidelizacion) object;
        if ((this.idFidelizacion == null && other.idFidelizacion != null) || (this.idFidelizacion != null && !this.idFidelizacion.equals(other.idFidelizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Fidelizacion[ idFidelizacion=" + idFidelizacion + " ]";
    }
    
}
