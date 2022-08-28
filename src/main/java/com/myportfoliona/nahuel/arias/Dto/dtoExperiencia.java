
package com.myportfoliona.nahuel.arias.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    private String pathimg;
    private String urlimg;
    private String periodoE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String urlimg, String periodoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.urlimg= urlimg;
        this.periodoE=periodoE;
    }

    public String getPeriodoE() {
        return periodoE;
    }

    public void setPeriodoE(String periodoE) {
        this.periodoE = periodoE;
    }
    
    
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getUrlimg() {
        return urlimg;
    }

    public void setUrlimg(String urlimg) {
        this.urlimg = urlimg;
    }

    public String getPathimg() {
        return pathimg;
    }

    public void setPathimg(String pathimg) {
        this.pathimg = pathimg;
    }
    
    
    
    
}
