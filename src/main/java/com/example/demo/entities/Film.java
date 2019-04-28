package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "film")

public class Film {

    @Id
    @Column(name = "film_id", unique = true, nullable = false)
    private int film_id;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private String release_year;

    @Column(name = "language_id", nullable = false)
    private Integer language_id;

    @JsonIgnore
    @Column(name = "original_language_id")
    private Integer original_language_id;

    @Column(name = "rental_duration", nullable = false)
    private int rental_duration;

    @Column(name = "rental_rate", nullable = false)
    private long rental_rate;

    @Column(name = "length")
    private int length;

    @Column(name = "replacement_cost", nullable = false)
    private long replacement_cost;

    @Column(name = "rating")
    private String rating;

    @Column(name = "special_features")
    private String special_features;

    @Column(name = "last_update", nullable = false)
    private Timestamp last_update;

    public Film(){}

    @JsonIgnore
    @ManyToMany(mappedBy = "films")
    private List<Actor> actors;

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public void setOriginal_language_id(Integer original_language_id) {
        this.original_language_id = original_language_id;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(int original_language_id) {
        this.original_language_id = original_language_id;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public long getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(long rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(long replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
}
