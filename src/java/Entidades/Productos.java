/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "productos")
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByIdProductos", query = "SELECT p FROM Productos p WHERE p.idProductos = :idProductos")
    , @NamedQuery(name = "Productos.findByNomProd", query = "SELECT p FROM Productos p WHERE p.nomProd = :nomProd")
    , @NamedQuery(name = "Productos.findByDesProd", query = "SELECT p FROM Productos p WHERE p.desProd = :desProd")
    , @NamedQuery(name = "Productos.findByFechaVen", query = "SELECT p FROM Productos p WHERE p.fechaVen = :fechaVen")
    , @NamedQuery(name = "Productos.findByCantidad", query = "SELECT p FROM Productos p WHERE p.cantidad = :cantidad")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_productos", nullable = false)
    private Integer idProductos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_prod", nullable = false, length = 45)
    private String nomProd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "des_prod", nullable = false, length = 45)
    private String desProd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ven", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaVen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @JoinColumn(name = "categoria_id_categoria", referencedColumnName = "id_categoria", nullable = false)
    @ManyToOne(optional = false)
    private Categoria categoriaIdCategoria;
    @JoinColumn(name = "id_inventario", referencedColumnName = "id_inventario", nullable = false)
    @ManyToOne(optional = false)
    private Inventario idInventario;

    public Productos() {
    }

    public Productos(Integer idProductos) {
        this.idProductos = idProductos;
    }

    public Productos(Integer idProductos, String nomProd, String desProd, Date fechaVen, int cantidad) {
        this.idProductos = idProductos;
        this.nomProd = nomProd;
        this.desProd = desProd;
        this.fechaVen = fechaVen;
        this.cantidad = cantidad;
    }

    public Integer getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getDesProd() {
        return desProd;
    }

    public void setDesProd(String desProd) {
        this.desProd = desProd;
    }

    public Date getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(Date fechaVen) {
        this.fechaVen = fechaVen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoria getCategoriaIdCategoria() {
        return categoriaIdCategoria;
    }

    public void setCategoriaIdCategoria(Categoria categoriaIdCategoria) {
        this.categoriaIdCategoria = categoriaIdCategoria;
    }

    public Inventario getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Inventario idInventario) {
        this.idInventario = idInventario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductos != null ? idProductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idProductos == null && other.idProductos != null) || (this.idProductos != null && !this.idProductos.equals(other.idProductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Productos[ idProductos=" + idProductos + " ]";
    }
    
}
