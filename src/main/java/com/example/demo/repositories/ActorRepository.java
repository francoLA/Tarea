package com.example.demo.repositories;

import com.example.demo.entities.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ActorRepository extends PagingAndSortingRepository<Actor, Integer> {


}
