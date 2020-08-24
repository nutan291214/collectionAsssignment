package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*"Consider an ArrayList of Movie 
Movie has (int movieid, String moviename, List<String> actor)
Find “Amitabh bachchan has acted in how many movies.
*/
class Movie{
	private int movieId;
	private String movieName;
	private List<String> actor;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public List<String> getActor() {
		return actor;
	}
	public void setActor(List<String> actor) {
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + "]";
	}
	public Movie(int movieId, String movieName, List<String> actor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
	}
	
}
public class Que22MovieActor {
	public static void main(String[] args) {
		ArrayList<Movie> m=new ArrayList<>();
		List<String> al=new LinkedList<>();
		al.add("Amitabh Bacchan");
		al.add("Shahrukh khan");
		al.add("Kajal");
		al.add("Rithik Roshan");
		List<String> al1=new LinkedList<>();
		al1.add("Amitabh Bacchan");
		al1.add("Dipika Padukon");
		List<String> al2=new LinkedList<>();
		al2.add("Dipika Padukon");
		al2.add("Ranveer Singh");
		m.add(new Movie(1, "KKKG", al));
		m.add(new Movie(2, "Paa", al1));
		m.add(new Movie(3, "ramleela", al2));
		HashMap<String, Integer> hm=new HashMap<>();
		for(Movie mv:m) {
			List<String> actor=mv.getActor();
			for(String a:actor) {
				String anmae=a;
				if(hm.containsKey(anmae)) {
					int i=hm.get(anmae);
					i=i+1;
					hm.put(anmae, i);
				}
				else {
					hm.put(anmae, 1);
				}
			}
		}
		System.out.println(m);
		System.out.println(hm);
	}

}
