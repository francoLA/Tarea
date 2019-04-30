package com.example.demo.repositories;

import com.example.demo.entities.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "http://localhost:8080")
public interface ActorRepository extends PagingAndSortingRepository<Actor, Integer> {


}
