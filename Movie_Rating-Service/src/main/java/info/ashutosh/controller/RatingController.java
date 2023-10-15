package info.ashutosh.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.ashutosh.domain.Rating;
import info.ashutosh.domain.Ratings;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@GetMapping(value = "/{userId}")
	public Ratings getUserInfo(@PathVariable Long userId) {

		// This is Dummy data for Movie's Rating which User gave.
		// Get this Data by Calling External API getMovieRatingByUserId(Long userId)
		// (Movie_Rating-Service)
		// Parameters Rating(Id of Entity itself, MovieId,Rating Float)
		List<Rating> asList = Arrays.asList(
				new Rating(1L, 1L, 1.06F), // 4th parameter would be userFId
				new Rating(2L, 2L, 2.6F), 
				new Rating(3L, 3L, 3.09F));

		Ratings ratings = new Ratings();
		ratings.setRatings(asList);
		return ratings;

	}

}