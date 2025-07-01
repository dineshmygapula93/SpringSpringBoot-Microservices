package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.entity.Movie;
import com.nt.repository.IArtistRepository;
import com.nt.repository.IMovieRepository;

import jakarta.transaction.Transactional;

@Service
public class MovieMgmtService implements IMovieMgmtService {

	@Autowired
	private IMovieRepository movierepo;
	@Autowired
	private IArtistRepository artistrepo;

	@Override
	public String registerMovieAndArtist(List<Movie> list) {
		List<Movie> savedlist = movierepo.saveAll(list);
		return savedlist.size() + " no of movies and their artists are saved";
	}

	@Override
	public String registerArtistAndMovie(List<Artist> list) {
		List<Artist> savedalist = artistrepo.saveAll(list);
		return savedalist.size() + " no of artists and their movies are saved";
	}

	@Override
	public List<Movie> showMoviesAndArtist() {
		return movierepo.findAll();
	}

	@Override
	public List<Artist> showArtistAndMovies() {
		return artistrepo.findAll();
	}

	@Override
	@Transactional
	public String removeArtistsAndMovies(int mid, List<Integer> aids) {

		Movie movie = movierepo.findById(mid).orElseThrow(() -> new IllegalArgumentException("Invalid id"));
		
		List<Artist>  listArtists=artistrepo.findAllById(aids);
		movie.getArtistinfo().removeAll(listArtists);
		movierepo.save(movie);

		return  aids+"  Artits are  removed from the  mid "+movie;
	}

}
