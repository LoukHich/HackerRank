import java.math.BigDecimal;
import java.text.DateFormatSymbols;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Main {
	
	 public static String findDay(int month, int day, int year) {
	        Calendar cal = Calendar.getInstance();
	        cal.set(cal.YEAR,year);
	        cal.set(cal.MONTH,month);
	        cal.set(cal.DAY_OF_MONTH,day);
	        //Format f = new SimpleDateFormat("EEEE"); 
	        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase(); //f.format(cal.getTime()).toUpperCase()+" "+cal.getTime() ;
		// return LocalDate.of(year, month, day).getDayOfWeek().getDisplayName(null, US);  
	                  
	    }
 public static void main(String[] args)  {
	
	 
	 System.out.println(findDay(2, 13, 2001));
	 System.out.println(new BigDecimal(.2).compareTo(new BigDecimal(0.2)));
	 
	 // System.out.println(findDay(02,13,2001));
	// String dayNames[] = new DateFormatSymbols().getWeekdays();  
	// Calendar date = Calendar.getInstance(); 
	 //date.set(Calendar.D, 1);
	// System.out.println("Today is "+ date.get(Calendar.DAY_OF_WEEK));  
	// Calendar clan =  Calendar.getInstance();
	// clan.add(clan.DAY_OF_WEEK, 1);
	 //System.out.println(clan.get(Calendar.HOUR_OF_DAY));
	 //clan.add(Calendar.DATE,);
	//clan.set(clan.YEAR,2015);
//	clan.set(clan.MONTH, 7);
	//clan.set(clan.DAY_OF_MONTH,5);
	 //System.out.println(clan.get(clan.DAY_OF_WEEK));
	   
	// System.out.println(clan.getTime().getDay());
   /*int a  =45;
  //String str = Integer.toString(a);
   String str = String.valueOf(a);
  System.out.println(str);*/
	
	 //int x = 1;

	/* while (x <=7 ) {

	   System.out.println("in a loop "+x);
	   x ++;

	 }
	 System.out.println("out a loop "+x);
}*/
   }
}