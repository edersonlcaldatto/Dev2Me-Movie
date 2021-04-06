package controller;

import controller.data.request.MoviePersistDto;
import controller.data.response.MovieResponseDto;
import model.Movie;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.MovieService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    private ModelMapper modelMapper;

    public MovieController(MovieService movieService, ModelMapper modelMapper) {
        this.movieService = movieService;
        this.modelMapper = modelMapper;
    }

    public MovieController(MovieService movieService) {this.movieService = movieService;}

    @GetMapping()
    public List<MovieResponseDto> getAll(){
        return null;
    }

    @GetMapping("/{id}")
    public MovieResponseDto getById(@PathVariable("id") Long movieId){
        Movie movie = movieService.getOne(movieId);
        return modelMapper.map(movie, MovieResponseDto.class);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public MovieResponseDto create(@Valid @RequestBody MoviePersistDto dto){
        Movie movie = modelMapper.map(dto, Movie.class);
        Movie moviePersitido = movieService.create(movie);
        return modelMapper.map(moviePersitido, MovieResponseDto.class);
    }

    @PutMapping("/{id}")
    public MovieResponseDto update(@PathVariable(value = "id") long movieId,
            @RequestBody MoviePersistDto movieDetails){
        return null;
    }

    @PutMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long movieId) throws Exception {

    }

}
