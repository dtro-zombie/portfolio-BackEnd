
package com.myportfoliona.nahuel.arias.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hard {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreHard;
    private int porcentaje;
    private String pathimgHard;
    private String urlimgHard;

    public Hard() {
    }

    public Hard(String nombreHard, int porcentaje, String pathimgHard, String urlimgHard) {
        this.nombreHard = nombreHard;
        this.porcentaje = porcentaje;
        this.pathimgHard = pathimgHard;
        this.urlimgHard = urlimgHard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreHard() {
        return nombreHard;
    }

    public void setNombreHard(String nombreHard) {
        this.nombreHard = nombreHard;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getPathimgEdu() {
        return pathimgHard;
    }

    public void setPathimgEdu(String pathimgEdu) {
        this.pathimgHard = pathimgEdu;
    }

    public String getUrlimgEdu() {
        return urlimgHard;
    }

    public void setUrlimgEdu(String urlimgEdu) {
        this.urlimgHard= urlimgEdu;
    }
    
    
    
    
}
