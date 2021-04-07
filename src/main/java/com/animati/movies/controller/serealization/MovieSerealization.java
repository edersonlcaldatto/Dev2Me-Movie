package com.animati.movies.controller.serealization;

import com.animati.movies.controller.data.response.MovieResponseDto;
import com.animati.movies.model.Movie;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.modelmapper.ModelMapper;

import java.io.IOException;

public class MovieSerealization extends JsonSerializer<Movie> {

    private final ModelMapper modelMapper;

    public MovieSerealization(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public void serialize(Movie movie, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        MovieResponseDto movieResponseDto = modelMapper.map(movie, MovieResponseDto.class);
        jsonGenerator.writeObject(movieResponseDto);
    }
}
