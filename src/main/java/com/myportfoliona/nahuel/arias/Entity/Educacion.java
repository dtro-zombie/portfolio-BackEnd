
package com.myportfoliona.nahuel.arias.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 @Entity
public class Educacion {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String descripcionEdu;
    private String pathimgEdu;
    private String urlimgEdu;
    private String periodo;

    public Educacion() {
    }

    public Educacion(String nombreEdu, String descripcionEdu, String pathimgEdu, String urlimgEdu, String periodo) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.pathimgEdu = pathimgEdu;
        this.urlimgEdu = urlimgEdu;
        this.periodo = periodo;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getPathimgEdu() {
        return pathimgEdu;
    }

    public void setPathimgEdu(String pathimgEdu) {
        this.pathimgEdu = pathimgEdu;
    }

    public String getUrlimgEdu() {
        return urlimgEdu;
    }

    public void setUrlimgEdu(String urlimgEdu) {
        this.urlimgEdu = urlimgEdu;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
}
