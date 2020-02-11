//By: Kyle DeGuzman
public class Movie {
	 private String title;
	 private String studio;
	 private String rating;
	 
	 public Movie(String t, String s, String r) {
		 title = t;
		 studio = s;
		 rating = r;
		}
	 
	 public Movie (String t, String s) {
		 title = t;
		 studio = s;
		 rating = "PG";
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
