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

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "detalle_carta")
@NamedQueries({
    @NamedQuery(name = "DetalleCarta.findAll", query = "SELECT d FROM DetalleCarta d")
    , @NamedQuery(name = "DetalleCarta.findByIdDetalleCarta", query = "SELECT d FROM DetalleCarta d WHERE d.idDetalleCarta = :idDetalleCarta")})
public class DetalleCarta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_carta", nullable = false)
    private Integer idDetalleCarta;
    @JoinColumn(name = "carta_dental_id_carta_dental", referencedColumnName = "id_carta_dental", nullable = false)
    @ManyToOne(optional = false)
    private CartaDental cartaDentalIdCartaDental;
    @JoinColumn(name = "tratamientos_id_tratamientos", referencedColumnName = "id_tratamientos", nullable = false)
    @ManyToOne(optional = false)
    private Tratamientos tratamientosIdTratamientos;

    public DetalleCarta() {
    }

    public DetalleCarta(Integer idDetalleCarta) {
        this.idDetalleCarta = idDetalleCarta;
    }

    public Integer getIdDetalleCarta() {
        return idDetalleCarta;
    }

    public void setIdDetalleCarta(Integer idDetalleCarta) {
        this.idDetalleCarta = idDetalleCarta;
    }

    public CartaDental getCartaDentalIdCartaDental() {
        return cartaDentalIdCartaDental;
    }

    public void setCartaDentalIdCartaDental(CartaDental cartaDentalIdCartaDental) {
        this.cartaDentalIdCartaDental = cartaDentalIdCartaDental;
    }

    public Tratamientos getTratamientosIdTratamientos() {
        return tratamientosIdTratamientos;
    }

    public void setTratamientosIdTratamientos(Tratamientos tratamientosIdTratamientos) {
        this.tratamientosIdTratamientos = tratamientosIdTratamientos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCarta != null ? idDetalleCarta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCarta)) {
            return false;
        }
        DetalleCarta other = (DetalleCarta) object;
        if ((this.idDetalleCarta == null && other.idDetalleCarta != null) || (this.idDetalleCarta != null && !this.idDetalleCarta.equals(other.idDetalleCarta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DetalleCarta[ idDetalleCarta=" + idDetalleCarta + " ]";
    }
    
}
