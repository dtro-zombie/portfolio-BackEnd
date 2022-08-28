
package com.myportfoliona.nahuel.arias.Controller;

import com.myportfoliona.nahuel.arias.Dto.dtoPersona;
import com.myportfoliona.nahuel.arias.Entity.Persona;
import com.myportfoliona.nahuel.arias.Security.Controller.Mensaje;
import com.myportfoliona.nahuel.arias.Service.ImpPersonaService;
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

/**
 *
 * @author arias
 */

@RestController
@RequestMapping("personas")
@CrossOrigin(origins="http://localhost:4200/")
public class PersonaController {
    
    @Autowired ImpPersonaService ipersonaservice;
     
      @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list()
    {
        List<Persona> list=ipersonaservice.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id){
        if(!ipersonaservice.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Persona persona = ipersonaservice.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoPersona dtoPersona)
    {
        if(StringUtils.isBlank(dtoPersona.getNombre()))
         return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST); 
       
        if(ipersonaservice.existsBynombre(dtoPersona.getNombre()))
               return new ResponseEntity(new Mensaje("Esa HARD & SOFT SKILLS existe"),HttpStatus.BAD_REQUEST);
               
        Persona persona= new Persona(dtoPersona.getNombre()
                ,dtoPersona.getApellido()
                ,dtoPersona.getImg()
                ,dtoPersona.getPath()
                ,dtoPersona.getSobremi()
                ,dtoPersona.getTitulo());
        
        ipersonaservice.save(persona);
        
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS agregada"),HttpStatus.OK);
    
    }
    @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("/update/{id}")  
  public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopersona)
  {
    if(!ipersonaservice.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.BAD_REQUEST);
    
    if(ipersonaservice.existsBynombre(dtopersona.getNombre()) && ipersonaservice.getBynombre(dtopersona.getNombre()).get().getId()!= id)
        
        return new ResponseEntity(new Mensaje("Esa HARD & SOFT SKILLS ya existe"),HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank(dtopersona.getNombre()))            
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Persona persona= ipersonaservice.getOne(id).get();
        persona.setNombre(dtopersona.getNombre());
        persona.setApellido(dtopersona.getApellido());
        persona.setImg(dtopersona.getImg());
        persona.setPath(dtopersona.getPath());
        persona.setSobremi(dtopersona.getSobremi());
        persona.setTitulo(dtopersona.getTitulo());
        ipersonaservice.save(persona);
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS actualizada"), HttpStatus.OK );
    
            
            
            }         
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> delete(@PathVariable("id") int id)
    {
        if(!ipersonaservice.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
       ipersonaservice.delete(id);
        
        return new ResponseEntity(new Mensaje("HARD & SOFT SKILLS eliminada"),HttpStatus.OK);
        
    }
    
   
    
}
