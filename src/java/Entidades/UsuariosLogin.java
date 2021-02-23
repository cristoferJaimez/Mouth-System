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
import javax.validation.constraints.Size;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "usuarios_login")
@NamedQueries({
    @NamedQuery(name = "UsuariosLogin.findAll", query = "SELECT u FROM UsuariosLogin u")
    , @NamedQuery(name = "UsuariosLogin.findByIdLogin", query = "SELECT u FROM UsuariosLogin u WHERE u.idLogin = :idLogin")
    , @NamedQuery(name = "UsuariosLogin.findByEmailUsu", query = "SELECT u FROM UsuariosLogin u WHERE u.emailUsu = :emailUsu")
    , @NamedQuery(name = "UsuariosLogin.findByContrasenna", query = "SELECT u FROM UsuariosLogin u WHERE u.contrasenna = :contrasenna")})
public class UsuariosLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_login", nullable = false)
    private Integer idLogin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "email_usu", nullable = false, length = 40)
    private String emailUsu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "contrasenna", nullable = false, length = 45)
    private String contrasenna;
    @JoinColumn(name = "datos_usuario_num_doc", referencedColumnName = "num_doc", nullable = false)
    @ManyToOne(optional = false)
    private DatosUsuario datosUsuarioNumDoc;

    public UsuariosLogin() {
    }

    public UsuariosLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public UsuariosLogin(Integer idLogin, String emailUsu, String contrasenna) {
        this.idLogin = idLogin;
        this.emailUsu = emailUsu;
        this.contrasenna = contrasenna;
    }

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
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
        hash += (idLogin != null ? idLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosLogin)) {
            return false;
        }
        UsuariosLogin other = (UsuariosLogin) object;
        if ((this.idLogin == null && other.idLogin != null) || (this.idLogin != null && !this.idLogin.equals(other.idLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.UsuariosLogin[ idLogin=" + idLogin + " ]";
    }
    
}
