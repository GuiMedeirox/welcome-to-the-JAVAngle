import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
public class meetingStreams4 {
    public static void main(String[] args) {
        
        List<Integer> list2 = new ArrayList<>(List.of(1,2,1,3,1,4,1,5,1,6,3));
        List<String> list = new ArrayList<>( List.of( "Anna","Michael","Sophie","Daniel","Emily","Jacob","Olivia","Lucas","Emma","David", "Eve" ));
        List<Ticket> list3 = new ArrayList<>(
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

        var q = list.stream()
        .sorted()
        .peek(s -> System.out.println(s))
        .map(s -> s.length())
        .min((s1, s2) -> s1 - s2);
        
        System.out.println(q.get());

        System.out.println("----------------------");

        System.out.println(list.stream()
        .sorted()
        .noneMatch(s -> s.length()==8)
        );
        
        System.out.println("----------------------");

        System.out.println(list3.stream()
        .filter(i -> i.isConfirmed == true)
        .peek(s -> System.out.println(s.name))
        .count());

        System.out.println("-----------------------");
        list3.stream()
            .map(s -> s.row)
            .peek(System.out::println)
            .filter(s -> s%2==0)
            .peek(s -> System.out.println(s +"linha par"))
            .count();

    }

    static class Ticket{ 
        private String name; 
        private Boolean isConfirmed; 
        private int row; 
        private int col; 

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
