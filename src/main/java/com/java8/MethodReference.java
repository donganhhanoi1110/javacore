package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class MethodReference {
	
	public static void main(String[] args) {
		List arr = new ArrayList();
		arr.add("Minh ");
		arr.add("Ngan ");
		
		arr.forEach( 
				System.out::println);
		
		arr.forEach(name -> 
		System.out.println(name));
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		System.out.println("Numbers: " + numbers);
		List<Integer> squaresList = getSquares(numbers);
		System.out.println("Before: " + squaresList);
		squaresList = numbers.stream().map( i 
				->
		i*i).distinct().collect(Collectors.toList());
	      System.out.println("After: " + squaresList);
	}
	
	  private static List<Integer> getSquares(List<Integer> numbers) {
	      List<Integer> squaresList = new ArrayList<Integer>();
			
	      for(Integer number: numbers) {
	         Integer square = new Integer(number.intValue() * number.intValue());
				
	         if(!squaresList.contains(square)) {
	            squaresList.add(square);
	         }
	      }
	      return squaresList;
	   }
}
