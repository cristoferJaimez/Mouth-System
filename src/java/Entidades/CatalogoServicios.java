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
@Table(name = "catalogo_servicios")
@NamedQueries({
    @NamedQuery(name = "CatalogoServicios.findAll", query = "SELECT c FROM CatalogoServicios c")
    , @NamedQuery(name = "CatalogoServicios.findByIdCatalogoServicios", query = "SELECT c FROM CatalogoServicios c WHERE c.idCatalogoServicios = :idCatalogoServicios")
    , @NamedQuery(name = "CatalogoServicios.findByNomServicio", query = "SELECT c FROM CatalogoServicios c WHERE c.nomServicio = :nomServicio")
    , @NamedQuery(name = "CatalogoServicios.findByDescripcion", query = "SELECT c FROM CatalogoServicios c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatalogoServicios.findByDescuentoServicio", query = "SELECT c FROM CatalogoServicios c WHERE c.descuentoServicio = :descuentoServicio")
    , @NamedQuery(name = "CatalogoServicios.findByCostoServicio", query = "SELECT c FROM CatalogoServicios c WHERE c.costoServicio = :costoServicio")
    , @NamedQuery(name = "CatalogoServicios.findByImgServicio", query = "SELECT c FROM CatalogoServicios c WHERE c.imgServicio = :imgServicio")})
public class CatalogoServicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_catalogo_servicios", nullable = false)
    private Integer idCatalogoServicios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_servicio", nullable = false, length = 45)
    private String nomServicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "descripcion", nullable = false, length = 500)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento_servicio", nullable = false)
    private int descuentoServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "costo_servicio", nullable = false)
    private int costoServicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "img_servicio", nullable = false, length = 45)
    private String imgServicio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoServicios")
    private List<Servicios> serviciosList;

    public CatalogoServicios() {
    }

    public CatalogoServicios(Integer idCatalogoServicios) {
        this.idCatalogoServicios = idCatalogoServicios;
    }

    public CatalogoServicios(Integer idCatalogoServicios, String nomServicio, String descripcion, int descuentoServicio, int costoServicio, String imgServicio) {
        this.idCatalogoServicios = idCatalogoServicios;
        this.nomServicio = nomServicio;
        this.descripcion = descripcion;
        this.descuentoServicio = descuentoServicio;
        this.costoServicio = costoServicio;
        this.imgServicio = imgServicio;
    }

    public Integer getIdCatalogoServicios() {
        return idCatalogoServicios;
    }

    public void setIdCatalogoServicios(Integer idCatalogoServicios) {
        this.idCatalogoServicios = idCatalogoServicios;
    }

    public String getNomServicio() {
        return nomServicio;
    }

    public void setNomServicio(String nomServicio) {
        this.nomServicio = nomServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDescuentoServicio() {
        return descuentoServicio;
    }

    public void setDescuentoServicio(int descuentoServicio) {
        this.descuentoServicio = descuentoServicio;
    }

    public int getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(int costoServicio) {
        this.costoServicio = costoServicio;
    }

    public String getImgServicio() {
        return imgServicio;
    }

    public void setImgServicio(String imgServicio) {
        this.imgServicio = imgServicio;
    }

    public List<Servicios> getServiciosList() {
        return serviciosList;
    }

    public void setServiciosList(List<Servicios> serviciosList) {
        this.serviciosList = serviciosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoServicios != null ? idCatalogoServicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoServicios)) {
            return false;
        }
        CatalogoServicios other = (CatalogoServicios) object;
        if ((this.idCatalogoServicios == null && other.idCatalogoServicios != null) || (this.idCatalogoServicios != null && !this.idCatalogoServicios.equals(other.idCatalogoServicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CatalogoServicios[ idCatalogoServicios=" + idCatalogoServicios + " ]";
    }
    
}
