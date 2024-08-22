import java.util.function.*;
import java.util.*;

class chainingLambdas{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(List.of("John", "Doe", "Carl", "Johnson"));


        UnaryOperator<String> unOp = String::toUpperCase;
        UnaryOperator<String> unOp2 = s -> s +" " +s; 
    
        Consumer<String> c1 = String::toUpperCase;
        Consumer<String> c2 = s -> s.concat("Oi");


    }

}