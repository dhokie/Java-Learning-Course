package JavaStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by TSI on 5/11/2018.
 */
public class String {

    public static void main(java.lang.String args[]){

        //String Concatenation
        java.lang.String str1 = "Rock";
        java.lang.String str2 = "Star";
        //Method 1 : Using concat
        java.lang.String str3 = str1.concat(str2);
        System.out.println(str3);
        //Method 2 : Using "+" operator
        java.lang.String str4 = str1 + str2;
        System.out.println(str4);

        java.lang.String sample = "RockStar";

        //Length of a String
        System.out.println("Length of String: " + sample.length());

        //Character of a given Index
        System.out.println("Character at position 5: " + sample.charAt(5));
        //Index of a given character
        System.out.println("Index of character 'S': " + sample.indexOf('S'));

        //Compare to a String
        System.out.println("Compare To 'ROCKSTAR': " + sample.compareTo("rockstar"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + sample.compareToIgnoreCase("ROCKSTAR"));

        //Check if String contains a sequence
        System.out.println("Contains sequence 'tar': " + sample.contains("tar"));
        //Check if ends with a particular sequence
        System.out.println("EndsWith character 'r': " + sample.endsWith("r"));

        //Replace Rock with the word Duke
        System.out.println("Replace 'Rock' with 'Duke': " + sample.replace("Rock", "Duke"));

        //Convert to LowerCase
        System.out.println("Convert to LowerCase: " + sample.toLowerCase());
        //Convert to UpperCase
        System.out.println("Convert to UpperCase: " + sample.toUpperCase());

        //Java Hashmap Example
        Map<java.lang.String, java.lang.String> objMap = new HashMap<>();
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put("Price", "85000");
        System.out.println("Elements of the Map:");
        System.out.println(objMap);

        //Remove a value from HashMap based on key
        HashMap<Integer, java.lang.String> map = new HashMap<Integer, java.lang.String>();
        map.put(1,"Java");
        map.put(2, "Python");
        map.put(3, "PHP");
        map.put(4, "SQL");
        map.put(5, "C++");
        System.out.println("Tutorial in Guru99: "+ map);
        // Remove value of key 5
        map.remove(2);
        System.out.println("Tutorial in Guru99 After Remove: "+ map);
    }
}
