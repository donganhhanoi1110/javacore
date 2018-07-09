package java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * Following are some of the important classes introduced in java.time package.
 * Local: Simplified date-time API with no complexity of timezone handling
 * Zoned: Spreciliazed date-time API to deal with various timezones.
 * ** ZonedDateTime example
 *  * ZonedDateTime class is a date-time with a time-zone in the ISO-8601 calendar system, such as
 *  2016-12-06T10:15:30+01:00 Europe/Paris
 *  * ZonedDateTime is an immutable representation of a date-time with a time-zone. This class stores all date and time fields, to a precision 
 *  of nanoseconds, and a time-zone, with a zone offset used to handle ambigous local date-times.
 *  * In terms of design, this class should be viewed primarily as the combination of a LocalDateTime and a ZoneId.
 *  The ZoneOffset is a vital, especially a daylight savings overlap
 *  
 *  ZonedDateTime class is immutable and thread-safe
 * 
 * @author Minh Nguyen
 *
 */
public class ZonedDateTimeExample {

		public static void main(String[] args) {
			//get current date and time
			ZonedDateTime current = ZonedDateTime.now();
			System.out.println("Current Date Time with Zone: " + current);
			
			//get date alone
			LocalDate date = current.toLocalDate();
			System.out.println("Current Date: " + date);
			
			// get zone info
			System.out.println("Zone info: " + current.getZone() + " Zone ID: " + current.getZone().getRules());
			
			//Extract Date properties
			System.out.println("Month: " + current.getMonthValue() + " Date of month: " 
					+ current.getDayOfMonth() + " Year: " + current.getYear());
			//Extract Time properties
			System.out.println("Hour: " + current.getHour() + " Minute: " + current.getMinute() 
					+ " Second: " + current.getSecond());
		}
}
