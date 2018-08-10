package java8.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java 8 provides a new method called forEach() to iterate over collecton framework.
 * It is defined in Iterable and Stream interface. It is a default method defined in the Iterable interface.
 * Collection classes which extends Iterable iterface can use forEach() loop to iterate elements.
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class ForEachMap {
	public static void main(String[] args) {
		Map<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "Washington, D.C.");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Viet Nam", "Ha Noi");
        
        System.out.println("-- Normal way Map");
        for (String key: countryMap.keySet()) {
        	System.out.println("Key: " + key + " Value: " + countryMap.get(key));
        }
        
        System.out.println("-- forEach() method Map");
        countryMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: "  + v));
        
        System.out.println("-- forEach() method Map");
        countryMap.forEach((k, v) -> {
        	k = k + "1";
        	v = v + "1";
        	System.out.println("Key: " + k + " Value: "  + v);
        });
        System.out.println("-- ----------LIST---- -------- --");
        List<String> list = new ArrayList<String>();
        list.add("Minh Nguyen");
        list.add("Ngan Pham");
        System.out.println("-- forEach() method List");
        list.forEach(str -> System.out.println(str));
        
	}
}
