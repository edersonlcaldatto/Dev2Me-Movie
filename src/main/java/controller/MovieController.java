package controller;

import model.Movie;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {


    @GetMapping("/movies")
    public List<Movie> getAll(){
        return null;
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getById(@PathVariable(value = "id") Long movieId){
        return null;
    }

    @PostMapping("/movies")
    public Movie create(@RequestBody Movie movie){
        return null;
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> update(@PathVariable(value = "id") long movieId, @RequestBody Movie movieDetails){
        return null;
    }

    @PutMapping("/movies/{id}")
    public void delete(@PathVariable(value = "id") Long movieId) throws Exception {

    }

}
