import java.util.function.*;
import java.util.*;

class chainingLambdas{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(List.of("John", "Doe", "Carl", "Johnson"));


        Consumer<String> c = s -> System.out.println(s.toUpperCase());
        Consumer<String> c2 = s -> System.out.println(s.concat(" - " +s));
    
        Function<String, String> unOp = String::toUpperCase; 
        Function<String, String> unOp2 = s -> s.concat(" Doe"); 
        
        Function<String, String> unOpFinal = unOp.compose(unOp2);

        System.out.println(unOpFinal.apply("John"));


    }
}