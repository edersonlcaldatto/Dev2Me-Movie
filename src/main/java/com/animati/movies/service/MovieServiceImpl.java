package com.animati.movies.service;

import com.animati.movies.repository.MovieRepository;
import com.animati.movies.model.Movie;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie getOne(Long movieId) {
        return movieRepository.findById(movieId)
                .orElseThrow(() -> new NoResultException(String.format("Movie with code %d not found", movieId)));
    }
}
