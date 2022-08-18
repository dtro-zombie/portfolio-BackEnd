
package com.myportfoliona.nahuel.arias.Service;

import com.myportfoliona.nahuel.arias.Entity.Hard;
import com.myportfoliona.nahuel.arias.Repository.RHard;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SHard {
     @Autowired
    RHard rHard;
    
    
    public List<Hard> list(){
        
        return rHard.findAll();
    }
    
    public Optional<Hard> getOne(int id)
    {
        return rHard.findById(id);
    }
    
    public Optional<Hard> getByNombreHard(String nombreHard)
    {
        return rHard.findByNombreHard(nombreHard);
        
    } 
    
    public void save (Hard hard)
    {
        rHard.save(hard);
    }
    
    public void delete(int id)
    
    {
        rHard.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHard.existsById(id);
        
    }
    public boolean existsByNombreHard(String nombreHard)
    {
        return rHard.existsByNombreHard(nombreHard);
        
    }

}

