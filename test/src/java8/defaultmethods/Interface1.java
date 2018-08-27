package java8.defaultmethods;

import java.util.Random;

/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 *
 */
public interface Interface1 {
	
	// default method
	default void hello() {
		System.out.println("Hello From Interface1");
	}
	
	// static method
	static int count() {
		return new Random().nextInt(100);
	}
}
