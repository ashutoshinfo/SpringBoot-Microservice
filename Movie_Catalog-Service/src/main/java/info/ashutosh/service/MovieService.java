package info.ashutosh.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import info.ashutosh.domain.Movie;
import info.ashutosh.domain.MovieCatalog;
import info.ashutosh.domain.User;

@Service
public class MovieService {

	@Autowired
	private RestTemplate restTemplate;

	public MovieCatalog getMovieCatalogByUserId(Long userId) {
		System.out.println(userId);

		// This is API call to User_Data-Service
		User user = restTemplate.getForObject("http://localhost:8081/user/{userId}", User.class, userId);

		// This is API call to User_Data-Service
		Ratings ratings = restTemplate.getForObject("http://localhost:8082/rating/{userId}", Ratings.class, userId);

		List<Movie> movies = ratings.getRatings().stream().map(in -> {
			Movie movie = restTemplate.getForObject("http://localhost:8083/movie/{userId}", Movie.class,
					in.getMovieId());
			movie.setRating(in.getRating());
			return movie;
		}

		).collect(Collectors.toList());

		return new MovieCatalog(user, movies);

	}

}
