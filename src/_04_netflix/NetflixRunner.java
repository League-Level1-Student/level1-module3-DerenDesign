package _04_netflix;

import javax.swing.JOptionPane;

public class NetflixRunner {
public static void main(String[] args) {
	Movie movie = new Movie("Minions", 5);
	Movie movie1 = new Movie("Secret Life with Pets", 4);
	Movie movie2 = new Movie("Top Gun", 3);
	Movie movie3 = new Movie("Cats", 1);
	Movie movie4 = new Movie("The 355", 2);
	movie.getTicketPrice();
	NetflixQueue que = new NetflixQueue();
	que.addMovie(movie);
	que.addMovie(movie1);
	que.addMovie(movie2);
	que.addMovie(movie3);
	que.addMovie(movie4);
	que.printMovies();
	JOptionPane.showMessageDialog(null, "The best movie is" + que.getBestMovie());
	JOptionPane.showMessageDialog(null, "The 2nd best movie is" + que.getMovie(1));
	
}
}
