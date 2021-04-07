package com.animati.movies.service;

import com.animati.movies.repository.MovieRepository;
import com.animati.movies.model.Movie;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

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

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public void delete(Long movieId) {
        if (!movieRepository.existsById(movieId)){
            throw new NoResultException(String.format("Filme de código %d não localizado", movieId));
        }
        movieRepository.deleteById(movieId);
    }

    @Override
    public Movie update(Movie movie) {
        if (!movieRepository.existsById(movie.getId())){
            throw new NoResultException(String.format("Filme de código %d não localizado", movie.getId()));
        }
        return movieRepository.save(movie);
    }
}
