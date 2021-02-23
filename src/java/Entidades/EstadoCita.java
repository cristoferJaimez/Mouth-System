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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "estado_cita")
@NamedQueries({
    @NamedQuery(name = "EstadoCita.findAll", query = "SELECT e FROM EstadoCita e")
    , @NamedQuery(name = "EstadoCita.findByIdEstadoCita", query = "SELECT e FROM EstadoCita e WHERE e.idEstadoCita = :idEstadoCita")
    , @NamedQuery(name = "EstadoCita.findByEstado", query = "SELECT e FROM EstadoCita e WHERE e.estado = :estado")})
public class EstadoCita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estado_cita", nullable = false)
    private Integer idEstadoCita;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estado", nullable = false, length = 45)
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoCita")
    private List<Cita> citaList;

    public EstadoCita() {
    }

    public EstadoCita(Integer idEstadoCita) {
        this.idEstadoCita = idEstadoCita;
    }

    public EstadoCita(Integer idEstadoCita, String estado) {
        this.idEstadoCita = idEstadoCita;
        this.estado = estado;
    }

    public Integer getIdEstadoCita() {
        return idEstadoCita;
    }

    public void setIdEstadoCita(Integer idEstadoCita) {
        this.idEstadoCita = idEstadoCita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Cita> getCitaList() {
        return citaList;
    }

    public void setCitaList(List<Cita> citaList) {
        this.citaList = citaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoCita != null ? idEstadoCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCita)) {
            return false;
        }
        EstadoCita other = (EstadoCita) object;
        if ((this.idEstadoCita == null && other.idEstadoCita != null) || (this.idEstadoCita != null && !this.idEstadoCita.equals(other.idEstadoCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.EstadoCita[ idEstadoCita=" + idEstadoCita + " ]";
    }
    
}
