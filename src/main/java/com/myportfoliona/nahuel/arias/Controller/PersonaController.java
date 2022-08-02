
package com.myportfoliona.nahuel.arias.Controller;

import com.myportfoliona.nahuel.arias.Entity.Persona;
import com.myportfoliona.nahuel.arias.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author arias
 */

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class PersonaController {
    
    @Autowired IPersonaService ipersonaservice;
     
    
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaservice.getPersona();
            
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/personas/crear")
    public String crearPersona(@RequestBody Persona persona){
        
        ipersonaservice.savePersona(persona);
        return "la persona fue creada correctamente";
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
   public String deletePersona(@PathVariable Long id) {
        ipersonaservice.deletePersona(id);
        
        return "la persona se borro correctamente";
    }
    @PreAuthorize("hasRole('ADMIN')")
   @PutMapping("personas/editar/{id}")
   public Persona editPersona(@PathVariable Long id,
                              @RequestParam("nombre") String nuevoNombre,
                              @RequestParam("apellido") String nuevoApellido,
                              @RequestParam("img") String nuevoImg){
       Persona persona = ipersonaservice.findPersona(id);
       persona.setNombre(nuevoNombre);
       persona.setApellido(nuevoApellido);
       persona.setImg(nuevoImg);
       ipersonaservice.savePersona(persona);
       return persona;
       
   }
    
   @GetMapping("/personas/traer/perfil")
   public Persona findPersona()
   {
  
       return ipersonaservice.findPersona((long)3);
   }
    
    
}
