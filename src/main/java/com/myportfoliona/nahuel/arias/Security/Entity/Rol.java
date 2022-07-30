
package com.myportfoliona.nahuel.arias.Security.Entity;

import com.myportfoliona.nahuel.arias.Security.Enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author arias
 */

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNOmbre;

    public Rol() {
    }

    public Rol(RolNombre rolNOmbre) {
        this.rolNOmbre = rolNOmbre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNOmbre() {
        return rolNOmbre;
    }

    public void setRolNOmbre(RolNombre rolNOmbre) {
        this.rolNOmbre = rolNOmbre;
    }
    
    
}
