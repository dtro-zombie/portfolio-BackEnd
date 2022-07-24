
package com.myportfoliona.nahuel.arias.Interface;

import com.myportfoliona.nahuel.arias.Entity.Persona;
import java.util.List;


/**
 *
 * @author arias
 */
public interface IPersonaService {
    
    //traer una lista de personas
    
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero se busca por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    
    public Persona findPersona (Long id);
    
    
    
    
    
}
