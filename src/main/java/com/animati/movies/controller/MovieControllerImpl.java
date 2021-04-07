package com.animati.movies.controller;

import com.animati.movies.controller.data.request.MoviePersistDto;
import com.animati.movies.model.Movie;
import com.animati.movies.service.MovieService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieControllerImpl implements MovieController {

    private final MovieService movieService;

    public MovieControllerImpl(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    @GetMapping()
    public List<Movie> getAll(){
        return movieService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Movie getById(@PathVariable("id") Long movieId){
        Movie movie = movieService.getOne(movieId);
        return movie;
    }

    @Override
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Movie create(@Valid @RequestBody MoviePersistDto dto){
        ObjectMapper objectMapper = new ObjectMapper();

        Movie moviePersist = objectMapper.convertValue(dto, Movie.class);
        Movie moviePersitido = movieService.create(moviePersist);
        return moviePersitido;
    }

    @Override
    @PutMapping("/{id}")
    public Movie update(@PathVariable(value = "id") long movieId, @RequestBody MoviePersistDto moviePersistDto){
        Movie movie = moviePersistDto.convert(movieId);
        return  movieService.update(movie);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long movieId) throws Exception {
        movieService.delete(movieId);
    }

}
