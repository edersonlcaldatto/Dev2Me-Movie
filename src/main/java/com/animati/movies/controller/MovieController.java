package com.animati.movies.controller;

import com.animati.movies.controller.data.request.MoviePersistDto;
import com.animati.movies.model.Movie;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface MovieController {

    @Operation(summary = "Retorna a lista de Filmes cadastrados.")
    @GetMapping()
    List<Movie> getAll();

    @Operation(summary = "Retorna o filme com base no parametro informado.")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "404",
                    content = @Content(
                            mediaType = "aplication/json",
                            examples = @ExampleObject(
                                    value = "codigo: X_100"
                            )
                    )
            )
    })
    @GetMapping("/{id}")
    Movie getById(@PathVariable("id") Long movieId);

    @Operation(summary = "Insere um novo registro")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    Movie create(@Valid @RequestBody MoviePersistDto dto);

    @Operation(summary = "Atualiza o filme conforme o parametro informado")
    @PutMapping("/{id}")
    Movie update(@PathVariable(value = "id") long movieId,
            @RequestBody MoviePersistDto movieDetails);

    @Operation(summary = "Excluí o filme conforme parametro informado")
    @DeleteMapping("/{id}")
    void delete(@PathVariable(value = "id") Long movieId) throws Exception;
}
