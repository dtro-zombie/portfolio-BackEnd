
package com.myportfoliona.nahuel.arias.Security.Service;

import com.myportfoliona.nahuel.arias.Security.Entity.Usuario;
import com.myportfoliona.nahuel.arias.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {
    
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario)
    {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existByNombreUsuario(String nombreUsuario)
    {
        return iusuarioRepository.existByNombreUsuario(nombreUsuario);
    }
    
     public boolean existByEmail(String email)
    {
        return iusuarioRepository.existByEmail(email);
    }
    
     public void save(Usuario usuario){
         
             iusuarioRepository.save(usuario);
     }
         
     
}
