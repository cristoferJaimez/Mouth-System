package Modelos;

/**
 *
 * @author or560
 */
public class Fidelizacion_Detalle_fidelizacion {
    private int id_detalle_fidelizacion;
    private int paciente_id_paciente;

    public Fidelizacion_Detalle_fidelizacion() {
    }

    public Fidelizacion_Detalle_fidelizacion(int id_detalle_fidelizacion, int paciente_id_paciente) {
        this.id_detalle_fidelizacion = id_detalle_fidelizacion;
        this.paciente_id_paciente = paciente_id_paciente;
    }

    public int getId_detalle_fidelizacion() {
        return id_detalle_fidelizacion;
    }

    public void setId_detalle_fidelizacion(int id_detalle_fidelizacion) {
        this.id_detalle_fidelizacion = id_detalle_fidelizacion;
    }

    public int getPaciente_id_paciente() {
        return paciente_id_paciente;
    }

    public void setPaciente_id_paciente(int paciente_id_paciente) {
        this.paciente_id_paciente = paciente_id_paciente;
    }
}
