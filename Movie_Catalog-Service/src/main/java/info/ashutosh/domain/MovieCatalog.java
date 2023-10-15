package info.ashutosh.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieCatalog {

	private User user;
	private List<Movie> movies;

	public MovieCatalog(User user, List<Movie> movies) {
		super();
		this.user = user;
		this.movies = movies;
	}

	public MovieCatalog() {
	}

}
