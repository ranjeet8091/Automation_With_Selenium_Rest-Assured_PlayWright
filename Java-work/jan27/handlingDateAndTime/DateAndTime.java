package handlingDateAndTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateAndTime {
	public static void main(String[] args) {
		LocalDate myobj=LocalDate.now();//Create a date objectSystem.out.
		System.out.println(myobj);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
//		LocalDateTime timeDate=LocalDateTime.now();
//		System.out.println(timeDate);
//		
//		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
//		String formattedDate=timeDate.format(myFormatObj);
//		System.out.println("After formatting: "+ formattedDate);
		
		
		
		DateTimeFormatter myFormatObj1=DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime= time.format(myFormatObj1);
		System.out.println("After formatting: "+ formattedTime);
//		---homework---
		// SDF homework	
        //DIY 
		
		
	}

}
