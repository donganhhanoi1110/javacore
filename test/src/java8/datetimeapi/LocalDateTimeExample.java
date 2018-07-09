package java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Following are some of the important classes introduced in java.time package.
 * Local: Simplified date-time API with no complexity of timezone handling
 * Zoned: Spreciliazed date-time API to deal with various timezones.
 * ** LocalDateTime example
 * LocalDateTime is a date-time without a time-zone in the ISO-8601 calendar system, such as 2016-12-03T10:15:30
 * LocalDateTime is an immutable date-time object that represents a date-time, often viewed as
 * year-month-day-hour-minute-second. Other date and time fields, such as day-of-year, day-of-week and week-of-year,
 * can also be accessed. TIme is represented to nanosecond precision.
 *  
 *  LocalDateTime class is immutable and thread-safe
 * 
 * @author Minh Nguyen
 *
 */
public class LocalDateTimeExample {

		public static void main(String[] args) {
			//get current date and time
			LocalDateTime current = LocalDateTime.now();
			System.out.println("Current Date Time: " + current);
			
			//get date alone
			LocalDate date = current.toLocalDate();
			System.out.println("Current Date: " + date);
			
			//Extract Date properties
			System.out.println("Month: " + current.getMonthValue() + " Date of month: " 
					+ current.getDayOfMonth() + " Year: " + current.getYear());
			//Extract Time properties
			System.out.println("Hour: " + current.getHour() + " Minute: " + current.getMinute() 
					+ " Second: " + current.getSecond());
		}
}
