
package com.myportfoliona.nahuel.arias.Security.Repository;

import com.myportfoliona.nahuel.arias.Security.Entity.Rol;
import com.myportfoliona.nahuel.arias.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author arias
 */
@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}