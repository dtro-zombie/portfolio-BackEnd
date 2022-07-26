/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Repository;

import com.myportfoliona.nahuel.arias.Entity.Hard;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

  @Repository

public interface RHard extends JpaRepository<Hard,Integer>{

    public Optional<Hard> findByNombreHard(String nombreProyecto);
    public boolean existsByNombreHard(String nombreHard);
  
}
