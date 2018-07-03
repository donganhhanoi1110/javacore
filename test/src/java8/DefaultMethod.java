package java8;
/**
 * Java 8 introduces a new concept of default method implementation in interfaces. 
 * This capability is added for backward compatibility so that old interfaces can be used 
 * to leverage the lambda expression capability of Java 8.
 * For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method declaration. 
 * Thus, adding such method will simply break the collection framework implementations. 
 * Java 8 introduces default method so that List/Collection interface can 
 * have a default implementation of forEach method, and the class 
 * implementing these interfaces need not implement the same.
 * 
 * 
 * @author mnguyen74
 *
 */
public class DefaultMethod {
	public static void main(String[] args) {
		Car car = new Car();
		car.print();
	}
}

interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle!");
	}
	
	static void bowHorn() {
		System.out.println("Blowing Horn!");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle, FourWheeler {

	@Override
	public void print() {
		//Second solution is to call the default method of the 
		//specified interface using super.
		Vehicle.super.print();
	    FourWheeler.super.print();
	    Vehicle.bowHorn();
		
		//First solution is to create an own method that overrides
		//the default implementation.
	    System.out.println("I am a car!");
	}
	
}
