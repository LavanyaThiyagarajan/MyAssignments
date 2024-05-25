package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class cap_TodaysDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate todaydate=	LocalDate.now();
		System.out.println("today date: "+todaydate);
		
		
		///to get this Pattern
		
		LocalDate todaydate1=	LocalDate.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
String formatdate=		todaydate1.format(formatter);
		System.out.println("formatted pattern: " +formatdate);
		
		//yesterday's date
		LocalDate todaydate2=	LocalDate.now();
LocalDate yesterdaydate=		todaydate2.minusDays(1);
		System.out.println("today date: " +yesterdaydate);
		
		//yesterday date with pattern
		
		LocalDate todaydate3=	LocalDate.now();
		LocalDate yesterdaydate1=		todaydate3.minusDays(1);
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
String formatdate1=		yesterdaydate1.format(formatter1);
		System.out.println("formatted pattern: " +formatdate1);
		
		
		
	}

}
