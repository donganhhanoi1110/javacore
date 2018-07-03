package java8.methodreference;

import java.util.ArrayList;
import java.util.List;

public class StaticMethodReference {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Minh Nguyen");
		list.add("Ngan Pham");
		
		//print the list elements in normal way
		System.out.println("-- Prior to Java 8 --");
		for (String str : list) {
			System.out.println(str);
		}
		
		//In Method Reference way
		System.out.println("-- Method Reference --");
		list.forEach(StaticMethodReference::print);
		
		//In Lambda Expression way
		System.out.println("-- Lambda Expression --");
		list.forEach((str) -> StaticMethodReference.print(str));
	}
	/**
	 * This is statid method to be used in method reference and lambda expression
	 * @param str
	 */
	public static void print(String str) {
		System.out.println(str);
	}
}
