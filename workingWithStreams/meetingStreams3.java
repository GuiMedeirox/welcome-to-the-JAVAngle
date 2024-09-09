import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class meetingStreams3 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(List.of(1,2,1,3,1,4,1,5,1,6,3));
        List<String> list2 = new ArrayList<>(List.of("String", "Stringão", "Teste", "Testezão"));

        list.stream()
        .takeWhile(n -> n < 5 )
        //.peek(s -> System.out.println("-> " +s))
        .forEach(s -> System.out.println(s +" "));

        System.out.println("\n#######################################");

        list.stream()
            .filter(n -> n < 5)
            .forEach(s -> System.out.print(s +" "));

        System.out.println("\n#######################################");

        list.stream()
        .dropWhile(n -> n < 5)
        .forEach(System.out::print);
        
        System.out.println("\n#######################################");

        list2.stream()
        .peek(System.out::println)
        .map(s -> s.length())
        .peek(s -> System.out.println(s.getClass()))
        .forEach(s -> System.out.println(s));


    }
}