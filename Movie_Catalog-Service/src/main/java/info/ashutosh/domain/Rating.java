package info.ashutosh.domain;

public class Rating {

	private Long id;
	private Long movieId;
	private Float rating;

	public Rating() {
	}

	public Rating(Long id, Long movieId, Float name) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.rating = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

}
