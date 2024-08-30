import java.util.ArrayList;
import java.util.List;

public class meetingStreams3 {
    public static void main(String[] args) {
        
        @SuppressWarnings("removal")
        List<Integer> list = new ArrayList<>(List.of(new Integer("1"), new Integer("2"), new Integer("1"), new Integer("3"), new Integer("1"), 
        new Integer("4"), new Integer("1"), new Integer("5"), new Integer("1"), new Integer("6"), new Integer("3")));


        list.stream()
        .takeWhile(n -> n < 5)
        .forEach(s -> System.out.print(s +" "));

        System.out.println("\n#######################################");

        list.stream()
            .filter(n -> n < 5)
            .forEach(s -> System.out.print(s +" "));

        System.out.println("\n#######################################");

        list.stream()
        .dropWhile(n -> n < 4)
        .forEach(s -> System.out.print(s +" "));



    }
}
