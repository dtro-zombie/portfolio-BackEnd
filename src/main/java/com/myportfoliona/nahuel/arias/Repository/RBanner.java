/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myportfoliona.nahuel.arias.Repository;

import com.myportfoliona.nahuel.arias.Entity.Banner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author arias
 */
public interface RBanner extends JpaRepository<Banner,Integer>{

    public Optional<Banner> findBylinkBa(String linkBa);
    public boolean existsBylinkBa(String linkBa);
    
}
