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
public class dtoPersona {

    @NotBlank

    private String nombre;

    @NotBlank

    private String apellido;

    private String img;

    private String path;

    private String Sobremi;

    private String titulo;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String img, String path, String Sobremi, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.path = path;
        this.Sobremi = Sobremi;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSobremi() {
        return Sobremi;
    }

    public void setSobremi(String Sobremi) {
        this.Sobremi = Sobremi;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
