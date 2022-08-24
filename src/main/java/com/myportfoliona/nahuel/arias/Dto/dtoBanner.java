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
public class dtoBanner {
    
    @NotBlank
    private String linkBa;
    @NotBlank
    private String pathBa;

    public dtoBanner() {
    }

    public dtoBanner(String linkBa, String pathBa) {
        this.linkBa = linkBa;
        this.pathBa = pathBa;
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
