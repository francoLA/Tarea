package com.example.demo.repositories;

import com.example.demo.entities.Film;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmRepository extends PagingAndSortingRepository<Film, Integer>{

}
