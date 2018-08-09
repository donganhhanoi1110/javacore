package java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
		
		//In Anonymous Class way
		System.out.println("-- Anonymous Class --");
		list.forEach( new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		});
		
		//In Lambda Expression way
		System.out.println("-- Lambda Expression --");
		list.forEach((str) -> MethodReference.print(str));
				
		//In Method Reference way
		System.out.println("-- Method Reference --");
		list.forEach(MethodReference::print);
		
		
	}
}
