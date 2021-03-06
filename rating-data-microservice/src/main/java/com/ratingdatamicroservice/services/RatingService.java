package com.ratingdatamicroservice.services;

import com.ratingdatamicroservice.exceptions.RatingNotFoundException;
import com.ratingdatamicroservice.exceptions.UserNotFoundException;
import com.ratingdatamicroservice.models.Rating;
import com.ratingdatamicroservice.models.responses.RatingDTO;
import com.ratingdatamicroservice.models.responses.UserRating;

public interface RatingService {
	Rating createRating(RatingDTO RatingDTO, Long userId) throws UserNotFoundException;
	
	Rating getRatingByMovieId(String movieId) throws RatingNotFoundException;
	
	Rating updateRating(RatingDTO ratingDTO, Long ratingId) throws RatingNotFoundException;
	
	RatingDTO convertToRatingResponse(Rating rating);
	
	UserRating getUserRatings(Long userId) throws UserNotFoundException;
}