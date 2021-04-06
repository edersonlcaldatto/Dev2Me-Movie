package service;

import model.Movie;

public interface MovieService {

    Movie create(Movie movie);

    Movie getOne(Long movieId);
}
