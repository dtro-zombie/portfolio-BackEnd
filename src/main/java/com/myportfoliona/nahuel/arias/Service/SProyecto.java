/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Service;

import com.myportfoliona.nahuel.arias.Entity.Hard;
import com.myportfoliona.nahuel.arias.Entity.Proyecto;
import com.myportfoliona.nahuel.arias.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author arias
 */
@Service
@Transactional
public class SProyecto {
    
      @Autowired
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        
        return rProyecto.findAll();
    }
    
     public Optional<Proyecto> getOne(int id)
    {
        return rProyecto.findById(id);
    }
    
    public Optional<Proyecto> getByNombrePro(String nombreProyecto)
    {
        return rProyecto.findByNombrePro(nombreProyecto);
        
    } 
    
    public void save (Proyecto proyecto)
    {
        rProyecto.save(proyecto);
    }
    
    public void delete(int id)
    
    {
        rProyecto.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyecto.existsById(id);
        
    }
    public boolean existsByNombrePro(String nombrePro)
    {
        return rProyecto.existsByNombrePro(nombrePro);
        
    }

}
