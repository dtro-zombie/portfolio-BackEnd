/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author arias
 */
 @Entity
 @Table(name = "proyectos")
public class Proyecto {
    @Id
    @Column(name="id_proyecto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProyecto;
    @Column(name="nombre")
    private String nombrePro;
    @Column(name="descripcion")
    private String descripcioPro;
    @Column(name="fecha")
    private String Fecha;
    @Column(name="link")
    private String link;
   
    
    public Proyecto() {
    }

    public Proyecto(String nombrePro, String descripcioPro, String Fecha, String link) {
        this.nombrePro = nombrePro;
        this.descripcioPro = descripcioPro;
        this.Fecha = Fecha;
        this.link = link;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
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