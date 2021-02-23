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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "localidad_usuario")
@NamedQueries({
    @NamedQuery(name = "LocalidadUsuario.findAll", query = "SELECT l FROM LocalidadUsuario l")
    , @NamedQuery(name = "LocalidadUsuario.findByIdLocalidadUsuario", query = "SELECT l FROM LocalidadUsuario l WHERE l.idLocalidadUsuario = :idLocalidadUsuario")
    , @NamedQuery(name = "LocalidadUsuario.findByNomLocalidad", query = "SELECT l FROM LocalidadUsuario l WHERE l.nomLocalidad = :nomLocalidad")})
public class LocalidadUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_localidad_usuario", nullable = false)
    private Integer idLocalidadUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_localidad", nullable = false, length = 45)
    private String nomLocalidad;
    @JoinColumn(name = "ciudad_usuario_id_ciudad_usuario", referencedColumnName = "id_ciudad_usuario", nullable = false)
    @ManyToOne(optional = false)
    private CiudadUsuario ciudadUsuarioIdCiudadUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLocalidadUsuario")
    private List<DireccionUsuario> direccionUsuarioList;

    public LocalidadUsuario() {
    }

    public LocalidadUsuario(Integer idLocalidadUsuario) {
        this.idLocalidadUsuario = idLocalidadUsuario;
    }

    public LocalidadUsuario(Integer idLocalidadUsuario, String nomLocalidad) {
        this.idLocalidadUsuario = idLocalidadUsuario;
        this.nomLocalidad = nomLocalidad;
    }

    public Integer getIdLocalidadUsuario() {
        return idLocalidadUsuario;
    }

    public void setIdLocalidadUsuario(Integer idLocalidadUsuario) {
        this.idLocalidadUsuario = idLocalidadUsuario;
    }

    public String getNomLocalidad() {
        return nomLocalidad;
    }

    public void setNomLocalidad(String nomLocalidad) {
        this.nomLocalidad = nomLocalidad;
    }

    public CiudadUsuario getCiudadUsuarioIdCiudadUsuario() {
        return ciudadUsuarioIdCiudadUsuario;
    }

    public void setCiudadUsuarioIdCiudadUsuario(CiudadUsuario ciudadUsuarioIdCiudadUsuario) {
        this.ciudadUsuarioIdCiudadUsuario = ciudadUsuarioIdCiudadUsuario;
    }

    public List<DireccionUsuario> getDireccionUsuarioList() {
        return direccionUsuarioList;
    }

    public void setDireccionUsuarioList(List<DireccionUsuario> direccionUsuarioList) {
        this.direccionUsuarioList = direccionUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLocalidadUsuario != null ? idLocalidadUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalidadUsuario)) {
            return false;
        }
        LocalidadUsuario other = (LocalidadUsuario) object;
        if ((this.idLocalidadUsuario == null && other.idLocalidadUsuario != null) || (this.idLocalidadUsuario != null && !this.idLocalidadUsuario.equals(other.idLocalidadUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.LocalidadUsuario[ idLocalidadUsuario=" + idLocalidadUsuario + " ]";
    }
    
}
