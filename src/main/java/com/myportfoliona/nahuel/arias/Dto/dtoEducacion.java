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
public class dtoEducacion {
    
     @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    
    private String pathimgEdu;
    private String urlimgEdu;
    private String periodo;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEdu, String descripcionEdu, String pathimgEdu, String urlimgEdu, String periodo) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.pathimgEdu = pathimgEdu;
        this.urlimgEdu = urlimgEdu;
        this.periodo = periodo;
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
