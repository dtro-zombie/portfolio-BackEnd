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
public class Banner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String linkBa;
    private String pathBa;

    public Banner() {
    }

    public Banner(String linkBa, String pathBa) {
        this.linkBa = linkBa;
        this.pathBa = pathBa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkBa() {
        return linkBa;
    }

    public void setLinkBa(String linkBa) {
        this.linkBa = linkBa;
    }

    public String getPathBa() {
        return pathBa;
    }

    public void setPathBa(String pathBa) {
        this.pathBa = pathBa;
    }
    
    
    
    
    
}
