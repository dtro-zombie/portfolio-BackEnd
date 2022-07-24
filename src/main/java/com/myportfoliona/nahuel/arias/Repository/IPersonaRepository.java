
package com.myportfoliona.nahuel.arias.Repository;

import com.myportfoliona.nahuel.arias.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author arias
 */

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
