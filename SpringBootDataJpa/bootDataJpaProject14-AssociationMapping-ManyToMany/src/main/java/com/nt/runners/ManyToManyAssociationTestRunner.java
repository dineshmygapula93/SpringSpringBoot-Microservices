package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.BootDataJpaProject14AssociationMappingManyToManyApp;
import com.nt.service.IMovieMgmtService;

@Component
public class ManyToManyAssociationTestRunner implements CommandLineRunner {

	private final BootDataJpaProject14AssociationMappingManyToManyApp bootDataJpaProject14AssociationMappingManyToManyApp;
	@Autowired
	private IMovieMgmtService movieservice;

	ManyToManyAssociationTestRunner(
			BootDataJpaProject14AssociationMappingManyToManyApp bootDataJpaProject14AssociationMappingManyToManyApp) {
		this.bootDataJpaProject14AssociationMappingManyToManyApp = bootDataJpaProject14AssociationMappingManyToManyApp;
	}

	@Override
	public void run(String... args) throws Exception {

//		try {
//			Movie movie1 = new Movie("RRR", "UV", "Tollywood");
//			Movie movie2 = new Movie("Chava", "Dharma", "MollyWood");
//
//			Artist artist1 = new Artist("JuniorNTR", "hyd", "hero");
//			Artist artist2 = new Artist("Ramcharan", "hyd", "hero");
//			Artist artist3 = new Artist("VickyKoushal", "mumbai", "hero");
//			Artist artist4 = new Artist("rashmika", "bengulore", "heroine");
//			Artist artist5 = new Artist("Saif", "mumbai", "villan");
//
//			movie1.getArtistinfo().add(artist1);
//			movie1.getArtistinfo().add(artist2);
//			movie1.getArtistinfo().add(artist4);
//			movie1.getArtistinfo().add(artist5);
//
//			movie2.getArtistinfo().add(artist3);
//			movie2.getArtistinfo().add(artist4);
//			movie2.getArtistinfo().add(artist5);
//
//			artist1.getMoiveinfo().add(movie1);
//			artist2.getMoiveinfo().add(movie1);
//			artist3.getMoiveinfo().add(movie2);
//			artist4.getMoiveinfo().add(movie1);
//			artist4.getMoiveinfo().add(movie2);
//			artist5.getMoiveinfo().add(movie1);
//			artist5.getMoiveinfo().add(movie2);
//
//			List<Movie> movielist = Arrays.asList(movie1, movie2);
//			String msg = movieservice.registerMovieAndArtist(movielist);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			Movie movie1 = new Movie("Kgf3", "Hombolie", "kollywood");
//			Movie movie2 = new Movie("war2", "yashraj", "BollyWood");
//
//			Artist artist1 = new Artist("Hritik", "mumbai", "hero");
//			Artist artist2 = new Artist("jr.ntr", "hyd", "hero");
//			Artist artist3 = new Artist("yash", "bengulure", "hero");
//			Artist artist4 = new Artist("Tripti", "mumbai", "heroine");
//			Artist artist5 = new Artist("Ajay devagan", "mumbai", "villan");
//
//			movie1.getArtistinfo().add(artist3);
//			movie1.getArtistinfo().add(artist5);
//			movie1.getArtistinfo().add(artist4);
//			
//
//			movie2.getArtistinfo().add(artist1);
//			movie2.getArtistinfo().add(artist2);
//			movie2.getArtistinfo().add(artist5);
//
//			artist1.getMoiveinfo().add(movie2);
//			artist2.getMoiveinfo().add(movie2);
//			artist3.getMoiveinfo().add(movie1);
//			artist3.getMoiveinfo().add(movie2);
//			artist4.getMoiveinfo().add(movie1);
//			artist5.getMoiveinfo().add(movie1);
//			artist5.getMoiveinfo().add(movie2);
//
//			List<Artist> artistlist = Arrays.asList(artist1, artist2,artist3,artist4,artist5);
//			String msga = movieservice.registerArtistAndMovie(artistlist);
//			System.out.println(msga);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			movieservice.showMoviesAndArtist().forEach(movie->{
//				System.out.println("Parent ::"+movie);
//				Set<Artist> setchilds =movie.getArtistinfo();
//				setchilds.forEach(artist->{
//					System.out.println("Artist ::"+artist);
//				});
//				System.out.println("==================");
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			movieservice.showArtistAndMovies().forEach(artist->{
//				System.out.println("child Artist::"+artist);
//				Set<Movie> setparents =artist.getMoiveinfo();
//				setparents.forEach(movies->{
//					System.out.println("Movies ::"+movies);
//				});
//				System.out.println("==================");
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			String msgr = movieservice.removeArtistsAndMovies(104, List.of(110, 111));
			System.out.println(msgr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
