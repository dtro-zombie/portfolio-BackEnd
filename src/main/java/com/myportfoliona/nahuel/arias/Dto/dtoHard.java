/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author arias
 */
public class dtoHard {
       @NotBlank
     private String nombreHard;
       @NotBlank
    private int porcentaje;
    private String pathimgHard;
    private String urlimgHard;

    public dtoHard() {
    }

    public dtoHard(String nombreHard, int porcentaje, String pathimgHard, String urlimgHard) {
        this.nombreHard = nombreHard;
        this.porcentaje = porcentaje;
        this.pathimgHard = pathimgHard;
        this.urlimgHard = urlimgHard;
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

    public String getPathimgHard() {
        return pathimgHard;
    }

    public void setPathimgHard(String pathimgHard) {
        this.pathimgHard = pathimgHard;
    }

    public String getUrlimgHard() {
        return urlimgHard;
    }

    public void setUrlimgHard(String urlimgHard) {
        this.urlimgHard = urlimgHard;
    }
    
    
    
}
