
package com.myportfoliona.nahuel.arias.Repository;

import com.myportfoliona.nahuel.arias.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author arias
 */

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer>{
    
    public Optional<Persona> findBynombre(String nombre);
    public boolean existsBynombre(String nombre);

    
}
