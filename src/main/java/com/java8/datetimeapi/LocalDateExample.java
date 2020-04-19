package java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;

/**
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class LocalDateExample {

		public static void main(String[] args) {
			//get date alone
			LocalDate date = LocalDate.now();
			System.out.println("Current Date: " + date);
			
			//create date obj with values
			LocalDate date2 = LocalDate.of(2015, Month.APRIL, 22);
			System.out.println("Create new given date: " + date2);
			
			//get date on given year on 'n'th day
			LocalDate date3 = LocalDate.ofYearDay(2015, 200);
			System.out.println("Given 'n'th date of year: " + date3);
			
		}
}
