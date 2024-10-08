import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

public class functionalInterfacesExamples {

    static Random rd = new Random();

    public static void main(String[] args) {

        Consumer<String> consumer2 = (a1) -> System.out.println(a1.toUpperCase());
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        consumer.accept("Hello");
        consumer2.accept("Hello");

        BiConsumer<String, String> biConsumer2 = (a1, a2) -> System.out.println(a1.toUpperCase() +" " +a2.length());
        BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s.toUpperCase() +" and " +s2.length());
            }
        };
        biConsumer2.accept("Hello", "World");
        biConsumer.accept("Hello", "World");

        Predicate<Integer> predicate1 = (i) -> i%2==0;
        Predicate<Integer> predicate2 = new Predicate<Integer>(){

            @Override
            public boolean test(Integer i){
                return i%2==0;
            }
        };

        System.out.println(predicate1.test(10));
        System.out.println(predicate2.test(5));

        BiPredicate<Integer, String> biPredicate = (a, b) -> a%2 == 0 && b.length()%2==0;
        System.out.println(biPredicate.test(10,"Avocado"));

        BiPredicate<Integer, String> biPredicate2 = new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer i, String s) {
                return i%2!=0  && s.length()%2==0;
                //return true if I is

            }
        };
        System.out.println(biPredicate2.test(rd.nextInt(1,101), "LaMacarena"));

        Supplier<Scanner> getScanner = new Supplier<Scanner>() {
            @Override
            public Scanner get() {
                return null;
            }
        };

    }
}
