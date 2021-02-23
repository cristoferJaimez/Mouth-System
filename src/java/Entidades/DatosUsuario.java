/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "datos_usuario")
@NamedQueries({
    @NamedQuery(name = "DatosUsuario.findAll", query = "SELECT d FROM DatosUsuario d")
    , @NamedQuery(name = "DatosUsuario.findByNumDoc", query = "SELECT d FROM DatosUsuario d WHERE d.numDoc = :numDoc")
    , @NamedQuery(name = "DatosUsuario.findByPriNom", query = "SELECT d FROM DatosUsuario d WHERE d.priNom = :priNom")
    , @NamedQuery(name = "DatosUsuario.findBySegNom", query = "SELECT d FROM DatosUsuario d WHERE d.segNom = :segNom")
    , @NamedQuery(name = "DatosUsuario.findByPriApe", query = "SELECT d FROM DatosUsuario d WHERE d.priApe = :priApe")
    , @NamedQuery(name = "DatosUsuario.findBySegApe", query = "SELECT d FROM DatosUsuario d WHERE d.segApe = :segApe")
    , @NamedQuery(name = "DatosUsuario.findByTipoDoc", query = "SELECT d FROM DatosUsuario d WHERE d.tipoDoc = :tipoDoc")
    , @NamedQuery(name = "DatosUsuario.findByFechaNac", query = "SELECT d FROM DatosUsuario d WHERE d.fechaNac = :fechaNac")
    , @NamedQuery(name = "DatosUsuario.findByNacionalidad", query = "SELECT d FROM DatosUsuario d WHERE d.nacionalidad = :nacionalidad")})
public class DatosUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "num_doc", nullable = false, length = 45)
    private String numDoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pri_nom", nullable = false, length = 45)
    private String priNom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "seg_nom", nullable = false, length = 45)
    private String segNom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pri_ape", nullable = false, length = 45)
    private String priApe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "seg_ape", nullable = false, length = 45)
    private String segApe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo_doc", nullable = false, length = 45)
    private String tipoDoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nac", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nacionalidad", nullable = false, length = 45)
    private String nacionalidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datosUsuarioNumDoc")
    private List<UsuariosLogin> usuariosLoginList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datosUsuarioNumDoc")
    private List<Paciente> pacienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datosUsuarioNumDoc")
    private List<Inventario> inventarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datosUsuarioNumDoc")
    private List<DireccionUsuario> direccionUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datosUsuarioNumDoc")
    private List<ContactoUsuario> contactoUsuarioList;
    @JoinColumn(name = "tipo_usuario_id_tipo_usuario", referencedColumnName = "id_tipo_usuario", nullable = false)
    @ManyToOne(optional = false)
    private TipoUsuario tipoUsuarioIdTipoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datosUsuarioNumDoc")
    private List<Medico> medicoList;

    public DatosUsuario() {
    }

    public DatosUsuario(String numDoc) {
        this.numDoc = numDoc;
    }

    public DatosUsuario(String numDoc, String priNom, String segNom, String priApe, String segApe, String tipoDoc, Date fechaNac, String nacionalidad) {
        this.numDoc = numDoc;
        this.priNom = priNom;
        this.segNom = segNom;
        this.priApe = priApe;
        this.segApe = segApe;
        this.tipoDoc = tipoDoc;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getPriNom() {
        return priNom;
    }

    public void setPriNom(String priNom) {
        this.priNom = priNom;
    }

    public String getSegNom() {
        return segNom;
    }

    public void setSegNom(String segNom) {
        this.segNom = segNom;
    }

    public String getPriApe() {
        return priApe;
    }

    public void setPriApe(String priApe) {
        this.priApe = priApe;
    }

    public String getSegApe() {
        return segApe;
    }

    public void setSegApe(String segApe) {
        this.segApe = segApe;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<UsuariosLogin> getUsuariosLoginList() {
        return usuariosLoginList;
    }

    public void setUsuariosLoginList(List<UsuariosLogin> usuariosLoginList) {
        this.usuariosLoginList = usuariosLoginList;
    }

    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    public List<DireccionUsuario> getDireccionUsuarioList() {
        return direccionUsuarioList;
    }

    public void setDireccionUsuarioList(List<DireccionUsuario> direccionUsuarioList) {
        this.direccionUsuarioList = direccionUsuarioList;
    }

    public List<ContactoUsuario> getContactoUsuarioList() {
        return contactoUsuarioList;
    }

    public void setContactoUsuarioList(List<ContactoUsuario> contactoUsuarioList) {
        this.contactoUsuarioList = contactoUsuarioList;
    }

    public TipoUsuario getTipoUsuarioIdTipoUsuario() {
        return tipoUsuarioIdTipoUsuario;
    }

    public void setTipoUsuarioIdTipoUsuario(TipoUsuario tipoUsuarioIdTipoUsuario) {
        this.tipoUsuarioIdTipoUsuario = tipoUsuarioIdTipoUsuario;
    }

    public List<Medico> getMedicoList() {
        return medicoList;
    }

    public void setMedicoList(List<Medico> medicoList) {
        this.medicoList = medicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numDoc != null ? numDoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosUsuario)) {
            return false;
        }
        DatosUsuario other = (DatosUsuario) object;
        if ((this.numDoc == null && other.numDoc != null) || (this.numDoc != null && !this.numDoc.equals(other.numDoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DatosUsuario[ numDoc=" + numDoc + " ]";
    }
    
}
