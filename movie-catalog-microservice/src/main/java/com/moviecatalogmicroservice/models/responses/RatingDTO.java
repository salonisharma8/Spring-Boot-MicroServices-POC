package com.moviecatalogmicroservice.models.responses;

public class RatingDTO {
	private String movieId;
	private Integer rating;
	
	public RatingDTO() {
		super();
	}

	public RatingDTO(String movieId, Integer rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "RatingDTO [movieId=" + movieId + ", rating=" + rating + "]";
	}
}
