package info.ashutosh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.ashutosh.domain.Movie;
import info.ashutosh.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService movieService;

	@RequestMapping("/{userId}")
	public Movie getMovieByUserId(@PathVariable Long userId) {
		return movieService.getMovieByUserId(userId);

	}

}
