package info.ashutosh.service;

import org.springframework.stereotype.Service;

import info.ashutosh.domain.Movie;

@Service
public class MovieService {

	public Movie getMovieByUserId(Long movieId) {
		return new Movie(movieId, "Movie-name", "Movie-description");

	}

}
