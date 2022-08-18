/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String pathimg;
    private String urlimg;
    
    
   //constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE,String urlimg,String pathimg) {
        
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.urlimg= urlimg;
        this.pathimg=pathimg;
    }
    
    public String getPathimg() {
        return pathimg;
    }

    //getters and setters
    public void setPathimg(String pathimg) {
        this.pathimg = pathimg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
}
