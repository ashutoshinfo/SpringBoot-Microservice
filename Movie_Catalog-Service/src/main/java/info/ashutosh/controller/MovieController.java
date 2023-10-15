package info.ashutosh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.ashutosh.domain.MovieCatalog;
import info.ashutosh.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService movieService;

	@RequestMapping("/{userId}")
	public ResponseEntity<MovieCatalog>  getMovies(@PathVariable Long userId) {
		return new ResponseEntity<MovieCatalog>(movieService.getMovieCatalogByUserId(userId), HttpStatus.OK);

	}

}
