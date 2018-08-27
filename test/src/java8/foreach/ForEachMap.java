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
		System.out.println("------------MAP------------");
		Map<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "Washington, D.C.");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Viet Nam", "Ha Noi");
        
        System.out.println("-- Normal way Map prior to Java 8");
        for (String key: countryMap.keySet()) {
        	System.out.println("Key: " + key + ", Value: " + countryMap.get(key));
        }
        
        System.out.println("-- forEach() method Map after Java 8");
        countryMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: "  + v));
        
        System.out.println("-- forEach() method Map with if condition");
        countryMap.forEach((k, v) -> {
        	if ("USA".equals(k)) {
        		k = k.toUpperCase();
        		v = v.toUpperCase();
        	} else {
        		k = k.toLowerCase();
        		v = v.toLowerCase();
        	}
        	System.out.println("Key: " + k + ", Value: "  + v);
        });
        System.out.println("------------LIST------------");
        List<String> list = new ArrayList<String>();
        list.add("Minh Nguyen");
        list.add("Ngan Pham");
        System.out.println("-- forEach() method List");
        list.forEach(str -> System.out.println(str));
        
	}
}
