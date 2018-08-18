package java8.defaultmethods;
/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class DisplayClass implements DisplayInterface{
	public static void main(String[] args) {
		DisplayClass dClass = new DisplayClass();
		System.out.println("-- Not default method --");
		dClass.print("Display My Class");
		System.out.println("-- Default method --");
		dClass.hello();
	}

	//We have to provide method implementation for the method not default.
	@Override
	public void print(String message) {
		System.out.println(message);
	}
	
	@Override
	public void hello() {
		System.out.println("Hello From DisplayClass");
	}
}


