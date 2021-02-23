
package Modelos;

/**
 *
 * @author or560
 */
public class HistoriaClinica_detalle_historia {
   private int id_detalle_historia;
   private HistoriaClinica_historia_clinica historia_clinica_id_historia_clinica;
   private medico id_medico;

    public HistoriaClinica_detalle_historia() {
    }

    public HistoriaClinica_detalle_historia(int id_detalle_historia, HistoriaClinica_historia_clinica historia_clinica_id_historia_clinica, medico id_medico) {
        this.id_detalle_historia = id_detalle_historia;
        this.historia_clinica_id_historia_clinica = historia_clinica_id_historia_clinica;
        this.id_medico = id_medico;
    }

    public int getId_detalle_historia() {
        return id_detalle_historia;
    }

    public void setId_detalle_historia(int id_detalle_historia) {
        this.id_detalle_historia = id_detalle_historia;
    }

    public HistoriaClinica_historia_clinica getHistoria_clinica_id_historia_clinica() {
        return historia_clinica_id_historia_clinica;
    }

    public void setHistoria_clinica_id_historia_clinica(HistoriaClinica_historia_clinica historia_clinica_id_historia_clinica) {
        this.historia_clinica_id_historia_clinica = historia_clinica_id_historia_clinica;
    }

    public medico getId_medico() {
        return id_medico;
    }

    public void setId_medico(medico id_medico) {
        this.id_medico = id_medico;
    }
   
   
 
  
}
