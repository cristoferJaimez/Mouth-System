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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "servicios")
@NamedQueries({
    @NamedQuery(name = "Servicios.findAll", query = "SELECT s FROM Servicios s")
    , @NamedQuery(name = "Servicios.findByIdVentas", query = "SELECT s FROM Servicios s WHERE s.idVentas = :idVentas")
    , @NamedQuery(name = "Servicios.findByIdPaciente", query = "SELECT s FROM Servicios s WHERE s.idPaciente = :idPaciente")})
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ventas", nullable = false)
    private Integer idVentas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;
    @JoinColumn(name = "id_catalogo_servicios", referencedColumnName = "id_catalogo_servicios", nullable = false)
    @ManyToOne(optional = false)
    private CatalogoServicios idCatalogoServicios;
    @JoinColumn(name = "paciente_id_paciente", referencedColumnName = "id_paciente", nullable = false)
    @ManyToOne(optional = false)
    private Paciente pacienteIdPaciente;

    public Servicios() {
    }

    public Servicios(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public Servicios(Integer idVentas, int idPaciente) {
        this.idVentas = idVentas;
        this.idPaciente = idPaciente;
    }

    public Integer getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public CatalogoServicios getIdCatalogoServicios() {
        return idCatalogoServicios;
    }

    public void setIdCatalogoServicios(CatalogoServicios idCatalogoServicios) {
        this.idCatalogoServicios = idCatalogoServicios;
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
        hash += (idVentas != null ? idVentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.idVentas == null && other.idVentas != null) || (this.idVentas != null && !this.idVentas.equals(other.idVentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Servicios[ idVentas=" + idVentas + " ]";
    }
    
}
