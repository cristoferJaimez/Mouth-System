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
import javax.validation.constraints.Size;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "direccion_usuario")
@NamedQueries({
    @NamedQuery(name = "DireccionUsuario.findAll", query = "SELECT d FROM DireccionUsuario d")
    , @NamedQuery(name = "DireccionUsuario.findByIdDireccionUsuario", query = "SELECT d FROM DireccionUsuario d WHERE d.idDireccionUsuario = :idDireccionUsuario")
    , @NamedQuery(name = "DireccionUsuario.findByDireccion", query = "SELECT d FROM DireccionUsuario d WHERE d.direccion = :direccion")})
public class DireccionUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_direccion_usuario", nullable = false)
    private Integer idDireccionUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;
    @JoinColumn(name = "id_ciudad_usuario", referencedColumnName = "id_ciudad_usuario", nullable = false)
    @ManyToOne(optional = false)
    private CiudadUsuario idCiudadUsuario;
    @JoinColumn(name = "datos_usuario_num_doc", referencedColumnName = "num_doc", nullable = false)
    @ManyToOne(optional = false)
    private DatosUsuario datosUsuarioNumDoc;
    @JoinColumn(name = "id_localidad_usuario", referencedColumnName = "id_localidad_usuario", nullable = false)
    @ManyToOne(optional = false)
    private LocalidadUsuario idLocalidadUsuario;
    @JoinColumn(name = "id_pais_usuario", referencedColumnName = "id_pais_usuario", nullable = false)
    @ManyToOne(optional = false)
    private PaisUsuario idPaisUsuario;
    @JoinColumn(name = "region_id_region", referencedColumnName = "id_region", nullable = false)
    @ManyToOne(optional = false)
    private Region regionIdRegion;

    public DireccionUsuario() {
    }

    public DireccionUsuario(Integer idDireccionUsuario) {
        this.idDireccionUsuario = idDireccionUsuario;
    }

    public DireccionUsuario(Integer idDireccionUsuario, String direccion) {
        this.idDireccionUsuario = idDireccionUsuario;
        this.direccion = direccion;
    }

    public Integer getIdDireccionUsuario() {
        return idDireccionUsuario;
    }

    public void setIdDireccionUsuario(Integer idDireccionUsuario) {
        this.idDireccionUsuario = idDireccionUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CiudadUsuario getIdCiudadUsuario() {
        return idCiudadUsuario;
    }

    public void setIdCiudadUsuario(CiudadUsuario idCiudadUsuario) {
        this.idCiudadUsuario = idCiudadUsuario;
    }

    public DatosUsuario getDatosUsuarioNumDoc() {
        return datosUsuarioNumDoc;
    }

    public void setDatosUsuarioNumDoc(DatosUsuario datosUsuarioNumDoc) {
        this.datosUsuarioNumDoc = datosUsuarioNumDoc;
    }

    public LocalidadUsuario getIdLocalidadUsuario() {
        return idLocalidadUsuario;
    }

    public void setIdLocalidadUsuario(LocalidadUsuario idLocalidadUsuario) {
        this.idLocalidadUsuario = idLocalidadUsuario;
    }

    public PaisUsuario getIdPaisUsuario() {
        return idPaisUsuario;
    }

    public void setIdPaisUsuario(PaisUsuario idPaisUsuario) {
        this.idPaisUsuario = idPaisUsuario;
    }

    public Region getRegionIdRegion() {
        return regionIdRegion;
    }

    public void setRegionIdRegion(Region regionIdRegion) {
        this.regionIdRegion = regionIdRegion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccionUsuario != null ? idDireccionUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DireccionUsuario)) {
            return false;
        }
        DireccionUsuario other = (DireccionUsuario) object;
        if ((this.idDireccionUsuario == null && other.idDireccionUsuario != null) || (this.idDireccionUsuario != null && !this.idDireccionUsuario.equals(other.idDireccionUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DireccionUsuario[ idDireccionUsuario=" + idDireccionUsuario + " ]";
    }
    
}
