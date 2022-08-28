/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Controller;

import com.myportfoliona.nahuel.arias.Dto.dtoHard;
import com.myportfoliona.nahuel.arias.Entity.Hard;
import com.myportfoliona.nahuel.arias.Security.Controller.Mensaje;
import com.myportfoliona.nahuel.arias.Service.SHard;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("hard")
@CrossOrigin(origins="https://portfolio-storage-1.web.app/")
//@CrossOrigin(origins="http://localhost:4200")
public class CHard {
     @Autowired
    SHard sHard;
    
   
    
    @GetMapping("/lista")
    public ResponseEntity<List<Hard>> list()
    {
        List<Hard> list=sHard.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     @GetMapping("/detail/{id}")
    public ResponseEntity<Hard> getById(@PathVariable("id") int id){
        if(!sHard.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Hard hard = sHard.getOne(id).get();
        return new ResponseEntity(hard, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHard dtohard)
    {
        if(StringUtils.isBlank(dtohard.getNombreHard()))
         return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST); 
       
        if(sHard.existsByNombreHard(dtohard.getNombreHard()))
               return new ResponseEntity(new Mensaje("Esa HARD & SOFT SKILLS existe"),HttpStatus.BAD_REQUEST);
               
        Hard hard= new Hard(dtohard.getNombreHard(),dtohard.getPorcentaje(),dtohard.getUrlimgHard(),dtohard.getPathimgHard());
        
        sHard.save(hard);
        
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS agregada"),HttpStatus.OK);
    
    }
    @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("/update/{id}")  
  public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHard dtohard)
  {
    if(!sHard.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.BAD_REQUEST);
    
    if(sHard.existsByNombreHard(dtohard.getNombreHard()) && sHard.getByNombreHard(dtohard.getNombreHard()).get().getId()!= id)
        
        return new ResponseEntity(new Mensaje("Esa HARD & SOFT SKILLS ya existe"),HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank(dtohard.getNombreHard()))            
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Hard hard= sHard.getOne(id).get();
        hard.setNombreHard(dtohard.getNombreHard());
        hard.setPorcentaje(dtohard.getPorcentaje());
        hard.setUrlimgHard(dtohard.getUrlimgHard());
        hard.setPathimgHard(dtohard.getPathimgHard());
        sHard.save(hard);
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS actualizada"), HttpStatus.OK );
    
            
            
            }         
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> delete(@PathVariable("id") int id)
    {
        if(!sHard.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
       sHard.delete(id);
        
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS eliminada"),HttpStatus.OK);
        
    }
}
