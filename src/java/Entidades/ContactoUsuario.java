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
import javax.validation.constraints.NotNull;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "contacto_usuario")
@NamedQueries({
    @NamedQuery(name = "ContactoUsuario.findAll", query = "SELECT c FROM ContactoUsuario c")
    , @NamedQuery(name = "ContactoUsuario.findByIdContactoUsuario", query = "SELECT c FROM ContactoUsuario c WHERE c.idContactoUsuario = :idContactoUsuario")
    , @NamedQuery(name = "ContactoUsuario.findByTelefonoFijo", query = "SELECT c FROM ContactoUsuario c WHERE c.telefonoFijo = :telefonoFijo")
    , @NamedQuery(name = "ContactoUsuario.findByTelefonoCelular", query = "SELECT c FROM ContactoUsuario c WHERE c.telefonoCelular = :telefonoCelular")})
public class ContactoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contacto_usuario", nullable = false)
    private Integer idContactoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono_fijo", nullable = false)
    private int telefonoFijo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono_celular", nullable = false)
    private int telefonoCelular;
    @JoinColumn(name = "datos_usuario_num_doc", referencedColumnName = "num_doc", nullable = false)
    @ManyToOne(optional = false)
    private DatosUsuario datosUsuarioNumDoc;

    public ContactoUsuario() {
    }

    public ContactoUsuario(Integer idContactoUsuario) {
        this.idContactoUsuario = idContactoUsuario;
    }

    public ContactoUsuario(Integer idContactoUsuario, int telefonoFijo, int telefonoCelular) {
        this.idContactoUsuario = idContactoUsuario;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
    }

    public Integer getIdContactoUsuario() {
        return idContactoUsuario;
    }

    public void setIdContactoUsuario(Integer idContactoUsuario) {
        this.idContactoUsuario = idContactoUsuario;
    }

    public int getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(int telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public int getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(int telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public DatosUsuario getDatosUsuarioNumDoc() {
        return datosUsuarioNumDoc;
    }

    public void setDatosUsuarioNumDoc(DatosUsuario datosUsuarioNumDoc) {
        this.datosUsuarioNumDoc = datosUsuarioNumDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContactoUsuario != null ? idContactoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactoUsuario)) {
            return false;
        }
        ContactoUsuario other = (ContactoUsuario) object;
        if ((this.idContactoUsuario == null && other.idContactoUsuario != null) || (this.idContactoUsuario != null && !this.idContactoUsuario.equals(other.idContactoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ContactoUsuario[ idContactoUsuario=" + idContactoUsuario + " ]";
    }
    
}
