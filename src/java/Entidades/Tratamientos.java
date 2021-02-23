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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tratamientos")
@NamedQueries({
    @NamedQuery(name = "Tratamientos.findAll", query = "SELECT t FROM Tratamientos t")
    , @NamedQuery(name = "Tratamientos.findByIdTratamientos", query = "SELECT t FROM Tratamientos t WHERE t.idTratamientos = :idTratamientos")
    , @NamedQuery(name = "Tratamientos.findByNomTratamiento", query = "SELECT t FROM Tratamientos t WHERE t.nomTratamiento = :nomTratamiento")
    , @NamedQuery(name = "Tratamientos.findByTipoTratamiento", query = "SELECT t FROM Tratamientos t WHERE t.tipoTratamiento = :tipoTratamiento")
    , @NamedQuery(name = "Tratamientos.findByObserTrata", query = "SELECT t FROM Tratamientos t WHERE t.obserTrata = :obserTrata")
    , @NamedQuery(name = "Tratamientos.findByDesTratamiento", query = "SELECT t FROM Tratamientos t WHERE t.desTratamiento = :desTratamiento")
    , @NamedQuery(name = "Tratamientos.findByRegFotografico", query = "SELECT t FROM Tratamientos t WHERE t.regFotografico = :regFotografico")
    , @NamedQuery(name = "Tratamientos.findByFechaInicio", query = "SELECT t FROM Tratamientos t WHERE t.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Tratamientos.findByFechaFin", query = "SELECT t FROM Tratamientos t WHERE t.fechaFin = :fechaFin")})
public class Tratamientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tratamientos", nullable = false)
    private Integer idTratamientos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_tratamiento", nullable = false, length = 45)
    private String nomTratamiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo_tratamiento", nullable = false, length = 45)
    private String tipoTratamiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "obser_trata", nullable = false, length = 200)
    private String obserTrata;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "des_tratamiento", nullable = false, length = 45)
    private String desTratamiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "reg_fotografico", nullable = false, length = 45)
    private String regFotografico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fin", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tratamientosIdTratamientos")
    private List<DetalleCarta> detalleCartaList;
    @JoinColumn(name = "historia_clinica_id_historia_clinica", referencedColumnName = "id_historia_clinica", nullable = false)
    @ManyToOne(optional = false)
    private HistoriaClinica historiaClinicaIdHistoriaClinica;

    public Tratamientos() {
    }

    public Tratamientos(Integer idTratamientos) {
        this.idTratamientos = idTratamientos;
    }

    public Tratamientos(Integer idTratamientos, String nomTratamiento, String tipoTratamiento, String obserTrata, String desTratamiento, String regFotografico, Date fechaInicio, Date fechaFin) {
        this.idTratamientos = idTratamientos;
        this.nomTratamiento = nomTratamiento;
        this.tipoTratamiento = tipoTratamiento;
        this.obserTrata = obserTrata;
        this.desTratamiento = desTratamiento;
        this.regFotografico = regFotografico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdTratamientos() {
        return idTratamientos;
    }

    public void setIdTratamientos(Integer idTratamientos) {
        this.idTratamientos = idTratamientos;
    }

    public String getNomTratamiento() {
        return nomTratamiento;
    }

    public void setNomTratamiento(String nomTratamiento) {
        this.nomTratamiento = nomTratamiento;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getObserTrata() {
        return obserTrata;
    }

    public void setObserTrata(String obserTrata) {
        this.obserTrata = obserTrata;
    }

    public String getDesTratamiento() {
        return desTratamiento;
    }

    public void setDesTratamiento(String desTratamiento) {
        this.desTratamiento = desTratamiento;
    }

    public String getRegFotografico() {
        return regFotografico;
    }

    public void setRegFotografico(String regFotografico) {
        this.regFotografico = regFotografico;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<DetalleCarta> getDetalleCartaList() {
        return detalleCartaList;
    }

    public void setDetalleCartaList(List<DetalleCarta> detalleCartaList) {
        this.detalleCartaList = detalleCartaList;
    }

    public HistoriaClinica getHistoriaClinicaIdHistoriaClinica() {
        return historiaClinicaIdHistoriaClinica;
    }

    public void setHistoriaClinicaIdHistoriaClinica(HistoriaClinica historiaClinicaIdHistoriaClinica) {
        this.historiaClinicaIdHistoriaClinica = historiaClinicaIdHistoriaClinica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTratamientos != null ? idTratamientos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tratamientos)) {
            return false;
        }
        Tratamientos other = (Tratamientos) object;
        if ((this.idTratamientos == null && other.idTratamientos != null) || (this.idTratamientos != null && !this.idTratamientos.equals(other.idTratamientos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tratamientos[ idTratamientos=" + idTratamientos + " ]";
    }
    
}
