package java8;

/**
 * Functional Interface 
 * @author Minh Nguyen
 *
 */
@FunctionalInterface
public interface MyFunctionalInterface {
	
	void printMessage();
	
	default void printHello() {
		System.out.println("Hello - MyFunctionalInterface.");
	}
}

