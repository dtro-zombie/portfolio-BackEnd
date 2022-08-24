/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Controller;

import com.myportfoliona.nahuel.arias.Dto.dtoBanner;
import com.myportfoliona.nahuel.arias.Dto.dtoEducacion;
import com.myportfoliona.nahuel.arias.Entity.Banner;
import com.myportfoliona.nahuel.arias.Entity.Educacion;
import com.myportfoliona.nahuel.arias.Security.Controller.Mensaje;
import com.myportfoliona.nahuel.arias.Service.SBanner;
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
@RequestMapping("banner")
@CrossOrigin(origins="http://localhost:4200")
public class CBanner {
     @Autowired
    SBanner sBanner;
    
   
    
    @GetMapping("/lista")
    public ResponseEntity<List<Banner>> list()
    {
        List<Banner> list=sBanner.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     @GetMapping("/detail/{id}")
    public ResponseEntity<Banner> getById(@PathVariable("id") int id){
        if(!sBanner.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Banner banner = sBanner.getOne(id).get();
        return new ResponseEntity(banner, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoBanner dtobanner)
    {
        if(StringUtils.isBlank(dtobanner.getLinkBa()))
         return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST); 
       
        if(sBanner.existsBylinkBa(dtobanner.getLinkBa()))
               return new ResponseEntity(new Mensaje("Esa Educacion existe"),HttpStatus.BAD_REQUEST);
               
        Banner banner= new Banner(dtobanner.getLinkBa(),dtobanner.getPathBa());
        
        sBanner.save(banner);
        
        return new ResponseEntity(new Mensaje("educacion agregada"),HttpStatus.OK);
    
    }
    
  @PutMapping("/update/{id}")  
  public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoBanner dtobanner)
  {
    if(!sBanner.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.BAD_REQUEST);
    
    if(sBanner.existsBylinkBa(dtobanner.getLinkBa()) && sBanner.getBylinkBa(dtobanner.getLinkBa()).get().getId()!= id)
        
        return new ResponseEntity(new Mensaje("Esa Educacion ya existe"),HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank(dtobanner.getLinkBa()))            
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Banner banner= sBanner.getOne(id).get();
        banner.setLinkBa(dtobanner.getLinkBa());
        banner.setPathBa(dtobanner.getPathBa());
        sBanner.save(banner);
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK );
    
            
            
            }         
  @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> delete(@PathVariable("id") int id)
    {
        if(!sBanner.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        sBanner.delete(id);
        
        return new ResponseEntity(new Mensaje("Banner eliminado"),HttpStatus.OK);
        
    }
}
