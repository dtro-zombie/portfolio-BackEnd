
package com.myportfoliona.nahuel.arias.Security.Service;

import com.myportfoliona.nahuel.arias.Security.Entity.Rol;
import com.myportfoliona.nahuel.arias.Security.Enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myportfoliona.nahuel.arias.Security.Repository.IRolRepository;


@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepository.save(rol);
    }
}