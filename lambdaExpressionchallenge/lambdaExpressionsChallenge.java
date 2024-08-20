/*
 * 
 * create an array of strings which is populated with first names in mixed cases, include at least one palindrome
 * 
 * use Arrays.setAll or List.replaceAll to change values in this array
 * transform all names to uppercase
 * add a last name that is the reverse of the first name 
 * remove the names that surname is equals to first name
 * 
 */

import java.util.ArrayList;
import java.util.List;

class lambdaExpressionsChallenge{

    public static String getReverse(String name){
        return new StringBuilder(name).reverse().toString();

    }
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("John", "aBrAhAm", "Theodore", "Bob", "Anna"));

        list.replaceAll(s -> s.toUpperCase());

        System.out.println("1. everything to uppercase");
        System.out.println(list);

        System.out.println("2. add a last name that is the reverse of the first name");
        list.replaceAll( s -> s += ' ' +getReverse(s));
        System.out.println(list);
        
        System.out.println("3. remove the names that surname is equals to firstname");
        list.removeIf(s -> s.split(" ")[0].equalsIgnoreCase(s.split(" ")[1]) );
        System.out.println(list);

    }
 }