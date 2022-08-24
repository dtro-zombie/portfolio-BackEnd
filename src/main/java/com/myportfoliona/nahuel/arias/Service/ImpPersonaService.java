
package com.myportfoliona.nahuel.arias.Service;

import com.myportfoliona.nahuel.arias.Entity.Persona;
import com.myportfoliona.nahuel.arias.Interface.IPersonaService;
import com.myportfoliona.nahuel.arias.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author arias
 */
@Service
public class ImpPersonaService {

    @Autowired IPersonaRepository IPersonaRepository;
    
    
    
     public List<Persona> list(){
        
        return IPersonaRepository.findAll();
    }
    
    public Optional<Persona> getOne(int id)
    {
        return IPersonaRepository.findById(id);
    }
    
    public Optional<Persona> getBynombre(String persona)
    {
        return IPersonaRepository.findBynombre(persona);
        
    } 
    
    public void save (Persona persona)
    {
        IPersonaRepository.save(persona);
    }
    
    public void delete(int id)
    
    {
       IPersonaRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return IPersonaRepository.existsById(id);
        
    }
    public boolean existsBynombre(String nombre)
    {
        return IPersonaRepository.existsBynombre(nombre);
        
    }
    
}
