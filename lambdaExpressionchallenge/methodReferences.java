import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class methodReferences {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("John", "Doe", "Abraham", "Lincoln"));
        
        list.forEach(System.out::println);
        list.replaceAll(String::toUpperCase);
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase(); //String::toUpperCase;

        System.out.println(unaryOperator.apply("John"));



        calculator(Integer::sum, 1, 2);
        
    }

    static <T> void calculator(BinaryOperator<T> operator, T v1, T v2){
        T result = operator.apply(v1, v2);
        System.out.println("result " +result);
    }


}
