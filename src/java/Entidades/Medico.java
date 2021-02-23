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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Cristo
 */
@Entity
@Table(name = "medico")
@NamedQueries({
    @NamedQuery(name = "Medico.findAll", query = "SELECT m FROM Medico m")
    , @NamedQuery(name = "Medico.findByIdMedico", query = "SELECT m FROM Medico m WHERE m.idMedico = :idMedico")})
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_medico", nullable = false)
    private Integer idMedico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicoIdMedico")
    private List<DetalleHistoria> detalleHistoriaList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "medicoIdMedico")
    private Agenda agenda;
    @JoinColumn(name = "datos_usuario_num_doc", referencedColumnName = "num_doc", nullable = false)
    @ManyToOne(optional = false)
    private DatosUsuario datosUsuarioNumDoc;

    public Medico() {
    }

    public Medico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public List<DetalleHistoria> getDetalleHistoriaList() {
        return detalleHistoriaList;
    }

    public void setDetalleHistoriaList(List<DetalleHistoria> detalleHistoriaList) {
        this.detalleHistoriaList = detalleHistoriaList;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
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
        hash += (idMedico != null ? idMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.idMedico == null && other.idMedico != null) || (this.idMedico != null && !this.idMedico.equals(other.idMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Medico[ idMedico=" + idMedico + " ]";
    }
    
}
