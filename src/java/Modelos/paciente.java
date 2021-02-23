package Modelos;

/**
 *
 * @author Cristo
 */
public class paciente {
    
    private int id_paciente;
    private Login_datos_usuario datos_suario_num_doc;

    public paciente() {
    }

    public paciente(int id_paciente, Login_datos_usuario datos_suario_num_doc) {
        this.id_paciente = id_paciente;
        this.datos_suario_num_doc = datos_suario_num_doc;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Login_datos_usuario getDatos_suario_num_doc() {
        return datos_suario_num_doc;
    }

    public void setDatos_suario_num_doc(Login_datos_usuario datos_suario_num_doc) {
        this.datos_suario_num_doc = datos_suario_num_doc;
    }
    
    
    
}
