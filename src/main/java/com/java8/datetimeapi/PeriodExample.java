package java8.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.stream.Stream;

/**
 * The Period class represents a quantity of time in terms of years, months and days. 
 * A Period uses date based values (years, months, days).
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class PeriodExample {

		public static void main(String[] args) {
			Long startTime = Instant.now().toEpochMilli();
			//get date alone
			LocalDate date = LocalDate.now();
			System.out.println("Current Date: " + date);
			
			//add 10 days to the current 
			LocalDate date2 = date.plusDays(10);
			System.out.println("Date after 10 days (plusDays) : " + date2);
			//add 10 days to the current 
			date2 = date.plus(Period.ofDays(10));
			System.out.println("Date after 10 days (plus(Period.ofDays()) : " + date2);
			
			  // what is the date a week before
	        LocalDate dateBeforeWeek = date.minus(Period.ofWeeks(3));
	        System.out.println("Date before 3 week: "+dateBeforeWeek);
	 
	        // no of days between two dates
	        Period periofDiff = Period.between(dateBeforeWeek, date2);
	        System.out.println("Days difference: "+periofDiff.getDays());
	        System.out.println("Months difference: "+periofDiff.getMonths());
	        
	        Long endTime = Instant.now().toEpochMilli();
	        Long elapsedTime = endTime - startTime;
	        System.out.println("Execution Time: " + elapsedTime);
	        Stream.of("String1","String2").toArray(String[]::new);
		}
}
