
package com.myportfoliona.nahuel.arias.Service;

import com.myportfoliona.nahuel.arias.Entity.Persona;
import com.myportfoliona.nahuel.arias.Interface.IPersonaService;
import com.myportfoliona.nahuel.arias.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author arias
 */
@Service
public class ImpPersonaService implements IPersonaService{

    @Autowired IPersonaRepository IPersonaRepository;
    
    
    
    @Override
    public List<Persona> getPersona() {
  
            List<Persona> persona= IPersonaRepository.findAll();
        return persona;
    
    }

    @Override
    public void savePersona(Persona persona) {
    
        IPersonaRepository.save(persona);
    
    }

    @Override
    public void deletePersona(Long id) {
    
               IPersonaRepository.deleteById(id);
        
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = IPersonaRepository.findById(id).orElse(null);
        
    
        return persona; 
    }
    
}
