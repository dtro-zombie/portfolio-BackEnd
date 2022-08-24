/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Controller;

import com.myportfoliona.nahuel.arias.Dto.dtoHard;
import com.myportfoliona.nahuel.arias.Dto.dtoProyecto;
import com.myportfoliona.nahuel.arias.Entity.Hard;
import com.myportfoliona.nahuel.arias.Entity.Proyecto;
import com.myportfoliona.nahuel.arias.Security.Controller.Mensaje;
import com.myportfoliona.nahuel.arias.Service.SProyecto;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 *
 * @author arias
 */


@RestController
@RequestMapping("proyecto")
@CrossOrigin(origins="http://localhost:4200")
public class CProyecto {
    
   @Autowired
    SProyecto sProyecto;
     

	 @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> list()
    {
        List<Proyecto> list=sProyecto.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     @GetMapping("/detail/{id}")
    public ResponseEntity<Hard> getById(@PathVariable("id") int id){
        if(!sProyecto.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyecto proyecto = sProyecto.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyecto dtoproyecto)
    {
        if(StringUtils.isBlank(dtoproyecto.getNombrePro()))
         return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST); 
       
        if(sProyecto.existsByNombrePro(dtoproyecto.getNombrePro()))
               return new ResponseEntity(new Mensaje("Esa HARD & SOFT SKILLS existe"),HttpStatus.BAD_REQUEST);
               
        Proyecto proyecto= new Proyecto(dtoproyecto.getNombrePro(),dtoproyecto.getDescripcioPro() ,dtoproyecto.getFecha(),dtoproyecto.getLink());
        
        sProyecto.save(proyecto);
        
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS agregada"),HttpStatus.OK);
    
    }
    
  @PutMapping("/update/{id}")  
  public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyecto dtoproyecto)
  {
    if(!sProyecto.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.BAD_REQUEST);
    
    if(sProyecto.existsByNombrePro(dtoproyecto.getNombrePro()) && sProyecto.getByNombrePro(dtoproyecto.getNombrePro()).get().getIdProyecto()!= id)
        
        return new ResponseEntity(new Mensaje("Esa HARD & SOFT SKILLS ya existe"),HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank(dtoproyecto.getNombrePro()))            
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Proyecto proyecto= sProyecto.getOne(id).get();
        proyecto.setNombrePro(dtoproyecto.getNombrePro());
        proyecto.setDescripcioPro(dtoproyecto.getDescripcioPro());
        proyecto.setFecha(dtoproyecto.getFecha());
        proyecto.setLink(dtoproyecto.getLink());
        sProyecto.save(proyecto);
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS actualizada"), HttpStatus.OK );
    
            
            
            }         
  @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> delete(@PathVariable("id") int id)
    {
        if(!sProyecto.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
       sProyecto.delete(id);
        
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS eliminada"),HttpStatus.OK);
        
    }     
     
}
