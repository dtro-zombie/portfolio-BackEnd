/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Repository;

import com.myportfoliona.nahuel.arias.Entity.Hard;
import com.myportfoliona.nahuel.arias.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author arias
 */
  @Repository
public interface RProyecto extends JpaRepository<Proyecto,Integer>{

    public Optional<Proyecto> findByNombrePro(String nombrePro);
    public boolean existsByNombrePro(String nombrePro);
    
}
