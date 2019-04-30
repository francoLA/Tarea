package com.example.demo.services;


import com.example.demo.entities.Actor;
import com.example.demo.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
@RestController
@RequestMapping(value = "/actors")

public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Actor> getAllActors(){
        return actorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ResponseBody
    public Optional<Actor> findById(@PathVariable("id") Integer id){
        return this.actorRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/create")
    @ResponseBody
    public Actor createActor(@RequestBody Actor actor){
        return this.actorRepository.save(actor);
    }

}
