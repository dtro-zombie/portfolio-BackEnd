/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author arias
 */
 @Entity
public class Proyecto {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePro;
    private String descripcioPro;
    private String Fecha;
    private String link;

    public Proyecto() {
    }

    public Proyecto(String nombrePro, String descripcioPro, String Fecha, String link) {
        this.nombrePro = nombrePro;
        this.descripcioPro = descripcioPro;
        this.Fecha = Fecha;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
