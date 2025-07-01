package com.nt.service;

import java.util.List;

import com.nt.entity.Artist;
import com.nt.entity.Movie;

public interface IMovieMgmtService {
	
	public String registerMovieAndArtist(List<Movie> list);	
	public String registerArtistAndMovie(List<Artist> list);
	public List<Movie> showMoviesAndArtist();
	public List<Artist> showArtistAndMovies();
	public String removeArtistsAndMovies(int mid,List<Integer> aids);
}
