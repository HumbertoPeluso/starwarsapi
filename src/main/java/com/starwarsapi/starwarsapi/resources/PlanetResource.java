/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.starwarsapi.starwarsapi.resources;

import com.starwarsapi.starwarsapi.models.Planet;
import com.starwarsapi.starwarsapi.repositories.PlanetRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author humberto
 */
@RestController
public class PlanetResource {
    
    @Autowired
    private PlanetRepository pr;
    
    @GetMapping(produces="application/json", value="/planet")
    public @ResponseBody Iterable<Planet> listOfPlanet(){
        
        Iterable<Planet> listOfPlanet = pr.findAll();
        return listOfPlanet;
    }
    
    
    
    @GetMapping(produces="application/json", value="/planet/id/{id}")
    public @ResponseBody Planet searchById(@PathVariable("id") int id){
     
        Iterable<Planet> listOfPlanet = pr.findAll();
        for(Planet planet : listOfPlanet)
            if(planet.getId()==id)
                return planet;
        return null;
    }
    
    @GetMapping(produces="application/json", value="/planet/name/{name}")
    public @ResponseBody Planet searchByName(@PathVariable("name") String name){
        
        Iterable<Planet> listOfPlanet = pr.findAll();
        for(Planet planet : listOfPlanet)
            if(planet.getName().equals(name))
               return planet;
        return null;
    }
    
    @PostMapping(value="/planet")
    public Planet createPlanet(@RequestBody @Valid Planet planet){
        return pr.save(planet);
    }
    
     @PostMapping(value="/planet/saves")
    public Iterable<Planet> createLisOfPlanet(@RequestBody @Valid Iterable<Planet> listOfPlanet){
        return pr.saveAll(listOfPlanet);
    }
    
    @DeleteMapping(value="/planet")
    public Planet deletePlanet(@RequestBody Planet planet){
         pr.delete(planet);
         return planet;
    }
    
    @DeleteMapping(value="/planet/id/{id}")
    public Planet deletePlanetById(@PathVariable("id") int id){
          
        Iterable<Planet> listOfPlanet = pr.findAll();
        for(Planet planet : listOfPlanet)
            if(planet.getId()==id){
                pr.delete(planet);
                return planet;
            }    
          return null;
    }
}
