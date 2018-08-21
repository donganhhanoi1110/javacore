package java8.defaultmethods;
/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class MyClass implements Interface1, Interface2, Interface3{
	
	public static void main(String[] args) {
			MyClass myClass = new MyClass();
			myClass.hello();
			myClass.print();
	}

	@Override
	public void hello() {
		System.out.println("Hello from MyClass");
		Interface1.super.hello();
		Interface2.super.hello();
	}

}


