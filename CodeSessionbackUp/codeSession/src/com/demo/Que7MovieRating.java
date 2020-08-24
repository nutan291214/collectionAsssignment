package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*"Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)"
*/
class MovieRate{
	private int movieId;
	private String moviename;
	private int rating;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "MovieRate [movieId=" + movieId + ", moviename=" + moviename + ", rating=" + rating + "]";
	}
	public MovieRate(int movieId, String moviename, int rating) {
		super();
		this.movieId = movieId;
		this.moviename = moviename;
		this.rating = rating;
	}
	
}
class Theatre{
	private int Theatreid;
	private String Theatrename;
	private String location;
	private MovieRate m;
	public int getTheatreid() {
		return Theatreid;
	}
	public void setTheatreid(int theatreid) {
		Theatreid = theatreid;
	}
	public String getTheatrename() {
		return Theatrename;
	}
	public void setTheatrename(String theatrename) {
		Theatrename = theatrename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public MovieRate getM() {
		return m;
	}
	public void setM(MovieRate m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Theatre [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location + ", m="
				+ m + "]";
	}
	public Theatre(int theatreid, String theatrename, String location, MovieRate m) {
		super();
		Theatreid = theatreid;
		Theatrename = theatrename;
		this.location = location;
		this.m = m;
	}
	
}
public class Que7MovieRating {
			public static void main(String[] args) {
				MovieRate m=new MovieRate(101,"Tanhaji",4);
				MovieRate m1=new MovieRate(102,"Dil Bechara",5);
				MovieRate m2=new MovieRate(103,"KKKG",2);
				MovieRate m3=new MovieRate(104,"3Idiots",4);
				MovieRate m4=new MovieRate(105,"Street Dancer",3);
				
				Theatre t=new Theatre(1, "Abhiruchi", "Navale Bridge", m1);
				Theatre t1=new Theatre(2, "City Pride", "Deccan", m2);
				Theatre t2=new Theatre(1, "E-Square", "Satara Road", m3);
				Theatre t3=new Theatre(1, "Mangala", "Manapa", m4);
				Theatre t4=new Theatre(1, "Laxmi narayan", "Swargate", m);
				ArrayList<Theatre> tal=new ArrayList<>();
				tal.add(t);
				tal.add(t1);
				tal.add(t2);
				tal.add(t3);
				tal.add(t4);
				System.out.println(tal);
				Comparator<Theatre> cc=new Comparator<Theatre>() {
					public int compare(Theatre o1, Theatre o2) {
				           if(o1.getM().getRating()==o2.getM().getRating()) {
				        	   return o1.getTheatrename().compareTo(o2.getTheatrename());
				           }
				           else {
				        	   return o1.getM().getRating()-o2.getM().getRating();
				           }
				};
				};
				 Collections.sort(tal,cc);
				 System.out.println(tal);

			}
}
