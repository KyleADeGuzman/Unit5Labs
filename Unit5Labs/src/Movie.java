//By: Kyle DeGuzman
public class Movie {
	 private String titleofmov;
	 private String studioofmov;
	 private String ratingofmov;
	 
	//constructor for the class movie 
	 public Movie(String t, String s, String r) {
		 titleofmov = t;
		 studioofmov = s;
		 ratingofmov = r;
		}
	 
	//Constructor for the class movie
	 public Movie (String t, String s) {
		 titleofmov = t;
		 studioofmov = s;
		 ratingofmov = "PG";
		}
	 //method for getpg
	 public static Movie[] getPG(Movie[] mov) {
		 Movie[] pgMovie = new Movie[mov.length];
		 int Array = 0;
		 for (int i = 0; i < mov.length; i++) {
		 	if (mov[i].rating.equals("PG")) {
		 		pgMovie[Array] = mov[i];
		 		Array++;
		 		}
		 }
		 return pgMovie;
		}
	 //intance of the class movie
	 Movie mov = new Movie("Casino Royale","Eon Productions","PG-13"); 
		
}
