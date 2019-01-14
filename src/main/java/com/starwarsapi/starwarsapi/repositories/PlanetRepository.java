/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.starwarsapi.starwarsapi.repositories;

import com.starwarsapi.starwarsapi.models.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author humberto
 */
public interface PlanetRepository extends JpaRepository<Planet, String>{
    
}
