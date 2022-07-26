
package com.myportfoliona.nahuel.arias.Controller;

import com.myportfoliona.nahuel.arias.Dto.dtoEducacion;

import com.myportfoliona.nahuel.arias.Entity.Educacion;

import com.myportfoliona.nahuel.arias.Security.Controller.Mensaje;
import com.myportfoliona.nahuel.arias.Service.SEducacion;
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
@RequestMapping("edu")
@CrossOrigin(origins="https://portfolio-storage-1.web.app/")
//@CrossOrigin(origins="http://localhost:4200")
public class CEducacion {
     @Autowired
    SEducacion sEducacion;
    
   
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list()
    {
        List<Educacion> list=sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoedu)
    {
        if(StringUtils.isBlank(dtoedu.getNombreEdu()))
         return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST); 
       
        if(sEducacion.existsByNombreEdu(dtoedu.getNombreEdu()))
               return new ResponseEntity(new Mensaje("Esa Educacion existe"),HttpStatus.BAD_REQUEST);
               
        Educacion educacion= new Educacion(dtoedu.getNombreEdu(),dtoedu.getDescripcionEdu(),dtoedu.getPathimgEdu(),dtoedu.getUrlimgEdu(),dtoedu.getPeriodo());
        
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("educacion agregada"),HttpStatus.OK);
    
    }
    @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("/update/{id}")  
  public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu)
  {
    if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.BAD_REQUEST);
    
    if(sEducacion.existsByNombreEdu(dtoedu.getNombreEdu()) && sEducacion.getByNombreEdu(dtoedu.getNombreEdu()).get().getId()!= id)
        
        return new ResponseEntity(new Mensaje("Esa Educacion ya existe"),HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank(dtoedu.getNombreEdu()))            
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion= sEducacion.getOne(id).get();
        educacion.setNombreEdu(dtoedu.getNombreEdu());
        educacion.setDescripcionEdu(dtoedu.getDescripcionEdu());
        educacion.setUrlimgEdu(dtoedu.getUrlimgEdu());
        educacion.setPathimgEdu(dtoedu.getPathimgEdu());
        educacion.setPeriodo(dtoedu.getPeriodo());
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK );
    
            
            
            }         
  @PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> delete(@PathVariable("id") int id)
    {
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        sEducacion.delete(id);
        
        return new ResponseEntity(new Mensaje("Educacion eliminada"),HttpStatus.OK);
        
    }
    
}
