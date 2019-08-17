package com.algorithm;
import java.io.*;
import java.util.*;

/**
 * Crossover Testing
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 *
 * Print out A B C ... Z .. AB AC ... AZ .. BA BB BC ...
 * 
 */
public class Tester {

    public static void main(String[] args) throws IOException
    {
        int n = 750;
        List<String> result = columnNames(n);
        
        System.out.println(String.join(", ", result));
        
    }
    
    static List<String> columnNames(int n) 
    {
        List<String> result = new ArrayList<String>();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        if (n <= 0) throw new IndexOutOfBoundsException("Index must be > 0");
        for (int i=1; i <= n ; i++) {
        	if (i <= alphabet.length) {
        		result.add(Character.toString(alphabet[i -1]));
        	} else {
        		int index = i;
        		StringBuffer sb = new StringBuffer();
        	    while (index > 0) {
        	        sb.insert(0, alphabet[--index % alphabet.length]);
        	        index /= alphabet.length;
        	    }
        	    result.add(sb.toString());
            }
        }
        
        return result;
    }
    
}
