//By: Kyle DeGuzman
public class Movie {
	 private String titleofmov;
	 private String studioofmov;
	 private String ratingofmov;
	 
	 public Movie(String t, String s, String r) {
		 titleofmov = t;
		 studioofmov = s;
		 ratingofmov = r;
		}
	 
	 public Movie (String t, String s) {
		  titleofmov = t;
		 studioofmov = s;
		 ratingofmov = "PG";
		}
	 
	 public static Movie[] getPG(Movie[] mov) {
		 Movie[] pgMovie = new Movie[mov.length];
		 int newArrayIndex = 0;
		 for (int i = 0; i < mov.length; i++) {
		 if (mov[i].rating.equals("PG")) {
		 pgMovie[newArrayIndex] = mov[i];
		 newArrayIndex++;
		 }
		 }
		 return pgMovie;
		}
	 
	 Movie mov = new Movie("Casino Royale","Eon Productions","PG-13"); 
		
}
