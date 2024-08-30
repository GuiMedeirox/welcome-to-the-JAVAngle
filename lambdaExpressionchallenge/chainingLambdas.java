import java.util.function.*;
import java.util.*;

class chainingLambdas{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(List.of("John", "Doe", "Carl", "Johnson"));
        

        Function<String, String> unOp = String::toUpperCase; 
        Function<String, String> unOp2 = s -> s.concat(" Doe"); 

        Function<String, String> unOpFinal = unOp.compose(unOp2);

        System.out.println(unOpFinal.apply("John"));


    }
}