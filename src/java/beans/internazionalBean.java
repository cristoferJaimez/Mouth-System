/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
/**
 *
 * @author Cristo
 */
public class internazionalBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String localidad;
    private static Map< String, Object> listaPaises;

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Map<String, Object> getListaPaises() {
        return listaPaises;
    }

    public static void setListaPaises(Map<String, Object> listaPaises) {
        internazionalBean.listaPaises = listaPaises;
    }

    // llenar lista de paises
    //intanciamos
    static {
        listaPaises = new LinkedHashMap<>();

        Locale espanol = new Locale("es");
        listaPaises.put("Español", espanol);
        listaPaises.put("English", Locale.ENGLISH);
        listaPaises.put("Germany", Locale.GERMANY);
        listaPaises.put("Italian", Locale.ITALIAN);

        

    }

    public void cambiarIdioma(ValueChangeEvent e) {

        String newIdioma = e.getNewValue().toString();

        listaPaises.entrySet().stream().filter((entry) -> (entry.getValue().toString().equals(newIdioma))).forEachOrdered((entry) -> {
            FacesContext.getCurrentInstance().getViewRoot()
                    .setLocale((Locale) entry.getValue());
        });

    }
}
