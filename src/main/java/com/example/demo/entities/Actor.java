package com.example.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @Column(name = "actor_id", unique = true, nullable = false)
    private int actor_id;

    @Column(name = "first_name", nullable = false, length = 45)
    private String first_name;

    @Column(name = "last_name", nullable = false, length = 45)
    private String last_name;

    @Column(name = "last_update", nullable = false)
    private Timestamp last_update;

    @ManyToMany
    @JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "actor_id"), inverseJoinColumns = @JoinColumn(name = "film_id"))
    private List<Film> films;

    public Actor(){}

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
}
