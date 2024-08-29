import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class meetingStreams2 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(List.of(
            "Diana", "Jack", "Alice", "Frank", "Ivy",
            "Charlie", "Grace", "Hank", "Eve", "Bob"
        ));
        
        String[] array = {
            "Karen", "Liam", "Mona", "Nina", "Oscar",
            "Paul", "Quinn", "Rita", "Sam", "Tina"
        };

        
        list.sort((s1, s2) -> s1.compareTo(s2)); //ordenando a lista 
        
        System.out.println("ordered list -> " +list);


        Collections.shuffle(list); // bagunçando a lista
        System.out.println("-------------");
        System.out.println("shuffled list -> " +list);
        System.out.println("------------------");
        list.stream()
        .sorted()
        .forEach(s -> System.out.println(s +" "));

        System.out.println("######################################");

        Arrays.stream(array)
        .filter(s -> s.toLowerCase().charAt(0) <= 's')
        .forEach(s -> System.out.println(s +" "));

        System.out.println("######################################");

        Random rd = new Random();
        Stream.generate(() -> rd.nextInt(100))
            .limit(10)
            .forEach(s -> System.out.print(s +" "));

        System.out.println("\n######################################");

        
        IntStream.iterate(1, new IntUnaryOperator() {
                @Override
                public int applyAsInt(int a){
                    return a+1; 
                }    
            }
        )
            .limit(20)
            .filter(n -> n%2==0)
            .forEach(s -> System.out.print(s +" "));

        
        // IntStream.iterate(1, n -> n + 1)
        //     .limit(20)
        //     .filter(n -> n%2==0)
        //     .forEach(System.out::println);
        System.out.println("\n######################################");

        IntStream.iterate(1, new IntPredicate() {
            @Override
            public boolean test(int n){
                return n<=30;
            }
        }, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int n){
                return n+1;
            }
        } )
        .filter(n -> n%2!=0)
        .forEach(n -> System.out.print(n +" "));;

        // IntStream.iterate(1, n -> n <= 30, n -> n + 1)
        //     .filter(s -> s%2 != 0)
        //     .forEach(s -> System.out.print(s +" "));

    }
}
