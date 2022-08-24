
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
@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    

    @NotNull
    @Size(min=1,max=50,message="longitud no valida")
    private String nombre;
    
     @NotNull
    @Size(min=1,max=50,message="longitud no valida")    
    private String apellido;
      
  
    private String img;
    
    private String path;
    
    private String Sobremi;
    
    
}
