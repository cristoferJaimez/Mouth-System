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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "region")
@NamedQueries({
    @NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r")
    , @NamedQuery(name = "Region.findByIdRegion", query = "SELECT r FROM Region r WHERE r.idRegion = :idRegion")
    , @NamedQuery(name = "Region.findByRegion", query = "SELECT r FROM Region r WHERE r.region = :region")})
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_region", nullable = false)
    private Integer idRegion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "region", nullable = false, length = 45)
    private String region;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regionIdRegion")
    private List<DireccionUsuario> direccionUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regionIdRegion")
    private List<CiudadUsuario> ciudadUsuarioList;
    @JoinColumn(name = "pais_usuario_id_pais_usuario", referencedColumnName = "id_pais_usuario", nullable = false)
    @ManyToOne(optional = false)
    private PaisUsuario paisUsuarioIdPaisUsuario;

    public Region() {
    }

    public Region(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public Region(Integer idRegion, String region) {
        this.idRegion = idRegion;
        this.region = region;
    }

    public Integer getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<DireccionUsuario> getDireccionUsuarioList() {
        return direccionUsuarioList;
    }

    public void setDireccionUsuarioList(List<DireccionUsuario> direccionUsuarioList) {
        this.direccionUsuarioList = direccionUsuarioList;
    }

    public List<CiudadUsuario> getCiudadUsuarioList() {
        return ciudadUsuarioList;
    }

    public void setCiudadUsuarioList(List<CiudadUsuario> ciudadUsuarioList) {
        this.ciudadUsuarioList = ciudadUsuarioList;
    }

    public PaisUsuario getPaisUsuarioIdPaisUsuario() {
        return paisUsuarioIdPaisUsuario;
    }

    public void setPaisUsuarioIdPaisUsuario(PaisUsuario paisUsuarioIdPaisUsuario) {
        this.paisUsuarioIdPaisUsuario = paisUsuarioIdPaisUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegion != null ? idRegion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Region)) {
            return false;
        }
        Region other = (Region) object;
        if ((this.idRegion == null && other.idRegion != null) || (this.idRegion != null && !this.idRegion.equals(other.idRegion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Region[ idRegion=" + idRegion + " ]";
    }
    
}
