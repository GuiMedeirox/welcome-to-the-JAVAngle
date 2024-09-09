import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class meetingStreams5 {
    static Random rd = new Random();
    public static void main(String[] args) {
        List<Optional<Ticket>> tickets;
        List<Ticket> list = new ArrayList<>(
            List.of(
                new Ticket("Alice", true, 1, 5),
                new Ticket("Bob", false, 2, 10),
                new Ticket("Charlie", true, 3, 15),
                new Ticket("Diana", false, 4, 7),
                new Ticket("Eve", true, 5, 12),
                new Ticket("Frank", false, 6, 9),
                new Ticket("Grace", true, 7, 3),
                new Ticket("Heidi", false, 8, 11),
                new Ticket("Ivy", true, 9, 4),
                new Ticket("Jack", false, 10, 8)
            )
        );



        var list2 = list.stream()
                        .filter(s -> s.isConfirmed)
                        .collect(Collectors.toList());

        list2.sort( (a1, a2) -> a1.name.compareTo(a2.name) );

        System.out.println(list2);

        System.out.println("-------------------");
        list.stream()
                .filter(s -> s.name.equalsIgnoreCase("alice"))
                .findAny()
                .ifPresentOrElse(System.out::println, () -> System.out.println("there are no people with this name"));

        System.out.println("-------------------");

        System.out.println(
                list.stream()
                        .filter( s -> s.isConfirmed)
                        .map(s -> s.name)
                        .reduce(" ", (a, b) -> a +" " +b)
        );

        System.out.println("-------------------");

        tickets = Stream.generate(Ticket::getInstance)
                .limit(10)
                .toList();

        tickets.forEach(s -> s.ifPresentOrElse(System.out::println, () -> System.out.println("empty option")) );

    }

    static class Ticket{ 
        private String name; 
        private Boolean isConfirmed; 
        private int row; 
        private int col;

        static Optional<Ticket> getInstance(){
            if(rd.nextInt(1,3)==1){
                Ticket t = new Ticket("John", true, 1, 1);
                return Optional.of(t);
            }else{
                return Optional.empty();
            }

        }

        public Ticket(String n, Boolean ic, int r, int c){
            this.name=n; 
            this.isConfirmed=ic; 
            this.row=r; 
            this.col=c; 
        }

        @Override
        public String toString(){
            return "{" +name +" | " +isConfirmed +" | " +row  +" | " +col  +"}";
        }
    }
}
