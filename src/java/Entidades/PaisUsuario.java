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
@Table(name = "pais_usuario")
@NamedQueries({
    @NamedQuery(name = "PaisUsuario.findAll", query = "SELECT p FROM PaisUsuario p")
    , @NamedQuery(name = "PaisUsuario.findByIdPaisUsuario", query = "SELECT p FROM PaisUsuario p WHERE p.idPaisUsuario = :idPaisUsuario")
    , @NamedQuery(name = "PaisUsuario.findByNomPaisUsu", query = "SELECT p FROM PaisUsuario p WHERE p.nomPaisUsu = :nomPaisUsu")})
public class PaisUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pais_usuario", nullable = false)
    private Integer idPaisUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_pais_usu", nullable = false, length = 45)
    private String nomPaisUsu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaisUsuario")
    private List<DireccionUsuario> direccionUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paisUsuarioIdPaisUsuario")
    private List<Region> regionList;

    public PaisUsuario() {
    }

    public PaisUsuario(Integer idPaisUsuario) {
        this.idPaisUsuario = idPaisUsuario;
    }

    public PaisUsuario(Integer idPaisUsuario, String nomPaisUsu) {
        this.idPaisUsuario = idPaisUsuario;
        this.nomPaisUsu = nomPaisUsu;
    }

    public Integer getIdPaisUsuario() {
        return idPaisUsuario;
    }

    public void setIdPaisUsuario(Integer idPaisUsuario) {
        this.idPaisUsuario = idPaisUsuario;
    }

    public String getNomPaisUsu() {
        return nomPaisUsu;
    }

    public void setNomPaisUsu(String nomPaisUsu) {
        this.nomPaisUsu = nomPaisUsu;
    }

    public List<DireccionUsuario> getDireccionUsuarioList() {
        return direccionUsuarioList;
    }

    public void setDireccionUsuarioList(List<DireccionUsuario> direccionUsuarioList) {
        this.direccionUsuarioList = direccionUsuarioList;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaisUsuario != null ? idPaisUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaisUsuario)) {
            return false;
        }
        PaisUsuario other = (PaisUsuario) object;
        if ((this.idPaisUsuario == null && other.idPaisUsuario != null) || (this.idPaisUsuario != null && !this.idPaisUsuario.equals(other.idPaisUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.PaisUsuario[ idPaisUsuario=" + idPaisUsuario + " ]";
    }
    
}
