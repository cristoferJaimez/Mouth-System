
package Modelos;

/**
 *
 * @author or560
 */
public class HistoriaClinica_carta_dental {
    private int id_carta_dental;
    private String diente;

    public HistoriaClinica_carta_dental() {
    }

    public HistoriaClinica_carta_dental(int id_carta_dental, String diente) {
        this.id_carta_dental = id_carta_dental;
        this.diente = diente;
    }

    public int getId_carta_dental() {
        return id_carta_dental;
    }

    public void setId_carta_dental(int id_carta_dental) {
        this.id_carta_dental = id_carta_dental;
    }

    public String getDiente() {
        return diente;
    }

    public void setDiente(String diente) {
        this.diente = diente;
    }
}
