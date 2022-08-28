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
public class dtoProyecto {
    
    @NotBlank
     private String nombrePro;
    @NotBlank
    private String descripcioPro;
    private String Fecha;
    private String link;
    private String path;
    private String urlpro;
     

    public dtoProyecto() {
    }

    public dtoProyecto(String nombrePro, String descripcioPro, String Fecha, String link,String path,String urlpro) {
        this.nombrePro = nombrePro;
        this.descripcioPro = descripcioPro;
        this.Fecha = Fecha;
        this.link = link;
        this.path = path;
        this.urlpro = urlpro;
    }

    public String getUrlpro() {
        return urlpro;
    }

    public void setUrlpro(String urlpro) {
        this.urlpro = urlpro;
    }

    
    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    
    
    
    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcioPro() {
        return descripcioPro;
    }

    public void setDescripcioPro(String descripcioPro) {
        this.descripcioPro = descripcioPro;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
    
}
