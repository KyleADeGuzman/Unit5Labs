//By: Kyle DeGuzman
public class Holiday {
	
	 private String nameofholiday;
	 private int dayofholiday;
	 private String monthofholiday;

	 public Holiday(String n, int d, String m) {
		 nameofholdiday = n;
		 dayofholiday = d;
		 monthofholiday = m;
	 }
		 public boolean inSameMonth(Holiday mon){
			 return this.month.equals(mon.monthofholiday);
		 }
		 
			 public static double avgDate(Holiday[] mon) {
				 int sum = 0;
				 for(int i = 0; i < mon.length; i++) {
				 sum = sum + mon[i].day;
				 }
				 return ((double) sum)/mon.length;
				}
			 
			 Holiday mon = new Holiday("Independence Day", 4, "July");
			 {
			}
		}

