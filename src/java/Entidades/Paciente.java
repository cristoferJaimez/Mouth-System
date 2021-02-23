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

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "paciente")
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
    , @NamedQuery(name = "Paciente.findByIdPaciente", query = "SELECT p FROM Paciente p WHERE p.idPaciente = :idPaciente")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paciente", nullable = false)
    private Integer idPaciente;
    @JoinColumn(name = "datos_usuario_num_doc", referencedColumnName = "num_doc", nullable = false)
    @ManyToOne(optional = false)
    private DatosUsuario datosUsuarioNumDoc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteIdPaciente")
    private List<HistoriaClinica> historiaClinicaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteIdPaciente")
    private List<Servicios> serviciosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteIdPaciente")
    private List<DetalleFidelizacion> detalleFidelizacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteIdPaciente")
    private List<Cita> citaList;

    public Paciente() {
    }

    public Paciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public DatosUsuario getDatosUsuarioNumDoc() {
        return datosUsuarioNumDoc;
    }

    public void setDatosUsuarioNumDoc(DatosUsuario datosUsuarioNumDoc) {
        this.datosUsuarioNumDoc = datosUsuarioNumDoc;
    }

    public List<HistoriaClinica> getHistoriaClinicaList() {
        return historiaClinicaList;
    }

    public void setHistoriaClinicaList(List<HistoriaClinica> historiaClinicaList) {
        this.historiaClinicaList = historiaClinicaList;
    }

    public List<Servicios> getServiciosList() {
        return serviciosList;
    }

    public void setServiciosList(List<Servicios> serviciosList) {
        this.serviciosList = serviciosList;
    }

    public List<DetalleFidelizacion> getDetalleFidelizacionList() {
        return detalleFidelizacionList;
    }

    public void setDetalleFidelizacionList(List<DetalleFidelizacion> detalleFidelizacionList) {
        this.detalleFidelizacionList = detalleFidelizacionList;
    }

    public List<Cita> getCitaList() {
        return citaList;
    }

    public void setCitaList(List<Cita> citaList) {
        this.citaList = citaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Paciente[ idPaciente=" + idPaciente + " ]";
    }
    
}
