
package Modelos;

import java.sql.Date;

/**
 *
 * @author or560
 */
public class HistoriaClinica_Tratamientos {
    private int id_tratamientos;
    private String nom_tratamiento;
    private String tipo_tratamiento;
    private String obser_trata;
    private String des_tratamiento;
    private String reg_fotografico;
    private Date fecha_inicio;
    private Date fecha_fin;
    private HistoriaClinica_historia_clinica id_historia_clinica;

    public HistoriaClinica_Tratamientos() {
    }

    public HistoriaClinica_Tratamientos(int id_tratamientos, String nom_tratamiento, String tipo_tratamiento, String obser_trata, String des_tratamiento, String reg_fotografico, Date fecha_inicio, Date fecha_fin, HistoriaClinica_historia_clinica id_historia_clinica) {
        this.id_tratamientos = id_tratamientos;
        this.nom_tratamiento = nom_tratamiento;
        this.tipo_tratamiento = tipo_tratamiento;
        this.obser_trata = obser_trata;
        this.des_tratamiento = des_tratamiento;
        this.reg_fotografico = reg_fotografico;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.id_historia_clinica = id_historia_clinica;
    }

    public int getId_tratamientos() {
        return id_tratamientos;
    }

    public void setId_tratamientos(int id_tratamientos) {
        this.id_tratamientos = id_tratamientos;
    }

    public String getNom_tratamiento() {
        return nom_tratamiento;
    }

    public void setNom_tratamiento(String nom_tratamiento) {
        this.nom_tratamiento = nom_tratamiento;
    }

    public String getTipo_tratamiento() {
        return tipo_tratamiento;
    }

    public void setTipo_tratamiento(String tipo_tratamiento) {
        this.tipo_tratamiento = tipo_tratamiento;
    }

    public String getObser_trata() {
        return obser_trata;
    }

    public void setObser_trata(String obser_trata) {
        this.obser_trata = obser_trata;
    }

    public String getDes_tratamiento() {
        return des_tratamiento;
    }

    public void setDes_tratamiento(String des_tratamiento) {
        this.des_tratamiento = des_tratamiento;
    }

    public String getReg_fotografico() {
        return reg_fotografico;
    }

    public void setReg_fotografico(String reg_fotografico) {
        this.reg_fotografico = reg_fotografico;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public HistoriaClinica_historia_clinica getId_historia_clinica() {
        return id_historia_clinica;
    }

    public void setId_historia_clinica(HistoriaClinica_historia_clinica id_historia_clinica) {
        this.id_historia_clinica = id_historia_clinica;
    }
          
}
