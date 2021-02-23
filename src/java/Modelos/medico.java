
package Modelos;

/**
 *
 * @author or560
 */
public class medico {
    private int id_medico;
    private Login_datos_usuario datos_usuario_num_doc;

    public medico() {
    }

    public medico(int id_medico, Login_datos_usuario datos_usuario_num_doc) {
        this.id_medico = id_medico;
        this.datos_usuario_num_doc = datos_usuario_num_doc;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public Login_datos_usuario getDatos_usuario_num_doc() {
        return datos_usuario_num_doc;
    }

    public void setDatos_usuario_num_doc(Login_datos_usuario datos_usuario_num_doc) {
        this.datos_usuario_num_doc = datos_usuario_num_doc;
    }
    
    
    
}
