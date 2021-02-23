
package Modelos;

/**
 *
 * @author or560
 */
public class HistoriaClinica_detalle_carta {
    private int id_detalle_carta;
    private HistoriaClinica_carta_dental id_carta_dental;
    private HistoriaClinica_Tratamientos id_tratamientos;

    public HistoriaClinica_detalle_carta() {
    }

    public HistoriaClinica_detalle_carta(int id_detalle_carta, HistoriaClinica_carta_dental id_carta_dental, HistoriaClinica_Tratamientos id_tratamientos) {
        this.id_detalle_carta = id_detalle_carta;
        this.id_carta_dental = id_carta_dental;
        this.id_tratamientos = id_tratamientos;
    }

    public int getId_detalle_carta() {
        return id_detalle_carta;
    }

    public void setId_detalle_carta(int id_detalle_carta) {
        this.id_detalle_carta = id_detalle_carta;
    }

    public HistoriaClinica_carta_dental getId_carta_dental() {
        return id_carta_dental;
    }

    public void setId_carta_dental(HistoriaClinica_carta_dental id_carta_dental) {
        this.id_carta_dental = id_carta_dental;
    }

    public HistoriaClinica_Tratamientos getId_tratamientos() {
        return id_tratamientos;
    }

    public void setId_tratamientos(HistoriaClinica_Tratamientos id_tratamientos) {
        this.id_tratamientos = id_tratamientos;
    }

    
}
