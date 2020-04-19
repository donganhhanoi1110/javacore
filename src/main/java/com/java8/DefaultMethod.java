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
 * ** When working with multiple inheritance
 * 1. If we have 2 interfaces: Interface1 with default method() - Interface2 with just method() signature
 * => If any class implements both above interfaces => method() becomes abstract method. We have to implement
 * method() in the implementation class.
 * 2. If we have 2 interfaces, both are having default method() with different implementation
 * => If any class implements both above interfaces => so we have to implement method()
 * 3. If we want to call the particular default emthod implementation
 * => call like <InterfaceName>.super.<MethodName>()
 * 4. If we have 2 interfaces, both are having same default method with different implementation 
 * (Interface1 and Interface2). But one extends from other like Interface2 extends Interface1
 * => Interface2 overrides method() from Interface1
 * 5. What is the difference between abstract class and interface?
 * Abstract class can have constructor, where you need an object to call the methods in subclass.
 * But in case of default method without any reference you can invoke the interface method, like
 * <InterfaceName>.super.<MethodName>()
 * 
 * 
 * @author mnguyen74
 * @2018 https://java.hardibee.com @Copyright
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
