package com.grayMatter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date=new Date("07/19/24");//  mm/dd/yy
		System.out.println(date);
		
		
		//String to Date Conversion PARSING
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy",Locale.UK);
		String tDate="19-JUL-2025";
		Date dat1=sdf.parse(tDate);//parse exception because it can happen when cnvrtng string to date
		System.out.println("2025:::::"+dat1);
		
		//To get local date
		LocalDate loc=LocalDate.now();
		System.out.println(loc);
		
		loc=LocalDate.of(2024, 7, 23);
		System.out.println("date"+loc);
		
		//
		String pattern="2023-07-16";
		loc=LocalDate.parse(pattern);
		System.out.println("Conversion to loc parse"+loc);
		
//		 demonstrates how to parse a date string ("18-07-2024") into a LocalDate object using DateTimeFormatter.
		String myDate="18-07-2024";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    loc=LocalDate.parse(myDate,formatter);
	    System.out.println(loc);//2024-07-18 answer
	    
	    
	    
	    
	    //LocalDate functions
	    System.out.println(loc.getDayOfWeek());
	    System.out.println(loc.getDayOfMonth());
	    System.out.println(loc.getMonthValue());
	    System.out.println(loc.getDayOfYear());
	    
	    //LocalTime functions
	    LocalTime time=LocalTime.now();
	    System.out.println(time.getHour());
	    
	    LocalDateTime dt=LocalDateTime.now();
	    System.out.println();
	    
	    //Period between dates
	    String myjoin="2022-03-22";
	    LocalDate doj=LocalDate.parse(myjoin);
	    String myLeave="2024-07-18";
	    LocalDate dol=LocalDate.parse(myLeave);
	    Period pd=Period.between(doj, dol);
	    System.out.println("PERIOD      "+pd);
	    System.out.println("Total time of time worked "+pd.getYears()+" years "+pd.getMonths()
	    +" months "+pd.getDays()+" days ");
	    
		
		
		
		

	
	}
	

}
