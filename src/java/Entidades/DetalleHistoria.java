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
@Table(name = "detalle_historia")
@NamedQueries({
    @NamedQuery(name = "DetalleHistoria.findAll", query = "SELECT d FROM DetalleHistoria d")
    , @NamedQuery(name = "DetalleHistoria.findByIdDetalleHistoria", query = "SELECT d FROM DetalleHistoria d WHERE d.idDetalleHistoria = :idDetalleHistoria")})
public class DetalleHistoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_historia", nullable = false)
    private Integer idDetalleHistoria;
    @JoinColumn(name = "historia_clinica_id_historia_clinica", referencedColumnName = "id_historia_clinica", nullable = false)
    @ManyToOne(optional = false)
    private HistoriaClinica historiaClinicaIdHistoriaClinica;
    @JoinColumn(name = "medico_id_medico", referencedColumnName = "id_medico", nullable = false)
    @ManyToOne(optional = false)
    private Medico medicoIdMedico;

    public DetalleHistoria() {
    }

    public DetalleHistoria(Integer idDetalleHistoria) {
        this.idDetalleHistoria = idDetalleHistoria;
    }

    public Integer getIdDetalleHistoria() {
        return idDetalleHistoria;
    }

    public void setIdDetalleHistoria(Integer idDetalleHistoria) {
        this.idDetalleHistoria = idDetalleHistoria;
    }

    public HistoriaClinica getHistoriaClinicaIdHistoriaClinica() {
        return historiaClinicaIdHistoriaClinica;
    }

    public void setHistoriaClinicaIdHistoriaClinica(HistoriaClinica historiaClinicaIdHistoriaClinica) {
        this.historiaClinicaIdHistoriaClinica = historiaClinicaIdHistoriaClinica;
    }

    public Medico getMedicoIdMedico() {
        return medicoIdMedico;
    }

    public void setMedicoIdMedico(Medico medicoIdMedico) {
        this.medicoIdMedico = medicoIdMedico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleHistoria != null ? idDetalleHistoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleHistoria)) {
            return false;
        }
        DetalleHistoria other = (DetalleHistoria) object;
        if ((this.idDetalleHistoria == null && other.idDetalleHistoria != null) || (this.idDetalleHistoria != null && !this.idDetalleHistoria.equals(other.idDetalleHistoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DetalleHistoria[ idDetalleHistoria=" + idDetalleHistoria + " ]";
    }
    
}
