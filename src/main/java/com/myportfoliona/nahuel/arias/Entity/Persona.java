
package com.myportfoliona.nahuel.arias.Entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author arias
 */

@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    

    @NotNull
    @Size(min=1,max=50,message="longitud no valida")
    private String nombre;
    
     @NotNull
    @Size(min=1,max=50,message="longitud no valida")    
    private String apellido;
      
    
    private String img;
    
    private String path;
    
    private String Sobremi;
    
    private String titulo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String img, String path, String Sobremi, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.path = path;
        this.Sobremi = Sobremi;
        this.titulo = titulo;
    }

    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
