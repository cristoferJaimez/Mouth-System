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
@Table(name = "carta_dental")
@NamedQueries({
    @NamedQuery(name = "CartaDental.findAll", query = "SELECT c FROM CartaDental c")
    , @NamedQuery(name = "CartaDental.findByIdCartaDental", query = "SELECT c FROM CartaDental c WHERE c.idCartaDental = :idCartaDental")
    , @NamedQuery(name = "CartaDental.findByDiente", query = "SELECT c FROM CartaDental c WHERE c.diente = :diente")
    , @NamedQuery(name = "CartaDental.findByUbicacion", query = "SELECT c FROM CartaDental c WHERE c.ubicacion = :ubicacion")})
public class CartaDental implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carta_dental", nullable = false)
    private Integer idCartaDental;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "diente", nullable = false, length = 45)
    private String diente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ubicacion", nullable = false, length = 45)
    private String ubicacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartaDentalIdCartaDental")
    private List<DetalleCarta> detalleCartaList;

    public CartaDental() {
    }

    public CartaDental(Integer idCartaDental) {
        this.idCartaDental = idCartaDental;
    }

    public CartaDental(Integer idCartaDental, String diente, String ubicacion) {
        this.idCartaDental = idCartaDental;
        this.diente = diente;
        this.ubicacion = ubicacion;
    }

    public Integer getIdCartaDental() {
        return idCartaDental;
    }

    public void setIdCartaDental(Integer idCartaDental) {
        this.idCartaDental = idCartaDental;
    }

    public String getDiente() {
        return diente;
    }

    public void setDiente(String diente) {
        this.diente = diente;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<DetalleCarta> getDetalleCartaList() {
        return detalleCartaList;
    }

    public void setDetalleCartaList(List<DetalleCarta> detalleCartaList) {
        this.detalleCartaList = detalleCartaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCartaDental != null ? idCartaDental.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartaDental)) {
            return false;
        }
        CartaDental other = (CartaDental) object;
        if ((this.idCartaDental == null && other.idCartaDental != null) || (this.idCartaDental != null && !this.idCartaDental.equals(other.idCartaDental))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CartaDental[ idCartaDental=" + idCartaDental + " ]";
    }
    
}
